// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QuerySdkApiResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前版本sdk包含api信息列表
    @NameInMap("api_info_models")
    public java.util.List<ApiInfoModel> apiInfoModels;

    public static QuerySdkApiResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySdkApiResponse self = new QuerySdkApiResponse();
        return TeaModel.build(map, self);
    }

    public QuerySdkApiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySdkApiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySdkApiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySdkApiResponse setApiInfoModels(java.util.List<ApiInfoModel> apiInfoModels) {
        this.apiInfoModels = apiInfoModels;
        return this;
    }
    public java.util.List<ApiInfoModel> getApiInfoModels() {
        return this.apiInfoModels;
    }

}
