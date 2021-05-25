// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ValueAddedServiceInfoWithSku extends TeaModel {
    // 增值服务信息
    @NameInMap("add_value_info")
    @Validation(required = true)
    public ValueAddedServiceInfo addValueInfo;

    // sku信息
    @NameInMap("skus")
    @Validation(required = true)
    public java.util.List<IpSkuEmphasisInfo> skus;

    public static ValueAddedServiceInfoWithSku build(java.util.Map<String, ?> map) throws Exception {
        ValueAddedServiceInfoWithSku self = new ValueAddedServiceInfoWithSku();
        return TeaModel.build(map, self);
    }

    public ValueAddedServiceInfoWithSku setAddValueInfo(ValueAddedServiceInfo addValueInfo) {
        this.addValueInfo = addValueInfo;
        return this;
    }
    public ValueAddedServiceInfo getAddValueInfo() {
        return this.addValueInfo;
    }

    public ValueAddedServiceInfoWithSku setSkus(java.util.List<IpSkuEmphasisInfo> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<IpSkuEmphasisInfo> getSkus() {
        return this.skus;
    }

}
