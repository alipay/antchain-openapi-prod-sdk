// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessContractGrantdidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户业务链地址biz_id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 授权的合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 用户did身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 授权截止日期
    @NameInMap("due_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dueTime;

    // 被授权者身份
    @NameInMap("granted_did")
    @Validation(required = true)
    public String grantedDid;

    // 授权的字段
    @NameInMap("item_ids")
    @Validation(required = true)
    public java.util.List<String> itemIds;

    public static CreateBusinessContractGrantdidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessContractGrantdidRequest self = new CreateBusinessContractGrantdidRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessContractGrantdidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessContractGrantdidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessContractGrantdidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBusinessContractGrantdidRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CreateBusinessContractGrantdidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBusinessContractGrantdidRequest setDueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public String getDueTime() {
        return this.dueTime;
    }

    public CreateBusinessContractGrantdidRequest setGrantedDid(String grantedDid) {
        this.grantedDid = grantedDid;
        return this;
    }
    public String getGrantedDid() {
        return this.grantedDid;
    }

    public CreateBusinessContractGrantdidRequest setItemIds(java.util.List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

}
