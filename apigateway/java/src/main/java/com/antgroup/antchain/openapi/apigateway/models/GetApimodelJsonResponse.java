// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class GetApimodelJsonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public String data;

    // req_params
    @NameInMap("req_params")
    public java.util.List<ApiParamVO> reqParams;

    public static GetApimodelJsonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApimodelJsonResponse self = new GetApimodelJsonResponse();
        return TeaModel.build(map, self);
    }

    public GetApimodelJsonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetApimodelJsonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetApimodelJsonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetApimodelJsonResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetApimodelJsonResponse setReqParams(java.util.List<ApiParamVO> reqParams) {
        this.reqParams = reqParams;
        return this;
    }
    public java.util.List<ApiParamVO> getReqParams() {
        return this.reqParams;
    }

}
