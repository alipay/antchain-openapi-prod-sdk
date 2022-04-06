// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListComputerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // appserviceIds
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // current page
    @NameInMap("current_page")
    public Long currentPage;

    // name
    @NameInMap("name")
    public String name;

    // current page
    @NameInMap("page_size")
    public Long pageSize;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // CMP模式下使用的token，一般场景勿用
    @NameInMap("cloud_manage_token")
    public String cloudManageToken;

    // vpc_iaas_id
    @NameInMap("vpc_iaas_id")
    public String vpcIaasId;

    // private_ips
    @NameInMap("private_ips")
    public java.util.List<String> privateIps;

    // iaas_ids
    @NameInMap("iaas_ids")
    public java.util.List<String> iaasIds;

    public static ListComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComputerRequest self = new ListComputerRequest();
        return TeaModel.build(map, self);
    }

    public ListComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListComputerRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public ListComputerRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListComputerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListComputerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListComputerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ListComputerRequest setCloudManageToken(String cloudManageToken) {
        this.cloudManageToken = cloudManageToken;
        return this;
    }
    public String getCloudManageToken() {
        return this.cloudManageToken;
    }

    public ListComputerRequest setVpcIaasId(String vpcIaasId) {
        this.vpcIaasId = vpcIaasId;
        return this;
    }
    public String getVpcIaasId() {
        return this.vpcIaasId;
    }

    public ListComputerRequest setPrivateIps(java.util.List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }
    public java.util.List<String> getPrivateIps() {
        return this.privateIps;
    }

    public ListComputerRequest setIaasIds(java.util.List<String> iaasIds) {
        this.iaasIds = iaasIds;
        return this;
    }
    public java.util.List<String> getIaasIds() {
        return this.iaasIds;
    }

}
