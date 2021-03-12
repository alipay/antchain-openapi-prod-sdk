// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidNotificationConsumerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  事件发生时的回调路径，必须满足：
    // metho：POST
    // Content-Type：application/json
    @NameInMap("call_back_url")
    @Validation(required = true)
    public String callBackUrl;

    // 关注的did；这个did必须是调用者自己的did，也可以是托管给调用者的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 1 所有相关事件， 
    // 2 所有相关did事件，
    // 3 所有相关vc事件，
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidNotificationConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidNotificationConsumerRequest self = new StartDidNotificationConsumerRequest();
        return TeaModel.build(map, self);
    }

    public StartDidNotificationConsumerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidNotificationConsumerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidNotificationConsumerRequest setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
        return this;
    }
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public StartDidNotificationConsumerRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidNotificationConsumerRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public StartDidNotificationConsumerRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
