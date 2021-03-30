// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CallbackCreditCommonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 回调数据，根据不同msg_method 返回不同结构
    @NameInMap("msg_data")
    @Validation(required = true)
    public String msgData;

    // 回调方法类型
    @NameInMap("msg_method")
    @Validation(required = true)
    public String msgMethod;

    public static CallbackCreditCommonRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackCreditCommonRequest self = new CallbackCreditCommonRequest();
        return TeaModel.build(map, self);
    }

    public CallbackCreditCommonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackCreditCommonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackCreditCommonRequest setMsgData(String msgData) {
        this.msgData = msgData;
        return this;
    }
    public String getMsgData() {
        return this.msgData;
    }

    public CallbackCreditCommonRequest setMsgMethod(String msgMethod) {
        this.msgMethod = msgMethod;
        return this;
    }
    public String getMsgMethod() {
        return this.msgMethod;
    }

}
