// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraasmetaCellResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // cells
    @NameInMap("cells")
    public java.util.List<TraasCellDto> cells;

    public static QueryTraasmetaCellResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraasmetaCellResponse self = new QueryTraasmetaCellResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraasmetaCellResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraasmetaCellResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraasmetaCellResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraasmetaCellResponse setCells(java.util.List<TraasCellDto> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<TraasCellDto> getCells() {
        return this.cells;
    }

}
