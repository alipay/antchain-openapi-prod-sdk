// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseZftagreementsignRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 合约id
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 网商直付通代扣协议号
    @NameInMap("agreement_no")
    @Validation(required = true)
    public String agreementNo;

    // 实际签署协议的用户支付宝uid
    @NameInMap("alipay_user_id")
    public String alipayUserId;

    // 签署时间
    @NameInMap("sign_time")
    public String signTime;

    // 协议生效时间
    @NameInMap("valid_time")
    public String validTime;

    // 协议失效时间
    @NameInMap("invalid_time")
    public String invalidTime;

    // 租赁方金融科技租户id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 核验结果，1表示通过，-1表示不通过
    @NameInMap("agreement_status")
    @Validation(required = true)
    public Long agreementStatus;

    public static CreateLeaseZftagreementsignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseZftagreementsignRequest self = new CreateLeaseZftagreementsignRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseZftagreementsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseZftagreementsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseZftagreementsignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseZftagreementsignRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseZftagreementsignRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public CreateLeaseZftagreementsignRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public CreateLeaseZftagreementsignRequest setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public CreateLeaseZftagreementsignRequest setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public CreateLeaseZftagreementsignRequest setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

    public CreateLeaseZftagreementsignRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public CreateLeaseZftagreementsignRequest setAgreementStatus(Long agreementStatus) {
        this.agreementStatus = agreementStatus;
        return this;
    }
    public Long getAgreementStatus() {
        return this.agreementStatus;
    }

}
