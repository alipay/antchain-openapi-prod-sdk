// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetCellgroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 逻辑单元信息。
    @NameInMap("cell_group")
    public CellGroup cellGroup;

    public static GetCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCellgroupResponse self = new GetCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public GetCellgroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCellgroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCellgroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCellgroupResponse setCellGroup(CellGroup cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public CellGroup getCellGroup() {
        return this.cellGroup;
    }

}
