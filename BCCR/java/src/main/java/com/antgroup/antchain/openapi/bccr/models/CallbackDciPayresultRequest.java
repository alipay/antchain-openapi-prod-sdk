// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CallbackDciPayresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 与中心约定的任务ID，同一个作品可能会发起多次登记
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 平台Id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 订单ID 
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 支付方式 (ALIPAY,0,支付宝)
    @NameInMap("pay_ment")
    @Validation(required = true)
    public String payMent;

    // 订单金额
    @NameInMap("money")
    @Validation(required = true)
    public String money;

    // 结果描述，如：支付成功
    @NameInMap("result_content")
    @Validation(required = true)
    public String resultContent;

    // 状态，2001代表支付成功
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    public static CallbackDciPayresultRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackDciPayresultRequest self = new CallbackDciPayresultRequest();
        return TeaModel.build(map, self);
    }

    public CallbackDciPayresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackDciPayresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackDciPayresultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CallbackDciPayresultRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CallbackDciPayresultRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CallbackDciPayresultRequest setPayMent(String payMent) {
        this.payMent = payMent;
        return this;
    }
    public String getPayMent() {
        return this.payMent;
    }

    public CallbackDciPayresultRequest setMoney(String money) {
        this.money = money;
        return this;
    }
    public String getMoney() {
        return this.money;
    }

    public CallbackDciPayresultRequest setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

    public CallbackDciPayresultRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
