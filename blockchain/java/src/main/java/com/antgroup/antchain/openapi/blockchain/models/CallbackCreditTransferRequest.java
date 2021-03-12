// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CallbackCreditTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 回调消息内容
    @NameInMap("msg_data")
    @Validation(required = true)
    public String msgData;

    // 回调消息方法类型
    @NameInMap("msg_method")
    @Validation(required = true)
    public String msgMethod;

    public static CallbackCreditTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackCreditTransferRequest self = new CallbackCreditTransferRequest();
        return TeaModel.build(map, self);
    }

    public CallbackCreditTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackCreditTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackCreditTransferRequest setMsgData(String msgData) {
        this.msgData = msgData;
        return this;
    }
    public String getMsgData() {
        return this.msgData;
    }

    public CallbackCreditTransferRequest setMsgMethod(String msgMethod) {
        this.msgMethod = msgMethod;
        return this;
    }
    public String getMsgMethod() {
        return this.msgMethod;
    }

}
