// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateAppserviceenvparamUpdateparamsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // AppServiceEnvParam集合
    @NameInMap("app_service_env_param")
    public java.util.List<AppServiceEnvParam> appServiceEnvParam;

    public static UpdateAppserviceenvparamUpdateparamsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppserviceenvparamUpdateparamsResponse self = new UpdateAppserviceenvparamUpdateparamsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppserviceenvparamUpdateparamsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateAppserviceenvparamUpdateparamsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateAppserviceenvparamUpdateparamsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateAppserviceenvparamUpdateparamsResponse setAppServiceEnvParam(java.util.List<AppServiceEnvParam> appServiceEnvParam) {
        this.appServiceEnvParam = appServiceEnvParam;
        return this;
    }
    public java.util.List<AppServiceEnvParam> getAppServiceEnvParam() {
        return this.appServiceEnvParam;
    }

}
