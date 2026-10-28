// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecDatalinkSourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回字段列表
    @NameInMap("columns")
    public java.util.List<String> columns;

    // 返回数据列表
    @NameInMap("rows")
    public String rows;

    public static ExecDatalinkSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDatalinkSourceResponse self = new ExecDatalinkSourceResponse();
        return TeaModel.build(map, self);
    }

    public ExecDatalinkSourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecDatalinkSourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecDatalinkSourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecDatalinkSourceResponse setColumns(java.util.List<String> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<String> getColumns() {
        return this.columns;
    }

    public ExecDatalinkSourceResponse setRows(String rows) {
        this.rows = rows;
        return this;
    }
    public String getRows() {
        return this.rows;
    }

}
