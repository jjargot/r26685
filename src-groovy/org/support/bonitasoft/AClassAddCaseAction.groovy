package org.support.bonitasoft

class AClassAddCaseAction {
	public String addCaseAction() {
		def illegalChars = ~/[\u0000-\u0008]|[\u000B-\u000C]|[\u000E-\u001F]|[\u007F-\u009F]/
		String arąęłźдчĀŸش = "arąęłźдчĀŸش";
		return "aaa" + arąęłźдчĀŸش;
	}
}
