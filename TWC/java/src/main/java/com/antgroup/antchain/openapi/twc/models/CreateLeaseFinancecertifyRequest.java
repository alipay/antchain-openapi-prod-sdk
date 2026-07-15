// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseFinancecertifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 融资租赁合约id
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 直付通代扣协议号
    @NameInMap("agreement_no")
    @Validation(required = true)
    public String agreementNo;

    // 还款类型
    @NameInMap("rental_return_type")
    @Validation(required = true)
    public String rentalReturnType;

    // 认证类型
    @NameInMap("certify_way")
    @Validation(required = true)
    public String certifyWay;

    // 承租人姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 承租人身份证
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 人脸识别认证id
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 承租人支付宝uid
    @NameInMap("alipay_uid")
    @Validation(required = true)
    public String alipayUid;

    // 提前还款信息
    @NameInMap("rental_infos")
    @Validation(required = true)
    public java.util.List<FinanceCertifyRentalInfo> rentalInfos;

    public static CreateLeaseFinancecertifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseFinancecertifyRequest self = new CreateLeaseFinancecertifyRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseFinancecertifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseFinancecertifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseFinancecertifyRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseFinancecertifyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseFinancecertifyRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public CreateLeaseFinancecertifyRequest setRentalReturnType(String rentalReturnType) {
        this.rentalReturnType = rentalReturnType;
        return this;
    }
    public String getRentalReturnType() {
        return this.rentalReturnType;
    }

    public CreateLeaseFinancecertifyRequest setCertifyWay(String certifyWay) {
        this.certifyWay = certifyWay;
        return this;
    }
    public String getCertifyWay() {
        return this.certifyWay;
    }

    public CreateLeaseFinancecertifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateLeaseFinancecertifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateLeaseFinancecertifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CreateLeaseFinancecertifyRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public CreateLeaseFinancecertifyRequest setRentalInfos(java.util.List<FinanceCertifyRentalInfo> rentalInfos) {
        this.rentalInfos = rentalInfos;
        return this;
    }
    public java.util.List<FinanceCertifyRentalInfo> getRentalInfos() {
        return this.rentalInfos;
    }

}
