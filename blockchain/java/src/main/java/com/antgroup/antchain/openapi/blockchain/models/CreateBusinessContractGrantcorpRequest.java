// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessContractGrantcorpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据所在的链业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合约keyId发起者的数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 授权截止日期，超过该日期则不可继续访问该数据
    @NameInMap("due_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dueTime;

    // 授权的组织名称
    @NameInMap("granted_corp")
    @Validation(required = true)
    public String grantedCorp;

    // 需要授权的字段名称
    @NameInMap("item_ids")
    @Validation(required = true)
    public java.util.List<String> itemIds;

    public static CreateBusinessContractGrantcorpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessContractGrantcorpRequest self = new CreateBusinessContractGrantcorpRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessContractGrantcorpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessContractGrantcorpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessContractGrantcorpRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBusinessContractGrantcorpRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CreateBusinessContractGrantcorpRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBusinessContractGrantcorpRequest setDueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public String getDueTime() {
        return this.dueTime;
    }

    public CreateBusinessContractGrantcorpRequest setGrantedCorp(String grantedCorp) {
        this.grantedCorp = grantedCorp;
        return this;
    }
    public String getGrantedCorp() {
        return this.grantedCorp;
    }

    public CreateBusinessContractGrantcorpRequest setItemIds(java.util.List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

}
