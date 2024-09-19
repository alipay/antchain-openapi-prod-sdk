// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GwFundRouterResult extends TeaModel {
    // 资金方代码
    @NameInMap("fund_code")
    @Validation(required = true)
    public String fundCode;

    // 资金方简称
    @NameInMap("abbre_fund_name")
    @Validation(required = true)
    public String abbreFundName;

    public static GwFundRouterResult build(java.util.Map<String, ?> map) throws Exception {
        GwFundRouterResult self = new GwFundRouterResult();
        return TeaModel.build(map, self);
    }

    public GwFundRouterResult setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

    public GwFundRouterResult setAbbreFundName(String abbreFundName) {
        this.abbreFundName = abbreFundName;
        return this;
    }
    public String getAbbreFundName() {
        return this.abbreFundName;
    }

}
