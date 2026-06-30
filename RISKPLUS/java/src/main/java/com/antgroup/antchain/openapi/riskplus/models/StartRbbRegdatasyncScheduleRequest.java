// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class StartRbbRegdatasyncScheduleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 同步时间分区
    @NameInMap("biz_date")
    @Validation(required = true)
    public String bizDate;

    public static StartRbbRegdatasyncScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRbbRegdatasyncScheduleRequest self = new StartRbbRegdatasyncScheduleRequest();
        return TeaModel.build(map, self);
    }

    public StartRbbRegdatasyncScheduleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartRbbRegdatasyncScheduleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartRbbRegdatasyncScheduleRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

}
