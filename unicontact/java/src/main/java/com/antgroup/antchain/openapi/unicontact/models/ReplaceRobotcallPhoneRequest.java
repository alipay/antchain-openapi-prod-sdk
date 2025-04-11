// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unicontact.models;

import com.aliyun.tea.*;

public class ReplaceRobotcallPhoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID
    @NameInMap("req_id")
    @Validation(required = true)
    public String reqId;

    // 当前时间戳毫秒值
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 待解密号码
    @NameInMap("aesphone")
    @Validation(required = true)
    public String aesphone;

    public static ReplaceRobotcallPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceRobotcallPhoneRequest self = new ReplaceRobotcallPhoneRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceRobotcallPhoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReplaceRobotcallPhoneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReplaceRobotcallPhoneRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public ReplaceRobotcallPhoneRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public ReplaceRobotcallPhoneRequest setAesphone(String aesphone) {
        this.aesphone = aesphone;
        return this;
    }
    public String getAesphone() {
        return this.aesphone;
    }

}
