// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppserviceenvparamQuerywithdiffResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // json字符串
    @NameInMap("app_service_env_param_diff")
    public java.util.List<AppServiceEnvParam> appServiceEnvParamDiff;

    public static QueryAppserviceenvparamQuerywithdiffResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppserviceenvparamQuerywithdiffResponse self = new QueryAppserviceenvparamQuerywithdiffResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppserviceenvparamQuerywithdiffResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppserviceenvparamQuerywithdiffResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppserviceenvparamQuerywithdiffResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppserviceenvparamQuerywithdiffResponse setAppServiceEnvParamDiff(java.util.List<AppServiceEnvParam> appServiceEnvParamDiff) {
        this.appServiceEnvParamDiff = appServiceEnvParamDiff;
        return this;
    }
    public java.util.List<AppServiceEnvParam> getAppServiceEnvParamDiff() {
        return this.appServiceEnvParamDiff;
    }

}
