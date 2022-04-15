// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class FinishRbbRegdatasyncScheduleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 时间分区
    @NameInMap("biz_date")
    @Validation(required = true, maxLength = 8, minLength = 8)
    public String bizDate;

    // 记录当前分区离线同步情况
    @NameInMap("sync_info")
    @Validation(required = true)
    public String syncInfo;

    public static FinishRbbRegdatasyncScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishRbbRegdatasyncScheduleRequest self = new FinishRbbRegdatasyncScheduleRequest();
        return TeaModel.build(map, self);
    }

    public FinishRbbRegdatasyncScheduleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishRbbRegdatasyncScheduleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishRbbRegdatasyncScheduleRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public FinishRbbRegdatasyncScheduleRequest setSyncInfo(String syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
    public String getSyncInfo() {
        return this.syncInfo;
    }

}
