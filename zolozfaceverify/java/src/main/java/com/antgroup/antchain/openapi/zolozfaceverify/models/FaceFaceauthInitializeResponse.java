// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class FaceFaceauthInitializeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 预留扩展结果
    @NameInMap("extern_info")
    @Validation(required = true)
    public String externInfo;

    // 产品结果明细，不影响决策
    @NameInMap("result_code_sub")
    @Validation(required = true)
    public String resultCodeSub;

    // result_code_sub对应的文案
    @NameInMap("result_msg_sub")
    @Validation(required = true)
    public String resultMsgSub;

    // 实人认证id
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    public static FaceFaceauthInitializeResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceFaceauthInitializeResponse self = new FaceFaceauthInitializeResponse();
        return TeaModel.build(map, self);
    }

    public FaceFaceauthInitializeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FaceFaceauthInitializeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FaceFaceauthInitializeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FaceFaceauthInitializeResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

    public FaceFaceauthInitializeResponse setResultCodeSub(String resultCodeSub) {
        this.resultCodeSub = resultCodeSub;
        return this;
    }
    public String getResultCodeSub() {
        return this.resultCodeSub;
    }

    public FaceFaceauthInitializeResponse setResultMsgSub(String resultMsgSub) {
        this.resultMsgSub = resultMsgSub;
        return this;
    }
    public String getResultMsgSub() {
        return this.resultMsgSub;
    }

    public FaceFaceauthInitializeResponse setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

}
