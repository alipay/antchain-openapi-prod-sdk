// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CheckAntdigitalWebttsDacWhitelistRequest extends TeaModel {
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

    // 白名单地址
    @NameInMap("whitelist_address")
    @Validation(required = true)
    public String whitelistAddress;

    public static CheckAntdigitalWebttsDacWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAntdigitalWebttsDacWhitelistRequest self = new CheckAntdigitalWebttsDacWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public CheckAntdigitalWebttsDacWhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAntdigitalWebttsDacWhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckAntdigitalWebttsDacWhitelistRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public CheckAntdigitalWebttsDacWhitelistRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CheckAntdigitalWebttsDacWhitelistRequest setWhitelistAddress(String whitelistAddress) {
        this.whitelistAddress = whitelistAddress;
        return this;
    }
    public String getWhitelistAddress() {
        return this.whitelistAddress;
    }

}
