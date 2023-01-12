// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMachinegroupSlbmountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // SLB 挂载信息
    @NameInMap("slb_mount_info_list")
    public java.util.List<String> slbMountInfoList;

    public static QueryMachinegroupSlbmountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMachinegroupSlbmountResponse self = new QueryMachinegroupSlbmountResponse();
        return TeaModel.build(map, self);
    }

    public QueryMachinegroupSlbmountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMachinegroupSlbmountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMachinegroupSlbmountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMachinegroupSlbmountResponse setSlbMountInfoList(java.util.List<String> slbMountInfoList) {
        this.slbMountInfoList = slbMountInfoList;
        return this;
    }
    public java.util.List<String> getSlbMountInfoList() {
        return this.slbMountInfoList;
    }

}
