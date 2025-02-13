// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimSalesInfo extends TeaModel {
    // 销售对外业务id
    @NameInMap("sales_id")
    @Validation(required = true)
    public String salesId;

    public static SimSalesInfo build(java.util.Map<String, ?> map) throws Exception {
        SimSalesInfo self = new SimSalesInfo();
        return TeaModel.build(map, self);
    }

    public SimSalesInfo setSalesId(String salesId) {
        this.salesId = salesId;
        return this;
    }
    public String getSalesId() {
        return this.salesId;
    }

}
