// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class StartBaasOdatsFabricRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通道名
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // fabric yaml 配置文件
    @NameInMap("config_yaml")
    @Validation(required = true)
    public String configYaml;

    // 详细描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 链域名
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // fabric 密码
    @NameInMap("secret")
    public String secret;

    // fabir链接用户名
    @NameInMap("username")
    public String username;

    // fabric用户证书
    @NameInMap("user_cert")
    public String userCert;

    // fabric用户密钥
    @NameInMap("user_key")
    public String userKey;

    // 验证节点列表
    @NameInMap("validator_peer_name_list")
    @Validation(required = true)
    public java.util.List<String> validatorPeerNameList;

    public static StartBaasOdatsFabricRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasOdatsFabricRequest self = new StartBaasOdatsFabricRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasOdatsFabricRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasOdatsFabricRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasOdatsFabricRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public StartBaasOdatsFabricRequest setConfigYaml(String configYaml) {
        this.configYaml = configYaml;
        return this;
    }
    public String getConfigYaml() {
        return this.configYaml;
    }

    public StartBaasOdatsFabricRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartBaasOdatsFabricRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public StartBaasOdatsFabricRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public StartBaasOdatsFabricRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public StartBaasOdatsFabricRequest setUserCert(String userCert) {
        this.userCert = userCert;
        return this;
    }
    public String getUserCert() {
        return this.userCert;
    }

    public StartBaasOdatsFabricRequest setUserKey(String userKey) {
        this.userKey = userKey;
        return this;
    }
    public String getUserKey() {
        return this.userKey;
    }

    public StartBaasOdatsFabricRequest setValidatorPeerNameList(java.util.List<String> validatorPeerNameList) {
        this.validatorPeerNameList = validatorPeerNameList;
        return this;
    }
    public java.util.List<String> getValidatorPeerNameList() {
        return this.validatorPeerNameList;
    }

}
