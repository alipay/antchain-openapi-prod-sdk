// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AllDrmDrmcellsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // workspace下所有的cell信息
    @NameInMap("cells")
    public java.util.List<String> cells;

    public static AllDrmDrmcellsResponse build(java.util.Map<String, ?> map) throws Exception {
        AllDrmDrmcellsResponse self = new AllDrmDrmcellsResponse();
        return TeaModel.build(map, self);
    }

    public AllDrmDrmcellsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllDrmDrmcellsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllDrmDrmcellsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllDrmDrmcellsResponse setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

}
