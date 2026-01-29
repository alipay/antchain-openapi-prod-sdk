// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiclaim.models;

import com.aliyun.tea.*;

public class Document extends TeaModel {
    // 参考分类接口中返回的分类结果
    /**
     * <strong>example:</strong>
     * <p>MEDICAL_EXPENSE_INVOICE</p>
     */
    @NameInMap("doc_type")
    public String docType;

    // 参考分类接口中返回的分类结果
    /**
     * <strong>example:</strong>
     * <p>医疗费用发票</p>
     */
    @NameInMap("doc_type_cn")
    public String docTypeCn;

    // 参考Extraction参数
    @NameInMap("extraction")
    public Extraction extraction;

    // 参考Page参数
    @NameInMap("pages")
    public java.util.List<Page> pages;

    public static Document build(java.util.Map<String, ?> map) throws Exception {
        Document self = new Document();
        return TeaModel.build(map, self);
    }

    public Document setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public Document setDocTypeCn(String docTypeCn) {
        this.docTypeCn = docTypeCn;
        return this;
    }
    public String getDocTypeCn() {
        return this.docTypeCn;
    }

    public Document setExtraction(Extraction extraction) {
        this.extraction = extraction;
        return this;
    }
    public Extraction getExtraction() {
        return this.extraction;
    }

    public Document setPages(java.util.List<Page> pages) {
        this.pages = pages;
        return this;
    }
    public java.util.List<Page> getPages() {
        return this.pages;
    }

}
