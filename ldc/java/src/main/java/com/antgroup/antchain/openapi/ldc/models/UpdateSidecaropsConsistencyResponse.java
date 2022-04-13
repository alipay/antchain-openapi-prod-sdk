// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateSidecaropsConsistencyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 已经更新的cell列表
    @NameInMap("updated_cells")
    public java.util.List<String> updatedCells;

    public static UpdateSidecaropsConsistencyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecaropsConsistencyResponse self = new UpdateSidecaropsConsistencyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSidecaropsConsistencyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateSidecaropsConsistencyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateSidecaropsConsistencyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateSidecaropsConsistencyResponse setUpdatedCells(java.util.List<String> updatedCells) {
        this.updatedCells = updatedCells;
        return this;
    }
    public java.util.List<String> getUpdatedCells() {
        return this.updatedCells;
    }

}
