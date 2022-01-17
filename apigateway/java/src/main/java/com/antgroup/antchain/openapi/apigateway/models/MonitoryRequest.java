// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class MonitoryRequest extends TeaModel {
    // API标识
    @NameInMap("api_id")
    public String apiId;

    // App标识
    @NameInMap("app_id")
    public String appId;

    // code
    @NameInMap("code")
    public String code;

    // 开始时间
    @NameInMap("start_time")
    public Long startTime;

    // end_time
    @NameInMap("end_time")
    public Long endTime;

    public static MonitoryRequest build(java.util.Map<String, ?> map) throws Exception {
        MonitoryRequest self = new MonitoryRequest();
        return TeaModel.build(map, self);
    }

    public MonitoryRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public MonitoryRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MonitoryRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MonitoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public MonitoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
