// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class RegisterAntdigitalAssetSupplierAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要创建的租户id，1开头的8位数字
    @NameInMap("target_tenant_id")
    @Validation(required = true)
    public String targetTenantId;

    // 租户名称，可填服务商简称
    @NameInMap("target_tenant_name")
    @Validation(required = true)
    public String targetTenantName;

    // 帐号名称，邮箱格式
    @NameInMap("master_account")
    @Validation(required = true)
    public String masterAccount;

    // 密码必须包含大写字母、小写字母、特殊字符、数字以及长度8-15位!
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    public static RegisterAntdigitalAssetSupplierAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAntdigitalAssetSupplierAccountRequest self = new RegisterAntdigitalAssetSupplierAccountRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAntdigitalAssetSupplierAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterAntdigitalAssetSupplierAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterAntdigitalAssetSupplierAccountRequest setTargetTenantId(String targetTenantId) {
        this.targetTenantId = targetTenantId;
        return this;
    }
    public String getTargetTenantId() {
        return this.targetTenantId;
    }

    public RegisterAntdigitalAssetSupplierAccountRequest setTargetTenantName(String targetTenantName) {
        this.targetTenantName = targetTenantName;
        return this;
    }
    public String getTargetTenantName() {
        return this.targetTenantName;
    }

    public RegisterAntdigitalAssetSupplierAccountRequest setMasterAccount(String masterAccount) {
        this.masterAccount = masterAccount;
        return this;
    }
    public String getMasterAccount() {
        return this.masterAccount;
    }

    public RegisterAntdigitalAssetSupplierAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
