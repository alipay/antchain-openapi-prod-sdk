// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class ResetAntdigitalWebttsDacWhitelistnicknameRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人Operator ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 白名单主表ID
    @NameInMap("whitelist_id")
    @Validation(required = true)
    public String whitelistId;

    // 新别名
    @NameInMap("nickname")
    @Validation(required = true)
    public String nickname;

    public static ResetAntdigitalWebttsDacWhitelistnicknameRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAntdigitalWebttsDacWhitelistnicknameRequest self = new ResetAntdigitalWebttsDacWhitelistnicknameRequest();
        return TeaModel.build(map, self);
    }

    public ResetAntdigitalWebttsDacWhitelistnicknameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetAntdigitalWebttsDacWhitelistnicknameRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetAntdigitalWebttsDacWhitelistnicknameRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public ResetAntdigitalWebttsDacWhitelistnicknameRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ResetAntdigitalWebttsDacWhitelistnicknameRequest setWhitelistId(String whitelistId) {
        this.whitelistId = whitelistId;
        return this;
    }
    public String getWhitelistId() {
        return this.whitelistId;
    }

    public ResetAntdigitalWebttsDacWhitelistnicknameRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

}
