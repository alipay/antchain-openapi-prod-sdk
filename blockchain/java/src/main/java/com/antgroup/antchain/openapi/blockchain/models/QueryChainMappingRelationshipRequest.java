// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainMappingRelationshipRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // 联盟id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // ""
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 映射方法类型
    @NameInMap("mapping_type")
    @Validation(required = true)
    public String mappingType;

    public static QueryChainMappingRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChainMappingRelationshipRequest self = new QueryChainMappingRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public QueryChainMappingRelationshipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChainMappingRelationshipRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChainMappingRelationshipRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public QueryChainMappingRelationshipRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public QueryChainMappingRelationshipRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryChainMappingRelationshipRequest setMappingType(String mappingType) {
        this.mappingType = mappingType;
        return this;
    }
    public String getMappingType() {
        return this.mappingType;
    }

}
