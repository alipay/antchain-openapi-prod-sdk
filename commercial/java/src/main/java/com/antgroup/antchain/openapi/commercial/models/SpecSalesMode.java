// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class SpecSalesMode extends TeaModel {
    // 规格售卖模式
    @NameInMap("sales_mode_code")
    @Validation(required = true)
    public String salesModeCode;

    // 售卖模式
    @NameInMap("sales_mode_name")
    @Validation(required = true)
    public String salesModeName;

    public static SpecSalesMode build(java.util.Map<String, ?> map) throws Exception {
        SpecSalesMode self = new SpecSalesMode();
        return TeaModel.build(map, self);
    }

    public SpecSalesMode setSalesModeCode(String salesModeCode) {
        this.salesModeCode = salesModeCode;
        return this;
    }
    public String getSalesModeCode() {
        return this.salesModeCode;
    }

    public SpecSalesMode setSalesModeName(String salesModeName) {
        this.salesModeName = salesModeName;
        return this;
    }
    public String getSalesModeName() {
        return this.salesModeName;
    }

}
