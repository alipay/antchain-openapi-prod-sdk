// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class CheckBaasChainSubnetMemberResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 子链的机构列表
    @NameInMap("result")
    public ALiYunChainSubnetCheck result;

    public static CheckBaasChainSubnetMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBaasChainSubnetMemberResponse self = new CheckBaasChainSubnetMemberResponse();
        return TeaModel.build(map, self);
    }

    public CheckBaasChainSubnetMemberResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckBaasChainSubnetMemberResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckBaasChainSubnetMemberResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckBaasChainSubnetMemberResponse setResult(ALiYunChainSubnetCheck result) {
        this.result = result;
        return this;
    }
    public ALiYunChainSubnetCheck getResult() {
        return this.result;
    }

}
