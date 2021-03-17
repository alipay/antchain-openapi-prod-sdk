// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class StartRealtytradeSigningRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 机构账号 ID
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 业务描述,描述本次合同文档加载业务
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 合同及签署信息列表
    @NameInMap("contract_list")
    @Validation(required = true)
    public java.util.List<ContractSigning> contractList;

    public static StartRealtytradeSigningRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRealtytradeSigningRequest self = new StartRealtytradeSigningRequest();
        return TeaModel.build(map, self);
    }

    public StartRealtytradeSigningRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartRealtytradeSigningRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartRealtytradeSigningRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public StartRealtytradeSigningRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartRealtytradeSigningRequest setContractList(java.util.List<ContractSigning> contractList) {
        this.contractList = contractList;
        return this;
    }
    public java.util.List<ContractSigning> getContractList() {
        return this.contractList;
    }

}
