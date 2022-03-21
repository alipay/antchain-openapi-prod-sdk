// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BaseCustomerUmktInfoModel extends TeaModel {
    // 用户凭证
    @NameInMap("customer_key")
    public String customerKey;

    // 输入模板
    @NameInMap("query_template")
    public String queryTemplate;

    // 实时营销结果
    @NameInMap("umkt_result")
    public Long umktResult;

    public static BaseCustomerUmktInfoModel build(java.util.Map<String, ?> map) throws Exception {
        BaseCustomerUmktInfoModel self = new BaseCustomerUmktInfoModel();
        return TeaModel.build(map, self);
    }

    public BaseCustomerUmktInfoModel setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public BaseCustomerUmktInfoModel setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public BaseCustomerUmktInfoModel setUmktResult(Long umktResult) {
        this.umktResult = umktResult;
        return this;
    }
    public Long getUmktResult() {
        return this.umktResult;
    }

}
