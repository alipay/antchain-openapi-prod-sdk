// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListRegionGroupbyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // RegionWorkspaceVO
    @NameInMap("data")
    public java.util.List<RegionWorkspaceVO> data;

    public static ListRegionGroupbyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegionGroupbyResponse self = new ListRegionGroupbyResponse();
        return TeaModel.build(map, self);
    }

    public ListRegionGroupbyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListRegionGroupbyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRegionGroupbyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListRegionGroupbyResponse setData(java.util.List<RegionWorkspaceVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RegionWorkspaceVO> getData() {
        return this.data;
    }

}
