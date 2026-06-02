// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class QueryCardsmsDomesticRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 消息ID
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 接收短信的手机号码
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    public static QueryCardsmsDomesticRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardsmsDomesticRequest self = new QueryCardsmsDomesticRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardsmsDomesticRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCardsmsDomesticRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCardsmsDomesticRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QueryCardsmsDomesticRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
