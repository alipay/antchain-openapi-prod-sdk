// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BatchqueryServiceSlbmountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // slb_info_list
    @NameInMap("mount_info_list")
    public java.util.List<String> mountInfoList;

    public static BatchqueryServiceSlbmountResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryServiceSlbmountResponse self = new BatchqueryServiceSlbmountResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryServiceSlbmountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryServiceSlbmountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryServiceSlbmountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryServiceSlbmountResponse setMountInfoList(java.util.List<String> mountInfoList) {
        this.mountInfoList = mountInfoList;
        return this;
    }
    public java.util.List<String> getMountInfoList() {
        return this.mountInfoList;
    }

}
