// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class RegisterChainsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链唯一标识符
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链配置的最后更新时间（用于标识版本）
    @NameInMap("ver")
    @Validation(required = true)
    public Long ver;

    // 链类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 节点RPC接口地址
    @NameInMap("mychain_nodes")
    public java.util.List<String> mychainNodes;

    // MyChain版本
    @NameInMap("mychain_type")
    public String mychainType;

    // base64编码的JDS
    @NameInMap("mychain_truststore")
    public String mychainTruststore;

    // -
    @NameInMap("mychain_truststore_password")
    public String mychainTruststorePassword;

    // -
    @NameInMap("mychain_client_crt")
    public String mychainClientCrt;

    // -
    @NameInMap("mychain_client_key")
    public String mychainClientKey;

    // -
    @NameInMap("mychain_client_key_pwd")
    public String mychainClientKeyPwd;

    // -
    @NameInMap("mychain_tls_algo")
    public String mychainTlsAlgo;

    // -
    @NameInMap("mychain_identity_algo")
    public String mychainIdentityAlgo;

    // 子链 groupID
    @NameInMap("mychain_groupid")
    public String mychainGroupid;

    // 子链的父链ID
    @NameInMap("mychain_parent_bizid")
    public String mychainParentBizid;

    // Aldaba 链节点地址
    @NameInMap("aldaba_nodes")
    public java.util.List<String> aldabaNodes;

    // Aldaba 链使用的协议，支持 WebSocket / Tcp; 默认 WebSocket
    @NameInMap("aldaba_network_protocol")
    public String aldabaNetworkProtocol;

    // Aldaba 链base64编码的JDS
    @NameInMap("aldaba_tls_root_truststore")
    public String aldabaTlsRootTruststore;

    // Aldaba 链 JDS 密码
    @NameInMap("aldaba_tls_root_truststore_password")
    public String aldabaTlsRootTruststorePassword;

    // Aldaba 链 base64编码的证书
    @NameInMap("aldaba_tls_client_certificate")
    public String aldabaTlsClientCertificate;

    // Aldaba 链 base64编码的密钥
    @NameInMap("aldaba_tls_client_key")
    public String aldabaTlsClientKey;

    // Aldaba 链密钥密码
    @NameInMap("aldaba_tls_client_key_password")
    public String aldabaTlsClientKeyPassword;

    // Aldaba 链 base64 编码的 sender 密钥
    @NameInMap("aldaba_sender_key")
    public String aldabaSenderKey;

    // Aldaba 链 sender 密钥的密码
    @NameInMap("aldaba_sender_key_password")
    public String aldabaSenderKeyPassword;

    public static RegisterChainsRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterChainsRequest self = new RegisterChainsRequest();
        return TeaModel.build(map, self);
    }

    public RegisterChainsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterChainsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterChainsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RegisterChainsRequest setVer(Long ver) {
        this.ver = ver;
        return this;
    }
    public Long getVer() {
        return this.ver;
    }

    public RegisterChainsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RegisterChainsRequest setMychainNodes(java.util.List<String> mychainNodes) {
        this.mychainNodes = mychainNodes;
        return this;
    }
    public java.util.List<String> getMychainNodes() {
        return this.mychainNodes;
    }

    public RegisterChainsRequest setMychainType(String mychainType) {
        this.mychainType = mychainType;
        return this;
    }
    public String getMychainType() {
        return this.mychainType;
    }

    public RegisterChainsRequest setMychainTruststore(String mychainTruststore) {
        this.mychainTruststore = mychainTruststore;
        return this;
    }
    public String getMychainTruststore() {
        return this.mychainTruststore;
    }

    public RegisterChainsRequest setMychainTruststorePassword(String mychainTruststorePassword) {
        this.mychainTruststorePassword = mychainTruststorePassword;
        return this;
    }
    public String getMychainTruststorePassword() {
        return this.mychainTruststorePassword;
    }

    public RegisterChainsRequest setMychainClientCrt(String mychainClientCrt) {
        this.mychainClientCrt = mychainClientCrt;
        return this;
    }
    public String getMychainClientCrt() {
        return this.mychainClientCrt;
    }

    public RegisterChainsRequest setMychainClientKey(String mychainClientKey) {
        this.mychainClientKey = mychainClientKey;
        return this;
    }
    public String getMychainClientKey() {
        return this.mychainClientKey;
    }

    public RegisterChainsRequest setMychainClientKeyPwd(String mychainClientKeyPwd) {
        this.mychainClientKeyPwd = mychainClientKeyPwd;
        return this;
    }
    public String getMychainClientKeyPwd() {
        return this.mychainClientKeyPwd;
    }

    public RegisterChainsRequest setMychainTlsAlgo(String mychainTlsAlgo) {
        this.mychainTlsAlgo = mychainTlsAlgo;
        return this;
    }
    public String getMychainTlsAlgo() {
        return this.mychainTlsAlgo;
    }

    public RegisterChainsRequest setMychainIdentityAlgo(String mychainIdentityAlgo) {
        this.mychainIdentityAlgo = mychainIdentityAlgo;
        return this;
    }
    public String getMychainIdentityAlgo() {
        return this.mychainIdentityAlgo;
    }

    public RegisterChainsRequest setMychainGroupid(String mychainGroupid) {
        this.mychainGroupid = mychainGroupid;
        return this;
    }
    public String getMychainGroupid() {
        return this.mychainGroupid;
    }

    public RegisterChainsRequest setMychainParentBizid(String mychainParentBizid) {
        this.mychainParentBizid = mychainParentBizid;
        return this;
    }
    public String getMychainParentBizid() {
        return this.mychainParentBizid;
    }

    public RegisterChainsRequest setAldabaNodes(java.util.List<String> aldabaNodes) {
        this.aldabaNodes = aldabaNodes;
        return this;
    }
    public java.util.List<String> getAldabaNodes() {
        return this.aldabaNodes;
    }

    public RegisterChainsRequest setAldabaNetworkProtocol(String aldabaNetworkProtocol) {
        this.aldabaNetworkProtocol = aldabaNetworkProtocol;
        return this;
    }
    public String getAldabaNetworkProtocol() {
        return this.aldabaNetworkProtocol;
    }

    public RegisterChainsRequest setAldabaTlsRootTruststore(String aldabaTlsRootTruststore) {
        this.aldabaTlsRootTruststore = aldabaTlsRootTruststore;
        return this;
    }
    public String getAldabaTlsRootTruststore() {
        return this.aldabaTlsRootTruststore;
    }

    public RegisterChainsRequest setAldabaTlsRootTruststorePassword(String aldabaTlsRootTruststorePassword) {
        this.aldabaTlsRootTruststorePassword = aldabaTlsRootTruststorePassword;
        return this;
    }
    public String getAldabaTlsRootTruststorePassword() {
        return this.aldabaTlsRootTruststorePassword;
    }

    public RegisterChainsRequest setAldabaTlsClientCertificate(String aldabaTlsClientCertificate) {
        this.aldabaTlsClientCertificate = aldabaTlsClientCertificate;
        return this;
    }
    public String getAldabaTlsClientCertificate() {
        return this.aldabaTlsClientCertificate;
    }

    public RegisterChainsRequest setAldabaTlsClientKey(String aldabaTlsClientKey) {
        this.aldabaTlsClientKey = aldabaTlsClientKey;
        return this;
    }
    public String getAldabaTlsClientKey() {
        return this.aldabaTlsClientKey;
    }

    public RegisterChainsRequest setAldabaTlsClientKeyPassword(String aldabaTlsClientKeyPassword) {
        this.aldabaTlsClientKeyPassword = aldabaTlsClientKeyPassword;
        return this;
    }
    public String getAldabaTlsClientKeyPassword() {
        return this.aldabaTlsClientKeyPassword;
    }

    public RegisterChainsRequest setAldabaSenderKey(String aldabaSenderKey) {
        this.aldabaSenderKey = aldabaSenderKey;
        return this;
    }
    public String getAldabaSenderKey() {
        return this.aldabaSenderKey;
    }

    public RegisterChainsRequest setAldabaSenderKeyPassword(String aldabaSenderKeyPassword) {
        this.aldabaSenderKeyPassword = aldabaSenderKeyPassword;
        return this;
    }
    public String getAldabaSenderKeyPassword() {
        return this.aldabaSenderKeyPassword;
    }

}
