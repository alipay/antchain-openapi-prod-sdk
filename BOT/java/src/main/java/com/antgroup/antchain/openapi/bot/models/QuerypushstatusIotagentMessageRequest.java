// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QuerypushstatusIotagentMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // push接口返回的受理标识，与message_id至少填一个
    @NameInMap("receipt_id")
    public String receiptId;

    // 消息ID，与receipt_id至少填一个
    @NameInMap("message_id")
    public String messageId;

    public static QuerypushstatusIotagentMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerypushstatusIotagentMessageRequest self = new QuerypushstatusIotagentMessageRequest();
        return TeaModel.build(map, self);
    }

    public QuerypushstatusIotagentMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerypushstatusIotagentMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerypushstatusIotagentMessageRequest setReceiptId(String receiptId) {
        this.receiptId = receiptId;
        return this;
    }
    public String getReceiptId() {
        return this.receiptId;
    }

    public QuerypushstatusIotagentMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
