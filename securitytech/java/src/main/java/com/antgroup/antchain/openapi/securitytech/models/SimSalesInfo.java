// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimSalesInfo extends TeaModel {
    // 销售对外业务id
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sales_id")
    @Validation(required = true)
    public String salesId;

    // 销售角色 法人:TWEV_STORE_MANAGER/销售:TWEV_SALES
    /**
     * <strong>example:</strong>
     * <p>TWEV_STORE_MANAGER</p>
     */
    @NameInMap("sales_type")
    @Validation(required = true)
    public String salesType;

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

    public SimSalesInfo setSalesType(String salesType) {
        this.salesType = salesType;
        return this;
    }
    public String getSalesType() {
        return this.salesType;
    }

}
