
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfDomQuotaApplyInfo1;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domQuotaList" type="{http://po.edi.exchange.sinosure.com}ArrayOfDomQuotaApplyInfo1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "domQuotaList"
})
@XmlRootElement(name = "doEdiDomQuotaApply")
public class DoEdiDomQuotaApply {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDomQuotaApplyInfo1 domQuotaList;

    /**
     * 获取domQuotaList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomQuotaApplyInfo1 }
     *     
     */
    public ArrayOfDomQuotaApplyInfo1 getDomQuotaList() {
        return domQuotaList;
    }

    /**
     * 设置domQuotaList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomQuotaApplyInfo1 }
     *     
     */
    public void setDomQuotaList(ArrayOfDomQuotaApplyInfo1 value) {
        this.domQuotaList = value;
    }

}
