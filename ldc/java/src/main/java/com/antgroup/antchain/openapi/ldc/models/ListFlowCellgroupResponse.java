// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListFlowCellgroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 单元组查询列表
    @NameInMap("cellgroup_list")
    public java.util.List<FlowCellGroup> cellgroupList;

    public static ListFlowCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowCellgroupResponse self = new ListFlowCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowCellgroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListFlowCellgroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListFlowCellgroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListFlowCellgroupResponse setCellgroupList(java.util.List<FlowCellGroup> cellgroupList) {
        this.cellgroupList = cellgroupList;
        return this;
    }
    public java.util.List<FlowCellGroup> getCellgroupList() {
        return this.cellgroupList;
    }

}
