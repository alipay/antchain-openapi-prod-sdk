// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class GetNodeListResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // nodeId列表
    @NameInMap("node_list")
    public java.util.List<String> nodeList;

    public static GetNodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeListResponse self = new GetNodeListResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeListResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetNodeListResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetNodeListResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetNodeListResponse setNodeList(java.util.List<String> nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public java.util.List<String> getNodeList() {
        return this.nodeList;
    }

}
