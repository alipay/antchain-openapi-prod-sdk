// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class QuerySmsDomesticRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 消息id
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 接收短信的手机号码
    @NameInMap("phone_number")
    public String phoneNumber;

    // 短信发送日期，支持查询最近 30 天的记录。格式：yyyyMMdd。
    @NameInMap("send_date")
    @Validation(required = true)
    public String sendDate;

    public static QuerySmsDomesticRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsDomesticRequest self = new QuerySmsDomesticRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsDomesticRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySmsDomesticRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySmsDomesticRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QuerySmsDomesticRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public QuerySmsDomesticRequest setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

}
