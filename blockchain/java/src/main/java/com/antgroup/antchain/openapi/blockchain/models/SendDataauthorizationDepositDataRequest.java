// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SendDataauthorizationDepositDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通知人列表
    @NameInMap("notification_ids")
    public java.util.List<String> notificationIds;

    // 数据发送人
    @NameInMap("sender_id")
    public String senderId;

    // 存证交易内容
    @NameInMap("tx_data")
    @Validation(required = true)
    public String txData;

    public static SendDataauthorizationDepositDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDataauthorizationDepositDataRequest self = new SendDataauthorizationDepositDataRequest();
        return TeaModel.build(map, self);
    }

    public SendDataauthorizationDepositDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendDataauthorizationDepositDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendDataauthorizationDepositDataRequest setNotificationIds(java.util.List<String> notificationIds) {
        this.notificationIds = notificationIds;
        return this;
    }
    public java.util.List<String> getNotificationIds() {
        return this.notificationIds;
    }

    public SendDataauthorizationDepositDataRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public SendDataauthorizationDepositDataRequest setTxData(String txData) {
        this.txData = txData;
        return this;
    }
    public String getTxData() {
        return this.txData;
    }

}
