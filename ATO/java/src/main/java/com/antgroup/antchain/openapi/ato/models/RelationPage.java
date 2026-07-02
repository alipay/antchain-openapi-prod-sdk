// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RelationPage extends TeaModel {
    // 分账关系id
    /**
     * <strong>example:</strong>
     * <p>1231234343423423</p>
     */
    @NameInMap("relation_id")
    @Validation(required = true)
    public String relationId;

    // 分账公司名称
    /**
     * <strong>example:</strong>
     * <p>xx公司</p>
     */
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 分账公司名称统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>912123asdq2131</p>
     */
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 审核状态
    /**
     * <strong>example:</strong>
     * <p>AUDIT_PASSED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 商户公司统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>123123122134wexx</p>
     */
    @NameInMap("subject_merchant_id")
    @Validation(required = true)
    public String subjectMerchantId;

    // 商户公司名称
    /**
     * <strong>example:</strong>
     * <p>xx公司</p>
     */
    @NameInMap("subject_company_name")
    @Validation(required = true)
    public String subjectCompanyName;

    // 支付渠道
    // ALIPAY
    // JDPAY
    /**
     * <strong>example:</strong>
     * <p>ALIPAY</p>
     */
    @NameInMap("pay_channel")
    public String payChannel;

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

    public RelationPage setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

}
