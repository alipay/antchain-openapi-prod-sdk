// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopCompanyOpinionCount extends TeaModel {
    // 企业名称
    /**
     * <strong>example:</strong>
     * <p>福州北辰智创投资中心</p>
     */
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 企业对应的舆情数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Integer count;

    public static RtopCompanyOpinionCount build(java.util.Map<String, ?> map) throws Exception {
        RtopCompanyOpinionCount self = new RtopCompanyOpinionCount();
        return TeaModel.build(map, self);
    }

    public RtopCompanyOpinionCount setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public RtopCompanyOpinionCount setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

}
