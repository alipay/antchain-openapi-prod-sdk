// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryDevicestatisticsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备SN号(最大限制100条)
    @NameInMap("serial_no_list")
    @Validation(required = true)
    public java.util.List<String> serialNoList;

    // 厂商名称
    // 为空时:默认值telpo(天波)
    // 可用枚举值:
    // telpo(天波) 
    // hemiao(禾苗)
    @NameInMap("crop_name")
    public String cropName;

    // 开始时间(精确到ms)
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束时间(精确到ms,时间跨度不能超过24h)
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    public static QueryDevicestatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicestatisticsRequest self = new QueryDevicestatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicestatisticsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDevicestatisticsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDevicestatisticsRequest setSerialNoList(java.util.List<String> serialNoList) {
        this.serialNoList = serialNoList;
        return this;
    }
    public java.util.List<String> getSerialNoList() {
        return this.serialNoList;
    }

    public QueryDevicestatisticsRequest setCropName(String cropName) {
        this.cropName = cropName;
        return this;
    }
    public String getCropName() {
        return this.cropName;
    }

    public QueryDevicestatisticsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryDevicestatisticsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
