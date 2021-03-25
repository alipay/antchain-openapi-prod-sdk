// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMachinegroupSlbmountResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

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
