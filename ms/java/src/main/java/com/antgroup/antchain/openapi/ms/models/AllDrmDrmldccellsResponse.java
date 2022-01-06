// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AllDrmDrmldccellsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否是LDC
    @NameInMap("is_ldc")
    public Boolean isLdc;

    // 如果不是LDC返回cells名称列表
    @NameInMap("old_cells")
    public java.util.List<String> oldCells;

    // 如果是LDC单元反回name和type信息
    @NameInMap("new_cells")
    public java.util.List<CellLdcInfo> newCells;

    public static AllDrmDrmldccellsResponse build(java.util.Map<String, ?> map) throws Exception {
        AllDrmDrmldccellsResponse self = new AllDrmDrmldccellsResponse();
        return TeaModel.build(map, self);
    }

    public AllDrmDrmldccellsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllDrmDrmldccellsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllDrmDrmldccellsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllDrmDrmldccellsResponse setIsLdc(Boolean isLdc) {
        this.isLdc = isLdc;
        return this;
    }
    public Boolean getIsLdc() {
        return this.isLdc;
    }

    public AllDrmDrmldccellsResponse setOldCells(java.util.List<String> oldCells) {
        this.oldCells = oldCells;
        return this;
    }
    public java.util.List<String> getOldCells() {
        return this.oldCells;
    }

    public AllDrmDrmldccellsResponse setNewCells(java.util.List<CellLdcInfo> newCells) {
        this.newCells = newCells;
        return this;
    }
    public java.util.List<CellLdcInfo> getNewCells() {
        return this.newCells;
    }

}
