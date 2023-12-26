// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeployCaasContractServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String chainId;

    // 联盟id
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 合约模板标识
    @NameInMap("template_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String templateId;

    // 合约名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String name;

    public static DeployCaasContractServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployCaasContractServiceRequest self = new DeployCaasContractServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeployCaasContractServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeployCaasContractServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeployCaasContractServiceRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public DeployCaasContractServiceRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public DeployCaasContractServiceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DeployCaasContractServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
