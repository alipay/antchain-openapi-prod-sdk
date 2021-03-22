// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class OpenConsumecardWalletRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 操作类型(0 开通钱包)
    @NameInMap("operate_type")
    @Validation(required = true)
    public Long operateType;

    // 角色(1 机构, 2 个人)
    @NameInMap("role_type")
    @Validation(required = true)
    public Long roleType;

    // 钱包类型（0:余额账户）
    @NameInMap("wallet_type")
    @Validation(required = true)
    public Long walletType;

    public static OpenConsumecardWalletRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenConsumecardWalletRequest self = new OpenConsumecardWalletRequest();
        return TeaModel.build(map, self);
    }

    public OpenConsumecardWalletRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenConsumecardWalletRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenConsumecardWalletRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public OpenConsumecardWalletRequest setOperateType(Long operateType) {
        this.operateType = operateType;
        return this;
    }
    public Long getOperateType() {
        return this.operateType;
    }

    public OpenConsumecardWalletRequest setRoleType(Long roleType) {
        this.roleType = roleType;
        return this;
    }
    public Long getRoleType() {
        return this.roleType;
    }

    public OpenConsumecardWalletRequest setWalletType(Long walletType) {
        this.walletType = walletType;
        return this;
    }
    public Long getWalletType() {
        return this.walletType;
    }

}
