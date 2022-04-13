// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetUnireleaseSolutionfileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布方案内容，Json文件
    @NameInMap("soultion_content")
    public String soultionContent;

    public static GetUnireleaseSolutionfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnireleaseSolutionfileResponse self = new GetUnireleaseSolutionfileResponse();
        return TeaModel.build(map, self);
    }

    public GetUnireleaseSolutionfileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetUnireleaseSolutionfileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUnireleaseSolutionfileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetUnireleaseSolutionfileResponse setSoultionContent(String soultionContent) {
        this.soultionContent = soultionContent;
        return this;
    }
    public String getSoultionContent() {
        return this.soultionContent;
    }

}
