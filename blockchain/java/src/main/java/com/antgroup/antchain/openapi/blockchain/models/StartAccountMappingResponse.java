// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAccountMappingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 映射结果
    @NameInMap("data")
    public AccountMappingResult data;

    public static StartAccountMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAccountMappingResponse self = new StartAccountMappingResponse();
        return TeaModel.build(map, self);
    }

    public StartAccountMappingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAccountMappingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAccountMappingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAccountMappingResponse setData(AccountMappingResult data) {
        this.data = data;
        return this;
    }
    public AccountMappingResult getData() {
        return this.data;
    }

}
