// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoUsciIndustryPair extends TeaModel {
    // 统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>统一社会信用代码</p>
     */
    @NameInMap("usci")
    public String usci;

    // 行业类型
    /**
     * <strong>example:</strong>
     * <p>行业类型</p>
     */
    @NameInMap("industry")
    public String industry;

    public static MaoUsciIndustryPair build(java.util.Map<String, ?> map) throws Exception {
        MaoUsciIndustryPair self = new MaoUsciIndustryPair();
        return TeaModel.build(map, self);
    }

    public MaoUsciIndustryPair setUsci(String usci) {
        this.usci = usci;
        return this;
    }
    public String getUsci() {
        return this.usci;
    }

    public MaoUsciIndustryPair setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

}
