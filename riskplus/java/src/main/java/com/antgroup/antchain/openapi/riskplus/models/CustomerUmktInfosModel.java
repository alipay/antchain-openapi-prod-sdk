// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomerUmktInfosModel extends TeaModel {
    // 归属用户的混合营销决策结果
    @NameInMap("umkt_results")
    @Validation(required = true)
    public java.util.List<UmktInfoModel> umktResults;

    // 用户凭证
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    public static CustomerUmktInfosModel build(java.util.Map<String, ?> map) throws Exception {
        CustomerUmktInfosModel self = new CustomerUmktInfosModel();
        return TeaModel.build(map, self);
    }

    public CustomerUmktInfosModel setUmktResults(java.util.List<UmktInfoModel> umktResults) {
        this.umktResults = umktResults;
        return this;
    }
    public java.util.List<UmktInfoModel> getUmktResults() {
        return this.umktResults;
    }

    public CustomerUmktInfosModel setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

}
