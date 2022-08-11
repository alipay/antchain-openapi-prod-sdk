// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class QueryBaasDidAgentServicetypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 指定查询的服务类型名
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 服务类型定义列表
    @NameInMap("service_types")
    public java.util.List<String> serviceTypes;

    // 总共有几项
    @NameInMap("total_number")
    public Long totalNumber;

    // 总共有几页
    @NameInMap("total_page")
    public Long totalPage;

    public static QueryBaasDidAgentServicetypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasDidAgentServicetypeRequest self = new QueryBaasDidAgentServicetypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasDidAgentServicetypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasDidAgentServicetypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasDidAgentServicetypeRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryBaasDidAgentServicetypeRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public QueryBaasDidAgentServicetypeRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryBaasDidAgentServicetypeRequest setServiceTypes(java.util.List<String> serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }
    public java.util.List<String> getServiceTypes() {
        return this.serviceTypes;
    }

    public QueryBaasDidAgentServicetypeRequest setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Long getTotalNumber() {
        return this.totalNumber;
    }

    public QueryBaasDidAgentServicetypeRequest setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
