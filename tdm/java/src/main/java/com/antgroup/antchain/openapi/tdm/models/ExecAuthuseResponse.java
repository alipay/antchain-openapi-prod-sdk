// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ExecAuthuseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 缴存证明数据
    // 
    // 
    @NameInMap("trust_data")
    public String trustData;

    public static ExecAuthuseResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAuthuseResponse self = new ExecAuthuseResponse();
        return TeaModel.build(map, self);
    }

    public ExecAuthuseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAuthuseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAuthuseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAuthuseResponse setTrustData(String trustData) {
        this.trustData = trustData;
        return this;
    }
    public String getTrustData() {
        return this.trustData;
    }

}
