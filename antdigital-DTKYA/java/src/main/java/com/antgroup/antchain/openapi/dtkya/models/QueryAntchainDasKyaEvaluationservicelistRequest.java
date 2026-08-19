// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaEvaluationservicelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 评测服务名称
    @NameInMap("name")
    public String name;

    // 评测服务类型
    @NameInMap("evaluation_type")
    public String evaluationType;

    // 评测提供方did
    @NameInMap("provider_did")
    public String providerDid;

    // 页号
    @NameInMap("page_num")
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryAntchainDasKyaEvaluationservicelistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaEvaluationservicelistRequest self = new QueryAntchainDasKyaEvaluationservicelistRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaEvaluationservicelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaEvaluationservicelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaEvaluationservicelistRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAntchainDasKyaEvaluationservicelistRequest setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType;
        return this;
    }
    public String getEvaluationType() {
        return this.evaluationType;
    }

    public QueryAntchainDasKyaEvaluationservicelistRequest setProviderDid(String providerDid) {
        this.providerDid = providerDid;
        return this;
    }
    public String getProviderDid() {
        return this.providerDid;
    }

    public QueryAntchainDasKyaEvaluationservicelistRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAntchainDasKyaEvaluationservicelistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
