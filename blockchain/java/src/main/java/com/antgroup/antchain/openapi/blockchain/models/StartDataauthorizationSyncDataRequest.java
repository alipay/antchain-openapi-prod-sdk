// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDataauthorizationSyncDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 枚举值：
    // DATAENTITY：数据目录
    // PARTICIPANT：参与方
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 接收同步数据的DID
    @NameInMap("receiver_id")
    @Validation(required = true)
    public String receiverId;

    public static StartDataauthorizationSyncDataRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDataauthorizationSyncDataRequest self = new StartDataauthorizationSyncDataRequest();
        return TeaModel.build(map, self);
    }

    public StartDataauthorizationSyncDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDataauthorizationSyncDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDataauthorizationSyncDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public StartDataauthorizationSyncDataRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

}
