// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ConfirmWithholdSignasyncunsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 操作动作
    // 同意：AGREE
    // 拒绝：REFUSE
    @NameInMap("operate")
    @Validation(required = true, maxLength = 16, minLength = 1)
    public String operate;

    // 拒绝原因码,商户拒绝时必填。
    // USER_OWE_MONEY：用户账户存在欠费订单
    // USER_IN_SERVICE：用户有进行的订单
    @NameInMap("refuse_reason_code")
    @Validation(maxLength = 16, minLength = 1)
    public String refuseReasonCode;

    // 用户欠款金额，单位为分
    // refuse_reason_code=USER_OWE_MONEY时必填
    @NameInMap("user_owe_money")
    public Long userOweMoney;

    // 用户进行中的服务
    // refuse_reason_code=USER_IN_SERVICE时必填
    @NameInMap("user_in_service")
    @Validation(maxLength = 128, minLength = 1)
    public String userInService;

    public static ConfirmWithholdSignasyncunsignRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmWithholdSignasyncunsignRequest self = new ConfirmWithholdSignasyncunsignRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmWithholdSignasyncunsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmWithholdSignasyncunsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmWithholdSignasyncunsignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ConfirmWithholdSignasyncunsignRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public ConfirmWithholdSignasyncunsignRequest setRefuseReasonCode(String refuseReasonCode) {
        this.refuseReasonCode = refuseReasonCode;
        return this;
    }
    public String getRefuseReasonCode() {
        return this.refuseReasonCode;
    }

    public ConfirmWithholdSignasyncunsignRequest setUserOweMoney(Long userOweMoney) {
        this.userOweMoney = userOweMoney;
        return this;
    }
    public Long getUserOweMoney() {
        return this.userOweMoney;
    }

    public ConfirmWithholdSignasyncunsignRequest setUserInService(String userInService) {
        this.userInService = userInService;
        return this;
    }
    public String getUserInService() {
        return this.userInService;
    }

}
