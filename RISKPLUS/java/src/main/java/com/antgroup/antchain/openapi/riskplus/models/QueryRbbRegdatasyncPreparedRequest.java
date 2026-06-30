// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRbbRegdatasyncPreparedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询该bizDate数据分区的数据是否已经准备好
    @NameInMap("biz_date")
    @Validation(required = true, maxLength = 8, minLength = 8)
    public String bizDate;

    public static QueryRbbRegdatasyncPreparedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbbRegdatasyncPreparedRequest self = new QueryRbbRegdatasyncPreparedRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbbRegdatasyncPreparedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRbbRegdatasyncPreparedRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRbbRegdatasyncPreparedRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

}
