// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiclaim.models;

import com.aliyun.tea.*;

public class Document extends TeaModel {
    // 参考分类接口中返回的分类结果
    /**
     * <strong>example:</strong>
     * <p>MEDICAL_EXPENSE_INVOICE</p>
     */
    @NameInMap("type")
    public String type;

    // 参考分类接口中返回的分类结果
    /**
     * <strong>example:</strong>
     * <p>医疗费用发票</p>
     */
    @NameInMap("type_cn")
    public String typeCn;

    // 细分的分类结果
    /**
     * <strong>example:</strong>
     * <p>TARGET_INVOICE_OUTPATIENT</p>
     */
    @NameInMap("sub_type")
    public String subType;

    // 细分的分类结果
    /**
     * <strong>example:</strong>
     * <p>门诊发票</p>
     */
    @NameInMap("sub_type_cn")
    public String subTypeCn;

    // 参考Extraction参数
    @NameInMap("extraction")
    public java.util.List<Extraction> extraction;

    // 参考Page参数
    @NameInMap("page")
    public java.util.List<Page> page;

    public static Document build(java.util.Map<String, ?> map) throws Exception {
        Document self = new Document();
        return TeaModel.build(map, self);
    }

    public Document setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Document setTypeCn(String typeCn) {
        this.typeCn = typeCn;
        return this;
    }
    public String getTypeCn() {
        return this.typeCn;
    }

    public Document setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public Document setSubTypeCn(String subTypeCn) {
        this.subTypeCn = subTypeCn;
        return this;
    }
    public String getSubTypeCn() {
        return this.subTypeCn;
    }

    public Document setExtraction(java.util.List<Extraction> extraction) {
        this.extraction = extraction;
        return this;
    }
    public java.util.List<Extraction> getExtraction() {
        return this.extraction;
    }

    public Document setPage(java.util.List<Page> page) {
        this.page = page;
        return this;
    }
    public java.util.List<Page> getPage() {
        return this.page;
    }

}
