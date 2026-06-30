// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomerRpspInfosModel extends TeaModel {
    // 归属用户的混合分层决策结果
    @NameInMap("rpsp_results")
    @Validation(required = true)
    public java.util.List<RpspInfoModel> rpspResults;

    // 用户凭证
    /**
     * <strong>example:</strong>
     * <p>8002c3d97e7d4d20a0647c75dfab1efe</p>
     */
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    public static CustomerRpspInfosModel build(java.util.Map<String, ?> map) throws Exception {
        CustomerRpspInfosModel self = new CustomerRpspInfosModel();
        return TeaModel.build(map, self);
    }

    public CustomerRpspInfosModel setRpspResults(java.util.List<RpspInfoModel> rpspResults) {
        this.rpspResults = rpspResults;
        return this;
    }
    public java.util.List<RpspInfoModel> getRpspResults() {
        return this.rpspResults;
    }

    public CustomerRpspInfosModel setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

}
