// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqClusterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // list cell
    @NameInMap("data")
    public java.util.List<ClusterDO> data;

    public static ListSofamqClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqClusterResponse self = new ListSofamqClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqClusterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqClusterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqClusterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqClusterResponse setData(java.util.List<ClusterDO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ClusterDO> getData() {
        return this.data;
    }

}
