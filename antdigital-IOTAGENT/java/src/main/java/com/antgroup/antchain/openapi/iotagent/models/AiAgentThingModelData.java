// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class AiAgentThingModelData extends TeaModel {
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    @NameInMap("device_id")
    public String deviceId;

    @NameInMap("feature_id")
    @Validation(required = true)
    public String featureId;

    @NameInMap("report_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String reportTime;

    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static AiAgentThingModelData build(java.util.Map<String, ?> map) throws Exception {
        AiAgentThingModelData self = new AiAgentThingModelData();
        return TeaModel.build(map, self);
    }

    public AiAgentThingModelData setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AiAgentThingModelData setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AiAgentThingModelData setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AiAgentThingModelData setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

    public AiAgentThingModelData setReportTime(String reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public String getReportTime() {
        return this.reportTime;
    }

    public AiAgentThingModelData setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
