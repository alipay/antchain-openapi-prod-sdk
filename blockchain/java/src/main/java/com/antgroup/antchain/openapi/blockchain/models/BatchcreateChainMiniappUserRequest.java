// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateChainMiniappUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // phone_list
    @NameInMap("phone_list")
    public String phoneList;

    public static BatchcreateChainMiniappUserRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateChainMiniappUserRequest self = new BatchcreateChainMiniappUserRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateChainMiniappUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateChainMiniappUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateChainMiniappUserRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public BatchcreateChainMiniappUserRequest setPhoneList(String phoneList) {
        this.phoneList = phoneList;
        return this;
    }
    public String getPhoneList() {
        return this.phoneList;
    }

}
