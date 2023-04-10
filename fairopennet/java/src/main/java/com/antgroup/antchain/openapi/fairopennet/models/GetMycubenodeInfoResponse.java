// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class GetMycubenodeInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  
    @NameInMap("cube_node")
    public CubeNode cubeNode;

    public static GetMycubenodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMycubenodeInfoResponse self = new GetMycubenodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMycubenodeInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMycubenodeInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMycubenodeInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMycubenodeInfoResponse setCubeNode(CubeNode cubeNode) {
        this.cubeNode = cubeNode;
        return this;
    }
    public CubeNode getCubeNode() {
        return this.cubeNode;
    }

}
