// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class DetailFacevrfServerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // PASS：认证通过
    // FAIL：认证不通过
    // NO_RECODE：无认证记录
    // PROCESSING：认证中
    @NameInMap("state")
    public String state;

    // 认证人信息，包括姓名和身份证号，不加密
    // state为PASS/FAIL/PROCESSING时为JSON字符串，为NO_RECORD时为空
    @NameInMap("identity_info")
    public String identityInfo;

    // 预留扩展结果
    @NameInMap("extern_info")
    public String externInfo;

    public static DetailFacevrfServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailFacevrfServerResponse self = new DetailFacevrfServerResponse();
        return TeaModel.build(map, self);
    }

    public DetailFacevrfServerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailFacevrfServerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailFacevrfServerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailFacevrfServerResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DetailFacevrfServerResponse setIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }
    public String getIdentityInfo() {
        return this.identityInfo;
    }

    public DetailFacevrfServerResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
