// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SubMerchantParams extends TeaModel {
    // 子商户的商户id
    @NameInMap("sub_merchant_id")
    @Validation(required = true)
    public String subMerchantId;

    // 子商户的商户名称
    @NameInMap("sub_merchant_name")
    @Validation(required = true)
    public String subMerchantName;

    // 子商户的服务名称
    @NameInMap("sub_merchant_service_name")
    @Validation(required = true)
    public String subMerchantServiceName;

    // 子商户的服务描述
    @NameInMap("sub_merchant_service_description")
    @Validation(required = true)
    public String subMerchantServiceDescription;

    public static SubMerchantParams build(java.util.Map<String, ?> map) throws Exception {
        SubMerchantParams self = new SubMerchantParams();
        return TeaModel.build(map, self);
    }

    public SubMerchantParams setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
        return this;
    }
    public String getSubMerchantId() {
        return this.subMerchantId;
    }

    public SubMerchantParams setSubMerchantName(String subMerchantName) {
        this.subMerchantName = subMerchantName;
        return this;
    }
    public String getSubMerchantName() {
        return this.subMerchantName;
    }

    public SubMerchantParams setSubMerchantServiceName(String subMerchantServiceName) {
        this.subMerchantServiceName = subMerchantServiceName;
        return this;
    }
    public String getSubMerchantServiceName() {
        return this.subMerchantServiceName;
    }

    public SubMerchantParams setSubMerchantServiceDescription(String subMerchantServiceDescription) {
        this.subMerchantServiceDescription = subMerchantServiceDescription;
        return this;
    }
    public String getSubMerchantServiceDescription() {
        return this.subMerchantServiceDescription;
    }

}
