// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ExecTradeCoverResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 调用方唯一业务标识	
    @NameInMap("out_biz_no")
    public Long outBizNo;

    // 扩展信息	
    @NameInMap("ext_info")
    public String extInfo;

    public static ExecTradeCoverResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecTradeCoverResponse self = new ExecTradeCoverResponse();
        return TeaModel.build(map, self);
    }

    public ExecTradeCoverResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecTradeCoverResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecTradeCoverResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecTradeCoverResponse setOutBizNo(Long outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public Long getOutBizNo() {
        return this.outBizNo;
    }

    public ExecTradeCoverResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
