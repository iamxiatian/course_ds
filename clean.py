#!/usr/bin/python

import os, sys, shutil

TOBE_RM = ['.log', '.aux', '.out', '.snm', '.toc', '.vrb', '.nav', '.blg', '.bbl','.thm', '.auxlock', '.md5', '.idx', 'auto', '__pycache__']

def clean(path):
	"""
		clean latex generated temporary files
	"""
	removed_list = []
	files = os.listdir(path)
	for file_name in files:
		f = os.path.abspath(os.path.join(path, file_name))
		if os.path.isfile(f):
			ext = os.path.splitext(f)[-1]
			if (ext in TOBE_RM) or (ext.endswith("~")):
				print '** Remove file ', f
				os.remove(f)
				removed_list.append(f)
		elif os.path.isdir(f) and os.path.split(f)[-1] in TOBE_RM:
			print '** Remove dir ', f
			shutil.rmtree(f)
			removed_list.append(f)
	return removed_list 

def get_sub_dirs(path):
	dirs = []
	files = os.listdir(path)
	for file_name in files:
		f = os.path.abspath(os.path.join(path, file_name))
		if os.path.isdir(f) and not f.startswith('.') and not f.endswith('/.git'):
			dirs.append(f)
	return dirs

def process(path):
	"""
	scan path and its sub paths, remove latex generated temp files,
	and store them in list.
	"""
	total_rm_list = []
	print '        process dir ', path, '...'
	files = os.listdir(path)
	for file_name in files:
		f = os.path.abspath(os.path.join(path, file_name))
		if os.path.isfile(f):
			ext = os.path.splitext(f)[-1]
			if ext == '.tex':
				total_rm_list.extend(clean(path))
				break

	sub_dirs = get_sub_dirs(path)
	for dir in sub_dirs:
		total_rm_list.extend(process(dir))
	return total_rm_list

if __name__=='__main__':
	rm_list = process('.')
	print '-----------------------------'
	print len(rm_list), ' temp files are removed.'
	print '-----------------------------'
	for item in rm_list:
		print '  ==>', item

	print len(rm_list), ' temp files are removed.'
