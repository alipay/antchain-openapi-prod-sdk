// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpDtraceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证数据类型名称
    @NameInMap("data_type")
    public String dataType;

    // 存证数据ID
    @NameInMap("data_id")
    public String dataId;

    // 存证数据版本列表
    @NameInMap("versions")
    public java.util.List<DataDepositInfo> versions;

    public static QueryPdcpDtraceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpDtraceResponse self = new QueryPdcpDtraceResponse();
        return TeaModel.build(map, self);
    }

    public QueryPdcpDtraceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPdcpDtraceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPdcpDtraceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPdcpDtraceResponse setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryPdcpDtraceResponse setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryPdcpDtraceResponse setVersions(java.util.List<DataDepositInfo> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<DataDepositInfo> getVersions() {
        return this.versions;
    }

}
