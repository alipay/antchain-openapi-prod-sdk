// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CheckIdcardFourmetaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // true:匹配成功 false：匹配失败
    @NameInMap("match")
    public String match;

    // 扩展信息，预留字段
    @NameInMap("extern_info")
    public String externInfo;

    public static CheckIdcardFourmetaResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckIdcardFourmetaResponse self = new CheckIdcardFourmetaResponse();
        return TeaModel.build(map, self);
    }

    public CheckIdcardFourmetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckIdcardFourmetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckIdcardFourmetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckIdcardFourmetaResponse setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public CheckIdcardFourmetaResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
