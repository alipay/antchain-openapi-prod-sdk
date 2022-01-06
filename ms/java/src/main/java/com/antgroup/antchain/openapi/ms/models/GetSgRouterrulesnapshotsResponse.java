// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetSgRouterrulesnapshotsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // ConfigSnapshotModel
    @NameInMap("config_snapshot_model")
    public ConfigSnapshotModel configSnapshotModel;

    public static GetSgRouterrulesnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSgRouterrulesnapshotsResponse self = new GetSgRouterrulesnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public GetSgRouterrulesnapshotsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSgRouterrulesnapshotsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSgRouterrulesnapshotsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSgRouterrulesnapshotsResponse setConfigSnapshotModel(ConfigSnapshotModel configSnapshotModel) {
        this.configSnapshotModel = configSnapshotModel;
        return this;
    }
    public ConfigSnapshotModel getConfigSnapshotModel() {
        return this.configSnapshotModel;
    }

}
