// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class AccountInfo extends TeaModel {
    // 托管账户的账户名称，也是链上账户名称，交易发起方账户
    @NameInMap("account")
    public String account;

    // 托管账户对应的秘钥ID
    @NameInMap("kms_id")
    public String kmsId;

    // 托管账户对应的租户ID，默认为空，如有使用其他租户的托管账户时需指定
    @NameInMap("tenant_id")
    public String tenantId;

    // 非托管模式下必须输入，客户端构建交易出的信息，base64编码
    @NameInMap("sign_data")
    public String signData;

    public static AccountInfo build(java.util.Map<String, ?> map) throws Exception {
        AccountInfo self = new AccountInfo();
        return TeaModel.build(map, self);
    }

    public AccountInfo setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public AccountInfo setKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }
    public String getKmsId() {
        return this.kmsId;
    }

    public AccountInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AccountInfo setSignData(String signData) {
        this.signData = signData;
        return this;
    }
    public String getSignData() {
        return this.signData;
    }

}
