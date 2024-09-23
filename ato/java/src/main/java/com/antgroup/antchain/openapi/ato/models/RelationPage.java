// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RelationPage extends TeaModel {
    // 分账关系id
    @NameInMap("relation_id")
    @Validation(required = true)
    public String relationId;

    // 分账公司名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 分账公司名称统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 审核状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 商户公司统一社会信用代码
    @NameInMap("subject_merchant_id")
    @Validation(required = true)
    public String subjectMerchantId;

    // 商户公司名称
    @NameInMap("subject_company_name")
    @Validation(required = true)
    public String subjectCompanyName;

    public static RelationPage build(java.util.Map<String, ?> map) throws Exception {
        RelationPage self = new RelationPage();
        return TeaModel.build(map, self);
    }

    public RelationPage setRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }
    public String getRelationId() {
        return this.relationId;
    }

    public RelationPage setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public RelationPage setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public RelationPage setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RelationPage setSubjectMerchantId(String subjectMerchantId) {
        this.subjectMerchantId = subjectMerchantId;
        return this;
    }
    public String getSubjectMerchantId() {
        return this.subjectMerchantId;
    }

    public RelationPage setSubjectCompanyName(String subjectCompanyName) {
        this.subjectCompanyName = subjectCompanyName;
        return this;
    }
    public String getSubjectCompanyName() {
        return this.subjectCompanyName;
    }

}
