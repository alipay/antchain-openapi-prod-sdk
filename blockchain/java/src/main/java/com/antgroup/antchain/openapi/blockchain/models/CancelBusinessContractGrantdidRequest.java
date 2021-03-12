// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CancelBusinessContractGrantdidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约所在链的业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // keyId的创建者数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 取消被授权者的数字身份
    @NameInMap("granted_did")
    @Validation(required = true)
    public String grantedDid;

    // 取消授权的字段
    @NameInMap("item_ids")
    @Validation(required = true)
    public java.util.List<String> itemIds;

    public static CancelBusinessContractGrantdidRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBusinessContractGrantdidRequest self = new CancelBusinessContractGrantdidRequest();
        return TeaModel.build(map, self);
    }

    public CancelBusinessContractGrantdidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelBusinessContractGrantdidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelBusinessContractGrantdidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CancelBusinessContractGrantdidRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CancelBusinessContractGrantdidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CancelBusinessContractGrantdidRequest setGrantedDid(String grantedDid) {
        this.grantedDid = grantedDid;
        return this;
    }
    public String getGrantedDid() {
        return this.grantedDid;
    }

    public CancelBusinessContractGrantdidRequest setItemIds(java.util.List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

}
