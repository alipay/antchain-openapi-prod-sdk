// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QuerypushstatusBlockchainBotIotagentMessageRequest extends TeaModel {
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

    public static QuerypushstatusBlockchainBotIotagentMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerypushstatusBlockchainBotIotagentMessageRequest self = new QuerypushstatusBlockchainBotIotagentMessageRequest();
        return TeaModel.build(map, self);
    }

    public QuerypushstatusBlockchainBotIotagentMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerypushstatusBlockchainBotIotagentMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerypushstatusBlockchainBotIotagentMessageRequest setReceiptId(String receiptId) {
        this.receiptId = receiptId;
        return this;
    }
    public String getReceiptId() {
        return this.receiptId;
    }

    public QuerypushstatusBlockchainBotIotagentMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
