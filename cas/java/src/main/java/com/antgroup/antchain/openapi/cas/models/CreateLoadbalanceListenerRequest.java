// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateLoadbalanceListenerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // backend_server_port
    @NameInMap("backend_server_port")
    public Long backendServerPort;

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

    // lb id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // listener_port
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

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

    // type
    @NameInMap("type")
    public String type;

    // v_computer_group_id
    @NameInMap("v_computer_group_id")
    public String vComputerGroupId;

    // x_forwarded_for
    @NameInMap("x_forwarded_for")
    public String xForwardedFor;

    public static CreateLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadbalanceListenerRequest self = new CreateLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadbalanceListenerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLoadbalanceListenerRequest setBackendServerPort(Long backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Long getBackendServerPort() {
        return this.backendServerPort;
    }

    public CreateLoadbalanceListenerRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateLoadbalanceListenerRequest setCertificateIaasId(String certificateIaasId) {
        this.certificateIaasId = certificateIaasId;
        return this;
    }
    public String getCertificateIaasId() {
        return this.certificateIaasId;
    }

    public CreateLoadbalanceListenerRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CreateLoadbalanceListenerRequest setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public CreateLoadbalanceListenerRequest setCookieTimeout(Long cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Long getCookieTimeout() {
        return this.cookieTimeout;
    }

    public CreateLoadbalanceListenerRequest setEstablishedTimeout(Long establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Long getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public CreateLoadbalanceListenerRequest setGmCryptoCertIaasId(String gmCryptoCertIaasId) {
        this.gmCryptoCertIaasId = gmCryptoCertIaasId;
        return this;
    }
    public String getGmCryptoCertIaasId() {
        return this.gmCryptoCertIaasId;
    }

    public CreateLoadbalanceListenerRequest setGmSignCertIaasId(String gmSignCertIaasId) {
        this.gmSignCertIaasId = gmSignCertIaasId;
        return this;
    }
    public String getGmSignCertIaasId() {
        return this.gmSignCertIaasId;
    }

    public CreateLoadbalanceListenerRequest setHealthMonitor(ListenerHealthMonitor healthMonitor) {
        this.healthMonitor = healthMonitor;
        return this;
    }
    public ListenerHealthMonitor getHealthMonitor() {
        return this.healthMonitor;
    }

    public CreateLoadbalanceListenerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLoadbalanceListenerRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadbalanceListenerRequest setPersistTimeout(Long persistTimeout) {
        this.persistTimeout = persistTimeout;
        return this;
    }
    public Long getPersistTimeout() {
        return this.persistTimeout;
    }

    public CreateLoadbalanceListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadbalanceListenerRequest setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public CreateLoadbalanceListenerRequest setTlsCipherPolicy(String tlsCipherPolicy) {
        this.tlsCipherPolicy = tlsCipherPolicy;
        return this;
    }
    public String getTlsCipherPolicy() {
        return this.tlsCipherPolicy;
    }

    public CreateLoadbalanceListenerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLoadbalanceListenerRequest setVComputerGroupId(String vComputerGroupId) {
        this.vComputerGroupId = vComputerGroupId;
        return this;
    }
    public String getVComputerGroupId() {
        return this.vComputerGroupId;
    }

    public CreateLoadbalanceListenerRequest setXForwardedFor(String xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }

}
