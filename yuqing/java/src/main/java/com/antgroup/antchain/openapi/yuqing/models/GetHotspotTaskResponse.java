// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class GetHotspotTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务的结果
    @NameInMap("hotspot_tasks")
    public java.util.List<HotspotTask> hotspotTasks;

    public static GetHotspotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTaskResponse self = new GetHotspotTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetHotspotTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHotspotTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetHotspotTaskResponse setHotspotTasks(java.util.List<HotspotTask> hotspotTasks) {
        this.hotspotTasks = hotspotTasks;
        return this;
    }
    public java.util.List<HotspotTask> getHotspotTasks() {
        return this.hotspotTasks;
    }

}
