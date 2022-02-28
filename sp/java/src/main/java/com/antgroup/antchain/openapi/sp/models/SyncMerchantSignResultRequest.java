// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class SyncMerchantSignResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 本次关联注册失败错误原因。
    @NameInMap("error_msg")
    public String errorMsg;

    // 商家注册(进件)受理单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商家注册（包括进件）结果。99:已完结;-1:失败;
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 二级商户id
    @NameInMap("smid")
    @Validation(required = true)
    public String smid;

    // 商户租户id
    @NameInMap("merchant_user_id")
    @Validation(required = true)
    public String merchantUserId;

    // 商户名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 八位数的商户租户名称
    @NameInMap("merchant_user_name")
    public String merchantUserName;

    public static SyncMerchantSignResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMerchantSignResultRequest self = new SyncMerchantSignResultRequest();
        return TeaModel.build(map, self);
    }

    public SyncMerchantSignResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncMerchantSignResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncMerchantSignResultRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public SyncMerchantSignResultRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SyncMerchantSignResultRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncMerchantSignResultRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SyncMerchantSignResultRequest setSmid(String smid) {
        this.smid = smid;
        return this;
    }
    public String getSmid() {
        return this.smid;
    }

    public SyncMerchantSignResultRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public SyncMerchantSignResultRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public SyncMerchantSignResultRequest setMerchantUserName(String merchantUserName) {
        this.merchantUserName = merchantUserName;
        return this;
    }
    public String getMerchantUserName() {
        return this.merchantUserName;
    }

}
