// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListPodContainersResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Pod容器列表
    @NameInMap("containers")
    public java.util.List<ContainerInfo> containers;

    public static ListPodContainersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPodContainersResponse self = new ListPodContainersResponse();
        return TeaModel.build(map, self);
    }

    public ListPodContainersResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListPodContainersResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListPodContainersResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListPodContainersResponse setContainers(java.util.List<ContainerInfo> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<ContainerInfo> getContainers() {
        return this.containers;
    }

}
