// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class GetAllcubenodeInfoResponse extends TeaModel {
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
    @NameInMap("all_cube_nodes")
    public java.util.List<CubeNode> allCubeNodes;

    public static GetAllcubenodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllcubenodeInfoResponse self = new GetAllcubenodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAllcubenodeInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAllcubenodeInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAllcubenodeInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAllcubenodeInfoResponse setAllCubeNodes(java.util.List<CubeNode> allCubeNodes) {
        this.allCubeNodes = allCubeNodes;
        return this;
    }
    public java.util.List<CubeNode> getAllCubeNodes() {
        return this.allCubeNodes;
    }

}
