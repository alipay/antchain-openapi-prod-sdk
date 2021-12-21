// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPOrderApplyInfo extends TeaModel {
    // 授权合作商品
    @NameInMap("auth_goods")
    @Validation(required = true)
    public String authGoods;

    // 销售规模数量
    @NameInMap("sales_amount")
    @Validation(required = true)
    public Long salesAmount;

    // 销售规模金额
    @NameInMap("sales_number")
    @Validation(required = true)
    public String salesNumber;

    public static IPOrderApplyInfo build(java.util.Map<String, ?> map) throws Exception {
        IPOrderApplyInfo self = new IPOrderApplyInfo();
        return TeaModel.build(map, self);
    }

    public IPOrderApplyInfo setAuthGoods(String authGoods) {
        this.authGoods = authGoods;
        return this;
    }
    public String getAuthGoods() {
        return this.authGoods;
    }

    public IPOrderApplyInfo setSalesAmount(Long salesAmount) {
        this.salesAmount = salesAmount;
        return this;
    }
    public Long getSalesAmount() {
        return this.salesAmount;
    }

    public IPOrderApplyInfo setSalesNumber(String salesNumber) {
        this.salesNumber = salesNumber;
        return this;
    }
    public String getSalesNumber() {
        return this.salesNumber;
    }

}
