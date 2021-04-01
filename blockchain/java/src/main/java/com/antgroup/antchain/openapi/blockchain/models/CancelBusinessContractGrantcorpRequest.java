// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CancelBusinessContractGrantcorpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约所在的业务链id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 用户的did数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 取消被授权者的机构名称
    @NameInMap("granted_corp")
    @Validation(required = true)
    public String grantedCorp;

    // 取消授权的字段名
    @NameInMap("item_ids")
    @Validation(required = true)
    public java.util.List<String> itemIds;

    public static CancelBusinessContractGrantcorpRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBusinessContractGrantcorpRequest self = new CancelBusinessContractGrantcorpRequest();
        return TeaModel.build(map, self);
    }

    public CancelBusinessContractGrantcorpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelBusinessContractGrantcorpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelBusinessContractGrantcorpRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CancelBusinessContractGrantcorpRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CancelBusinessContractGrantcorpRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CancelBusinessContractGrantcorpRequest setGrantedCorp(String grantedCorp) {
        this.grantedCorp = grantedCorp;
        return this;
    }
    public String getGrantedCorp() {
        return this.grantedCorp;
    }

    public CancelBusinessContractGrantcorpRequest setItemIds(java.util.List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

}
