// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryAppparamResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 环境id
    @NameInMap("env_id")
    public String envId;

    // 产品码
    @NameInMap("prod_code")
    public String prodCode;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 启动参数的key-value列表
    @NameInMap("app_params")
    public java.util.List<ParamData> appParams;

    public static QueryAppparamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppparamResponse self = new QueryAppparamResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppparamResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppparamResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppparamResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppparamResponse setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public QueryAppparamResponse setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryAppparamResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAppparamResponse setAppParams(java.util.List<ParamData> appParams) {
        this.appParams = appParams;
        return this;
    }
    public java.util.List<ParamData> getAppParams() {
        return this.appParams;
    }

}
