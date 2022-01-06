// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListDrmDrmdatacellsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Drm数据单元信息
    @NameInMap("drm_data_cell_info")
    public DrmDataCellInfo drmDataCellInfo;

    public static ListDrmDrmdatacellsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDrmDrmdatacellsResponse self = new ListDrmDrmdatacellsResponse();
        return TeaModel.build(map, self);
    }

    public ListDrmDrmdatacellsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDrmDrmdatacellsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDrmDrmdatacellsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDrmDrmdatacellsResponse setDrmDataCellInfo(DrmDataCellInfo drmDataCellInfo) {
        this.drmDataCellInfo = drmDataCellInfo;
        return this;
    }
    public DrmDataCellInfo getDrmDataCellInfo() {
        return this.drmDataCellInfo;
    }

}
