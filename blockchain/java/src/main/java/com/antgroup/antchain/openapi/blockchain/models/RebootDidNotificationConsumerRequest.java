// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RebootDidNotificationConsumerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // method： POST
    // applicatoin/json
    @NameInMap("call_back_url")
    @Validation(required = true)
    public String callBackUrl;

    // 注册是得到的consumer_id
    @NameInMap("consumer_id")
    @Validation(required = true)
    public String consumerId;

    // 重新从哪个高度开始同步信息，目前did messager只保留1周之内的数据，所以这个高度如果早于一周，会返回异常。
    @NameInMap("restart_block_height")
    @Validation(required = true)
    public Long restartBlockHeight;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static RebootDidNotificationConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootDidNotificationConsumerRequest self = new RebootDidNotificationConsumerRequest();
        return TeaModel.build(map, self);
    }

    public RebootDidNotificationConsumerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RebootDidNotificationConsumerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RebootDidNotificationConsumerRequest setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
        return this;
    }
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public RebootDidNotificationConsumerRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public RebootDidNotificationConsumerRequest setRestartBlockHeight(Long restartBlockHeight) {
        this.restartBlockHeight = restartBlockHeight;
        return this;
    }
    public Long getRestartBlockHeight() {
        return this.restartBlockHeight;
    }

    public RebootDidNotificationConsumerRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
