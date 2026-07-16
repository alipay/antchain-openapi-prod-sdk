// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryIncomeEvaluationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 纳税人识别号
    @NameInMap("tax_no")
    public String taxNo;

    // 法人身份证号；原文/MD5/SHA256/SM3 四种形式
    @NameInMap("legal_person_id")
    public String legalPersonId;

    // 租户/调用方
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 业务流水号
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    // 接口版本号
    @NameInMap("version")
    public String version;

    public static QueryIncomeEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncomeEvaluationRequest self = new QueryIncomeEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncomeEvaluationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIncomeEvaluationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIncomeEvaluationRequest setTaxNo(String taxNo) {
        this.taxNo = taxNo;
        return this;
    }
    public String getTaxNo() {
        return this.taxNo;
    }

    public QueryIncomeEvaluationRequest setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
        return this;
    }
    public String getLegalPersonId() {
        return this.legalPersonId;
    }

    public QueryIncomeEvaluationRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public QueryIncomeEvaluationRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public QueryIncomeEvaluationRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
