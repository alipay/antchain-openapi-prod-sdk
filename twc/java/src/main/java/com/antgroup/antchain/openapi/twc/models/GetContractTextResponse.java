// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetContractTextResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证信息对象的JSON序列化形式
    @NameInMap("notary_data")
    public String notaryData;

    public static GetContractTextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContractTextResponse self = new GetContractTextResponse();
        return TeaModel.build(map, self);
    }

    public GetContractTextResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetContractTextResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetContractTextResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetContractTextResponse setNotaryData(String notaryData) {
        this.notaryData = notaryData;
        return this;
    }
    public String getNotaryData() {
        return this.notaryData;
    }

}
