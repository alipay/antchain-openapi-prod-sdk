// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetCaasApplicationManageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果
    @NameInMap("result")
    public ApplicationGetSkResp result;

    public static GetCaasApplicationManageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCaasApplicationManageResponse self = new GetCaasApplicationManageResponse();
        return TeaModel.build(map, self);
    }

    public GetCaasApplicationManageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCaasApplicationManageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCaasApplicationManageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCaasApplicationManageResponse setResult(ApplicationGetSkResp result) {
        this.result = result;
        return this;
    }
    public ApplicationGetSkResp getResult() {
        return this.result;
    }

}
