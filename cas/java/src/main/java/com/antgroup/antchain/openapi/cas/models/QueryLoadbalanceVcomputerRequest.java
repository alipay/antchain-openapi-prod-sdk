// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceVcomputerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // computer_ids
    @NameInMap("computer_ids")
    public java.util.List<String> computerIds;

    // computer_ports
    @NameInMap("computer_ports")
    public java.util.List<String> computerPorts;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // ips
    @NameInMap("ips")
    public java.util.List<String> ips;

    // ip_ports
    @NameInMap("ip_ports")
    public java.util.List<String> ipPorts;

    // max_weight
    @NameInMap("max_weight")
    public Long maxWeight;

    // min_weight
    @NameInMap("min_weight")
    public Long minWeight;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // ports
    @NameInMap("ports")
    public java.util.List<String> ports;

    // v_computer_group_ids
    @NameInMap("v_computer_group_ids")
    public java.util.List<String> vComputerGroupIds;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryLoadbalanceVcomputerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceVcomputerRequest self = new QueryLoadbalanceVcomputerRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceVcomputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadbalanceVcomputerRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public QueryLoadbalanceVcomputerRequest setComputerPorts(java.util.List<String> computerPorts) {
        this.computerPorts = computerPorts;
        return this;
    }
    public java.util.List<String> getComputerPorts() {
        return this.computerPorts;
    }

    public QueryLoadbalanceVcomputerRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryLoadbalanceVcomputerRequest setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public QueryLoadbalanceVcomputerRequest setIpPorts(java.util.List<String> ipPorts) {
        this.ipPorts = ipPorts;
        return this;
    }
    public java.util.List<String> getIpPorts() {
        return this.ipPorts;
    }

    public QueryLoadbalanceVcomputerRequest setMaxWeight(Long maxWeight) {
        this.maxWeight = maxWeight;
        return this;
    }
    public Long getMaxWeight() {
        return this.maxWeight;
    }

    public QueryLoadbalanceVcomputerRequest setMinWeight(Long minWeight) {
        this.minWeight = minWeight;
        return this;
    }
    public Long getMinWeight() {
        return this.minWeight;
    }

    public QueryLoadbalanceVcomputerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLoadbalanceVcomputerRequest setPorts(java.util.List<String> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<String> getPorts() {
        return this.ports;
    }

    public QueryLoadbalanceVcomputerRequest setVComputerGroupIds(java.util.List<String> vComputerGroupIds) {
        this.vComputerGroupIds = vComputerGroupIds;
        return this;
    }
    public java.util.List<String> getVComputerGroupIds() {
        return this.vComputerGroupIds;
    }

    public QueryLoadbalanceVcomputerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
