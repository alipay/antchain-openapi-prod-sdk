// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class InitFaceplusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证会话唯一标识
    @NameInMap("zim_id")
    public String zimId;

    // 结果码
    @NameInMap("result_code_sub")
    public String resultCodeSub;

    // 结果信息
    // 
    @NameInMap("result_msg_sub")
    public String resultMsgSub;

    // 外部参数
    @NameInMap("extern_info")
    public String externInfo;

    public static InitFaceplusResponse build(java.util.Map<String, ?> map) throws Exception {
        InitFaceplusResponse self = new InitFaceplusResponse();
        return TeaModel.build(map, self);
    }

    public InitFaceplusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitFaceplusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitFaceplusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitFaceplusResponse setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

    public InitFaceplusResponse setResultCodeSub(String resultCodeSub) {
        this.resultCodeSub = resultCodeSub;
        return this;
    }
    public String getResultCodeSub() {
        return this.resultCodeSub;
    }

    public InitFaceplusResponse setResultMsgSub(String resultMsgSub) {
        this.resultMsgSub = resultMsgSub;
        return this;
    }
    public String getResultMsgSub() {
        return this.resultMsgSub;
    }

    public InitFaceplusResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
