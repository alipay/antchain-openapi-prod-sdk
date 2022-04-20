// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequeryBaselineAppcontainersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境ID
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用名数组，没传则查询改产品下的所有参数
    @NameInMap("apps")
    public java.util.List<String> apps;

    // 部署单元实例id。默认值为default
    @NameInMap("deployment_unit_instance_identities")
    public java.util.List<String> deploymentUnitInstanceIdentities;

    // 页大小，默认每页12
    @NameInMap("page_size")
    public Long pageSize;

    // 第几页，默认返回第一页
    // 
    @NameInMap("current_page")
    public Long currentPage;

    public static PagequeryBaselineAppcontainersRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryBaselineAppcontainersRequest self = new PagequeryBaselineAppcontainersRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryBaselineAppcontainersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryBaselineAppcontainersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryBaselineAppcontainersRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public PagequeryBaselineAppcontainersRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public PagequeryBaselineAppcontainersRequest setApps(java.util.List<String> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<String> getApps() {
        return this.apps;
    }

    public PagequeryBaselineAppcontainersRequest setDeploymentUnitInstanceIdentities(java.util.List<String> deploymentUnitInstanceIdentities) {
        this.deploymentUnitInstanceIdentities = deploymentUnitInstanceIdentities;
        return this;
    }
    public java.util.List<String> getDeploymentUnitInstanceIdentities() {
        return this.deploymentUnitInstanceIdentities;
    }

    public PagequeryBaselineAppcontainersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryBaselineAppcontainersRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
