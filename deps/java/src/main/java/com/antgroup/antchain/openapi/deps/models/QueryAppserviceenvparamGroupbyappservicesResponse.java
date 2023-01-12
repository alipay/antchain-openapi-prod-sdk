// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppserviceenvparamGroupbyappservicesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 环境变量json字符串
    @NameInMap("app_service_env_param")
    public String appServiceEnvParam;

    public static QueryAppserviceenvparamGroupbyappservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppserviceenvparamGroupbyappservicesResponse self = new QueryAppserviceenvparamGroupbyappservicesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppserviceenvparamGroupbyappservicesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppserviceenvparamGroupbyappservicesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppserviceenvparamGroupbyappservicesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppserviceenvparamGroupbyappservicesResponse setAppServiceEnvParam(String appServiceEnvParam) {
        this.appServiceEnvParam = appServiceEnvParam;
        return this;
    }
    public String getAppServiceEnvParam() {
        return this.appServiceEnvParam;
    }

}
