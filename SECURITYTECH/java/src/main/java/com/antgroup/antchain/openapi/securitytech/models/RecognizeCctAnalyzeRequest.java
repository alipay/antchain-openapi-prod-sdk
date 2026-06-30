// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RecognizeCctAnalyzeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // channel
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // content_type
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // user_id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // request_id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // data_map
    @NameInMap("data_map")
    @Validation(required = true)
    public CctDataMap dataMap;

    public static RecognizeCctAnalyzeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCctAnalyzeRequest self = new RecognizeCctAnalyzeRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCctAnalyzeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RecognizeCctAnalyzeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RecognizeCctAnalyzeRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public RecognizeCctAnalyzeRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public RecognizeCctAnalyzeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RecognizeCctAnalyzeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeCctAnalyzeRequest setDataMap(CctDataMap dataMap) {
        this.dataMap = dataMap;
        return this;
    }
    public CctDataMap getDataMap() {
        return this.dataMap;
    }

}
