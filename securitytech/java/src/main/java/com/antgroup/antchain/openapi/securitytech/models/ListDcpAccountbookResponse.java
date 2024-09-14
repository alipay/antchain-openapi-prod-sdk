// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ListDcpAccountbookResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求车队企业关联的所有司机签约信息列表
    @NameInMap("sign_info_list")
    public java.util.List<SignInfo> signInfoList;

    // json格式字符串扩展信息，预留字段。
    @NameInMap("extern_info")
    public String externInfo;

    public static ListDcpAccountbookResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDcpAccountbookResponse self = new ListDcpAccountbookResponse();
        return TeaModel.build(map, self);
    }

    public ListDcpAccountbookResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDcpAccountbookResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDcpAccountbookResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDcpAccountbookResponse setSignInfoList(java.util.List<SignInfo> signInfoList) {
        this.signInfoList = signInfoList;
        return this;
    }
    public java.util.List<SignInfo> getSignInfoList() {
        return this.signInfoList;
    }

    public ListDcpAccountbookResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
