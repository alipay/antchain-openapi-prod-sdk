// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class SyncRiskEvaluationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    // 信贷用户的纳税人识别号或者身份证号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 授权订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 机构编码
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    public static SyncRiskEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRiskEvaluationRequest self = new SyncRiskEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public SyncRiskEvaluationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncRiskEvaluationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncRiskEvaluationRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public SyncRiskEvaluationRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public SyncRiskEvaluationRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public SyncRiskEvaluationRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SyncRiskEvaluationRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

}
