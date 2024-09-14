// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ListDcpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求方租户所关联的所有入驻的车队企业信息列表
    @NameInMap("dcp_info_list")
    public java.util.List<DcpInfo> dcpInfoList;

    // json格式字符串扩展信息，预留字段。
    @NameInMap("extern_info")
    public String externInfo;

    public static ListDcpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDcpResponse self = new ListDcpResponse();
        return TeaModel.build(map, self);
    }

    public ListDcpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDcpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDcpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDcpResponse setDcpInfoList(java.util.List<DcpInfo> dcpInfoList) {
        this.dcpInfoList = dcpInfoList;
        return this;
    }
    public java.util.List<DcpInfo> getDcpInfoList() {
        return this.dcpInfoList;
    }

    public ListDcpResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
