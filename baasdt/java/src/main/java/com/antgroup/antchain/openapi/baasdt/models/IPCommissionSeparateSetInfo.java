// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCommissionSeparateSetInfo extends TeaModel {
    // 授权品类
    @NameInMap("category")
    public String category;

    // 佣金比例
    @NameInMap("commission_weight")
    public String commissionWeight;

    // 保底商品销售金额
    @NameInMap("guarantee_sale_number")
    public String guaranteeSaleNumber;

    public static IPCommissionSeparateSetInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCommissionSeparateSetInfo self = new IPCommissionSeparateSetInfo();
        return TeaModel.build(map, self);
    }

    public IPCommissionSeparateSetInfo setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public IPCommissionSeparateSetInfo setCommissionWeight(String commissionWeight) {
        this.commissionWeight = commissionWeight;
        return this;
    }
    public String getCommissionWeight() {
        return this.commissionWeight;
    }

    public IPCommissionSeparateSetInfo setGuaranteeSaleNumber(String guaranteeSaleNumber) {
        this.guaranteeSaleNumber = guaranteeSaleNumber;
        return this;
    }
    public String getGuaranteeSaleNumber() {
        return this.guaranteeSaleNumber;
    }

}
