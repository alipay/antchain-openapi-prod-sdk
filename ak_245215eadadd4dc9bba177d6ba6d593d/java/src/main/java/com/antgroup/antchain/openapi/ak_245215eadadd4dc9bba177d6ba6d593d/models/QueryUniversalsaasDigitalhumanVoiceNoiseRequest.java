// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanVoiceNoiseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 音频检测任务taskId
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryUniversalsaasDigitalhumanVoiceNoiseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanVoiceNoiseRequest self = new QueryUniversalsaasDigitalhumanVoiceNoiseRequest();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanVoiceNoiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUniversalsaasDigitalhumanVoiceNoiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUniversalsaasDigitalhumanVoiceNoiseRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
