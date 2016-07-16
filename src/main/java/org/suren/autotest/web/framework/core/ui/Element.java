/**
* Copyright © 1998-2016, Glodon Inc. All Rights Reserved.
*/
package org.suren.autotest.web.framework.core.ui;

/**
 * @author zhaoxj
 * @since jdk1.6
 * 2016年6月30日
 */
public interface Element {
	String getId();
	String getName();
	String getTagName();
	String getCSS();
	String getXPath();
	/**
	 * @return 超链接文本
	 */
	String getLinkText();
	/**
	 * @return 超链接部分文本
	 */
	String getPartialLinkText();
}