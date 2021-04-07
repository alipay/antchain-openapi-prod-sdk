// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateLoadbalanceListenerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // bandwidth
    @NameInMap("bandwidth")
    public Long bandwidth;

    // certificate_iaas_id
    @NameInMap("certificate_iaas_id")
    public String certificateIaasId;

    // certificate_id
    @NameInMap("certificate_id")
    public String certificateId;

    // cookie
    @NameInMap("cookie")
    public String cookie;

    // cookie_timeout
    @NameInMap("cookie_timeout")
    public Long cookieTimeout;

    // established_timeout
    @NameInMap("established_timeout")
    public Long establishedTimeout;

    // gm_crypto_cert_iaas_id
    @NameInMap("gm_crypto_cert_iaas_id")
    public String gmCryptoCertIaasId;

    // gm_sign_cert_iaas_id
    @NameInMap("gm_sign_cert_iaas_id")
    public String gmSignCertIaasId;

    // health_monitor
    @NameInMap("health_monitor")
    public ListenerHealthMonitor healthMonitor;

    // listener_port
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    // load_balancer_id
    @NameInMap("load_balancer_id")
    @Validation(required = true)
    public String loadBalancerId;

    // persist_timeout
    @NameInMap("persist_timeout")
    public Long persistTimeout;

    // scheduler
    @NameInMap("scheduler")
    public String scheduler;

    // sticky_session_type
    @NameInMap("sticky_session_type")
    public String stickySessionType;

    // tls_cipher_policy
    @NameInMap("tls_cipher_policy")
    public String tlsCipherPolicy;

    // use_v_computer_group
    @NameInMap("use_v_computer_group")
    public Boolean useVComputerGroup;

    // v_computer_group_id
    @NameInMap("v_computer_group_id")
    public String vComputerGroupId;

    public static UpdateLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadbalanceListenerRequest self = new UpdateLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadbalanceListenerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateLoadbalanceListenerRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public UpdateLoadbalanceListenerRequest setCertificateIaasId(String certificateIaasId) {
        this.certificateIaasId = certificateIaasId;
        return this;
    }
    public String getCertificateIaasId() {
        return this.certificateIaasId;
    }

    public UpdateLoadbalanceListenerRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public UpdateLoadbalanceListenerRequest setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public UpdateLoadbalanceListenerRequest setCookieTimeout(Long cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Long getCookieTimeout() {
        return this.cookieTimeout;
    }

    public UpdateLoadbalanceListenerRequest setEstablishedTimeout(Long establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Long getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public UpdateLoadbalanceListenerRequest setGmCryptoCertIaasId(String gmCryptoCertIaasId) {
        this.gmCryptoCertIaasId = gmCryptoCertIaasId;
        return this;
    }
    public String getGmCryptoCertIaasId() {
        return this.gmCryptoCertIaasId;
    }

    public UpdateLoadbalanceListenerRequest setGmSignCertIaasId(String gmSignCertIaasId) {
        this.gmSignCertIaasId = gmSignCertIaasId;
        return this;
    }
    public String getGmSignCertIaasId() {
        return this.gmSignCertIaasId;
    }

    public UpdateLoadbalanceListenerRequest setHealthMonitor(ListenerHealthMonitor healthMonitor) {
        this.healthMonitor = healthMonitor;
        return this;
    }
    public ListenerHealthMonitor getHealthMonitor() {
        return this.healthMonitor;
    }

    public UpdateLoadbalanceListenerRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public UpdateLoadbalanceListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadbalanceListenerRequest setPersistTimeout(Long persistTimeout) {
        this.persistTimeout = persistTimeout;
        return this;
    }
    public Long getPersistTimeout() {
        return this.persistTimeout;
    }

    public UpdateLoadbalanceListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public UpdateLoadbalanceListenerRequest setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public UpdateLoadbalanceListenerRequest setTlsCipherPolicy(String tlsCipherPolicy) {
        this.tlsCipherPolicy = tlsCipherPolicy;
        return this;
    }
    public String getTlsCipherPolicy() {
        return this.tlsCipherPolicy;
    }

    public UpdateLoadbalanceListenerRequest setUseVComputerGroup(Boolean useVComputerGroup) {
        this.useVComputerGroup = useVComputerGroup;
        return this;
    }
    public Boolean getUseVComputerGroup() {
        return this.useVComputerGroup;
    }

    public UpdateLoadbalanceListenerRequest setVComputerGroupId(String vComputerGroupId) {
        this.vComputerGroupId = vComputerGroupId;
        return this;
    }
    public String getVComputerGroupId() {
        return this.vComputerGroupId;
    }

}
