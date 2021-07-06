// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitCaCertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务唯一性uuid，用于后续的证书查询
    @NameInMap("biz_uuid")
    @Validation(required = true)
    public String bizUuid;

    // 证书请求(CSR)
    @NameInMap("command")
    @Validation(required = true)
    public String command;

    // 8B75D2EEDF1658CC9C1B7C05AA600856  区块链-baasplus平台对外持牌证书服务场景
    // 2D25EFFD786590991542CAE2D14CB18E   区块链-baasplus平台对外非持牌证书服务场景
    @NameInMap("config_id")
    @Validation(required = true)
    public String configId;

    public static InitCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCaCertificateRequest self = new InitCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public InitCaCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitCaCertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitCaCertificateRequest setBizUuid(String bizUuid) {
        this.bizUuid = bizUuid;
        return this;
    }
    public String getBizUuid() {
        return this.bizUuid;
    }

    public InitCaCertificateRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public InitCaCertificateRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

}
