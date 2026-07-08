// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryEducationInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 学历信息
    @NameInMap("education_info")
    public String educationInfo;

    // 扩展信息，预留字段
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryEducationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEducationInfoResponse self = new QueryEducationInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryEducationInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEducationInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEducationInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEducationInfoResponse setEducationInfo(String educationInfo) {
        this.educationInfo = educationInfo;
        return this;
    }
    public String getEducationInfo() {
        return this.educationInfo;
    }

    public QueryEducationInfoResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
