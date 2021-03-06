package org.ionnic.core.support.layer;

public class FilterProxyConfig {

	private boolean ignoreHiddenMethod = true;

	private String hiddenMethodParam = "__method";

	private String encoding = "utf-8";

	private boolean forceEncoding = false;

	public String getEncoding() {
		return encoding;
	}

	public String getHiddenMethodParam() {
		return hiddenMethodParam;
	}

	public boolean isForceEncoding() {
		return forceEncoding;
	}

	public boolean isIgnoreHiddenMethod() {
		return ignoreHiddenMethod;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public void setForceEncoding(boolean forceEncoding) {
		this.forceEncoding = forceEncoding;
	}

	public void setHiddenMethodParam(String hiddenMethodParam) {
		this.hiddenMethodParam = hiddenMethodParam;
	}

	public void setIgnoreHiddenMethod(boolean ignoreHiddenMethod) {
		this.ignoreHiddenMethod = ignoreHiddenMethod;
	}

}
