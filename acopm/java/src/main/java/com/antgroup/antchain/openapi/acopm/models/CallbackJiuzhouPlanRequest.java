// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class CallbackJiuzhouPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求标识
    @NameInMap("exec_id")
    @Validation(required = true)
    public String execId;

    // 回调数据
    @NameInMap("call_back_data")
    @Validation(required = true)
    public String callBackData;

    public static CallbackJiuzhouPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackJiuzhouPlanRequest self = new CallbackJiuzhouPlanRequest();
        return TeaModel.build(map, self);
    }

    public CallbackJiuzhouPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackJiuzhouPlanRequest setExecId(String execId) {
        this.execId = execId;
        return this;
    }
    public String getExecId() {
        return this.execId;
    }

    public CallbackJiuzhouPlanRequest setCallBackData(String callBackData) {
        this.callBackData = callBackData;
        return this;
    }
    public String getCallBackData() {
        return this.callBackData;
    }

}
