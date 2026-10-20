// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ReportHealthDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备唯一id
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 上报时间时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 数据类别 健康指标:HEALTH_METRIC/GPS定位:GPS_LOCATION/告警事件:ALERT_EVENT/设备信息:DEVICE_INFO
    @NameInMap("data_category")
    @Validation(required = true)
    public String dataCategory;

    // 数据内容 json传输，与不同category一一映射
    @NameInMap("payload")
    @Validation(required = true)
    public String payload;

    public static ReportHealthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportHealthDataRequest self = new ReportHealthDataRequest();
        return TeaModel.build(map, self);
    }

    public ReportHealthDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReportHealthDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReportHealthDataRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public ReportHealthDataRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public ReportHealthDataRequest setDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }
    public String getDataCategory() {
        return this.dataCategory;
    }

    public ReportHealthDataRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

}
