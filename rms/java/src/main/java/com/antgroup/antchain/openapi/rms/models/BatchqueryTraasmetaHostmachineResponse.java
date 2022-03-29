// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchqueryTraasmetaHostmachineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // hosts
    @NameInMap("hosts")
    public java.util.List<TraasHostMachineDto> hosts;

    public static BatchqueryTraasmetaHostmachineResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTraasmetaHostmachineResponse self = new BatchqueryTraasmetaHostmachineResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryTraasmetaHostmachineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryTraasmetaHostmachineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryTraasmetaHostmachineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryTraasmetaHostmachineResponse setHosts(java.util.List<TraasHostMachineDto> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<TraasHostMachineDto> getHosts() {
        return this.hosts;
    }

}
