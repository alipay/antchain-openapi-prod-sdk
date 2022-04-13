// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListWorkspacegroupRegionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // region列表
    @NameInMap("regions")
    public java.util.List<Region> regions;

    public static ListWorkspacegroupRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacegroupRegionsResponse self = new ListWorkspacegroupRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspacegroupRegionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListWorkspacegroupRegionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListWorkspacegroupRegionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListWorkspacegroupRegionsResponse setRegions(java.util.List<Region> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<Region> getRegions() {
        return this.regions;
    }

}
