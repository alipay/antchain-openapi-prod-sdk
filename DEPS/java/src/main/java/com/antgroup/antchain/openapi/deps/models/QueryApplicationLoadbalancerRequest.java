// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplicationLoadbalancerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
    @NameInMap("application")
    public String application;

    // 资源名称
    @NameInMap("name")
    public String name;

    // VIP类型
    @NameInMap("network_type")
    public String networkType;

    // 当前页码，默认为1
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小，默认10
    @NameInMap("page_size")
    public Integer pageSize;

    // 目标服务实例名称
    @NameInMap("service_name")
    public String serviceName;

    // 资源所处的状态，可指定多个
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // vip地址
    @NameInMap("vip_address")
    public String vipAddress;

    // address 类型：INTERNET, INTRANET
    @NameInMap("vip_address_type")
    public String vipAddressType;

    // VIP类型
    @NameInMap("vip_type")
    public String vipType;

    // vpc的id
    @NameInMap("vpc_ids")
    public java.util.List<String> vpcIds;

    // 目标工作空间名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryApplicationLoadbalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationLoadbalancerRequest self = new QueryApplicationLoadbalancerRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationLoadbalancerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationLoadbalancerRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryApplicationLoadbalancerRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public QueryApplicationLoadbalancerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryApplicationLoadbalancerRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public QueryApplicationLoadbalancerRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryApplicationLoadbalancerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryApplicationLoadbalancerRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryApplicationLoadbalancerRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryApplicationLoadbalancerRequest setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }
    public String getVipAddress() {
        return this.vipAddress;
    }

    public QueryApplicationLoadbalancerRequest setVipAddressType(String vipAddressType) {
        this.vipAddressType = vipAddressType;
        return this;
    }
    public String getVipAddressType() {
        return this.vipAddressType;
    }

    public QueryApplicationLoadbalancerRequest setVipType(String vipType) {
        this.vipType = vipType;
        return this;
    }
    public String getVipType() {
        return this.vipType;
    }

    public QueryApplicationLoadbalancerRequest setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public QueryApplicationLoadbalancerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
