// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceListenerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // backend_server_ports
    @NameInMap("backend_server_ports")
    public java.util.List<Long> backendServerPorts;

    // certificate_iaas_ids
    @NameInMap("certificate_iaas_ids")
    public java.util.List<String> certificateIaasIds;

    // certificate_ids
    @NameInMap("certificate_ids")
    public java.util.List<String> certificateIds;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // gm_crypto_cert_iaas_ids
    @NameInMap("gm_crypto_cert_iaas_ids")
    public java.util.List<String> gmCryptoCertIaasIds;

    // gm_sign_cert_iaas_ids
    @NameInMap("gm_sign_cert_iaas_ids")
    public java.util.List<String> gmSignCertIaasIds;

    // listener_ports
    @NameInMap("listener_ports")
    public java.util.List<Long> listenerPorts;

    // load_balancer_ids
    @NameInMap("load_balancer_ids")
    public java.util.List<String> loadBalancerIds;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // types
    @NameInMap("types")
    public java.util.List<String> types;

    // v_computer_group_ids
    @NameInMap("v_computer_group_ids")
    public java.util.List<String> vComputerGroupIds;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceListenerRequest self = new QueryLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceListenerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadbalanceListenerRequest setBackendServerPorts(java.util.List<Long> backendServerPorts) {
        this.backendServerPorts = backendServerPorts;
        return this;
    }
    public java.util.List<Long> getBackendServerPorts() {
        return this.backendServerPorts;
    }

    public QueryLoadbalanceListenerRequest setCertificateIaasIds(java.util.List<String> certificateIaasIds) {
        this.certificateIaasIds = certificateIaasIds;
        return this;
    }
    public java.util.List<String> getCertificateIaasIds() {
        return this.certificateIaasIds;
    }

    public QueryLoadbalanceListenerRequest setCertificateIds(java.util.List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }
    public java.util.List<String> getCertificateIds() {
        return this.certificateIds;
    }

    public QueryLoadbalanceListenerRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryLoadbalanceListenerRequest setGmCryptoCertIaasIds(java.util.List<String> gmCryptoCertIaasIds) {
        this.gmCryptoCertIaasIds = gmCryptoCertIaasIds;
        return this;
    }
    public java.util.List<String> getGmCryptoCertIaasIds() {
        return this.gmCryptoCertIaasIds;
    }

    public QueryLoadbalanceListenerRequest setGmSignCertIaasIds(java.util.List<String> gmSignCertIaasIds) {
        this.gmSignCertIaasIds = gmSignCertIaasIds;
        return this;
    }
    public java.util.List<String> getGmSignCertIaasIds() {
        return this.gmSignCertIaasIds;
    }

    public QueryLoadbalanceListenerRequest setListenerPorts(java.util.List<Long> listenerPorts) {
        this.listenerPorts = listenerPorts;
        return this;
    }
    public java.util.List<Long> getListenerPorts() {
        return this.listenerPorts;
    }

    public QueryLoadbalanceListenerRequest setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public java.util.List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public QueryLoadbalanceListenerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLoadbalanceListenerRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public QueryLoadbalanceListenerRequest setVComputerGroupIds(java.util.List<String> vComputerGroupIds) {
        this.vComputerGroupIds = vComputerGroupIds;
        return this;
    }
    public java.util.List<String> getVComputerGroupIds() {
        return this.vComputerGroupIds;
    }

    public QueryLoadbalanceListenerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
