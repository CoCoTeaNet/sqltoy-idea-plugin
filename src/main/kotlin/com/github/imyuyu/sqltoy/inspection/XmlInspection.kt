package com.github.imyuyu.sqltoy.inspection

import com.intellij.util.xml.DomElement
import com.intellij.util.xml.highlighting.BasicDomElementsInspection
import com.intellij.util.xml.highlighting.DomElementAnnotationHolder
import com.intellij.util.xml.highlighting.DomHighlightingHelper

/**
 * sqlId not usages check
 */
class XmlInspection : BasicDomElementsInspection<DomElement>(DomElement::class.java) {

    override fun checkDomElement(
        element: DomElement?,
        holder: DomElementAnnotationHolder?,
        helper: DomHighlightingHelper?
    ) {
        super.checkDomElement(element, holder, helper)
    }

    override fun getStaticDescription(): String {
        return "Static XmlInspection"
    }
}