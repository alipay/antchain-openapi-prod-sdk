// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class ExecRobotBaasplusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 目标请求id
    @NameInMap("target_req_id")
    public String targetReqId;

    // 目标请求参数
    @NameInMap("target_param")
    public String targetParam;

    // 是否重试
    @NameInMap("retry_flag")
    @Validation(required = true)
    public Boolean retryFlag;

    public static ExecRobotBaasplusRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecRobotBaasplusRequest self = new ExecRobotBaasplusRequest();
        return TeaModel.build(map, self);
    }

    public ExecRobotBaasplusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecRobotBaasplusRequest setTargetReqId(String targetReqId) {
        this.targetReqId = targetReqId;
        return this;
    }
    public String getTargetReqId() {
        return this.targetReqId;
    }

    public ExecRobotBaasplusRequest setTargetParam(String targetParam) {
        this.targetParam = targetParam;
        return this;
    }
    public String getTargetParam() {
        return this.targetParam;
    }

    public ExecRobotBaasplusRequest setRetryFlag(Boolean retryFlag) {
        this.retryFlag = retryFlag;
        return this;
    }
    public Boolean getRetryFlag() {
        return this.retryFlag;
    }

}
