// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetTextResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 存证信息
    @NameInMap("content")
    public String content;

    // 可信信息
    @NameInMap("tsr")
    public TsrResponse tsr;

    // 文本存证类型
    @NameInMap("text_notary_type")
    public String textNotaryType;

    // 哈希算法
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    public static GetTextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTextResponse self = new GetTextResponse();
        return TeaModel.build(map, self);
    }

    public GetTextResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTextResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTextResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTextResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetTextResponse setTsr(TsrResponse tsr) {
        this.tsr = tsr;
        return this;
    }
    public TsrResponse getTsr() {
        return this.tsr;
    }

    public GetTextResponse setTextNotaryType(String textNotaryType) {
        this.textNotaryType = textNotaryType;
        return this;
    }
    public String getTextNotaryType() {
        return this.textNotaryType;
    }

    public GetTextResponse setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

}
