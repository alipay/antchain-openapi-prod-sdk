// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseAssetagentregisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被代理机构的金融科技租户id
    @NameInMap("agent_lease_id")
    @Validation(required = true)
    public String agentLeaseId;

    // 代理合同id，作为存证使用
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 被代理租赁机构统一社会信用码
    // 
    // 
    @NameInMap("lease_corp_id")
    @Validation(required = true)
    public String leaseCorpId;

    // 被代理租赁机构名称
    @NameInMap("lease_corp_name")
    @Validation(required = true)
    public String leaseCorpName;

    // 被代理租赁机构法人姓名
    @NameInMap("lease_corp_owner_name")
    @Validation(required = true)
    public String leaseCorpOwnerName;

    public static CreateLeaseAssetagentregisterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseAssetagentregisterRequest self = new CreateLeaseAssetagentregisterRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseAssetagentregisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseAssetagentregisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseAssetagentregisterRequest setAgentLeaseId(String agentLeaseId) {
        this.agentLeaseId = agentLeaseId;
        return this;
    }
    public String getAgentLeaseId() {
        return this.agentLeaseId;
    }

    public CreateLeaseAssetagentregisterRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public CreateLeaseAssetagentregisterRequest setLeaseCorpId(String leaseCorpId) {
        this.leaseCorpId = leaseCorpId;
        return this;
    }
    public String getLeaseCorpId() {
        return this.leaseCorpId;
    }

    public CreateLeaseAssetagentregisterRequest setLeaseCorpName(String leaseCorpName) {
        this.leaseCorpName = leaseCorpName;
        return this;
    }
    public String getLeaseCorpName() {
        return this.leaseCorpName;
    }

    public CreateLeaseAssetagentregisterRequest setLeaseCorpOwnerName(String leaseCorpOwnerName) {
        this.leaseCorpOwnerName = leaseCorpOwnerName;
        return this;
    }
    public String getLeaseCorpOwnerName() {
        return this.leaseCorpOwnerName;
    }

}
