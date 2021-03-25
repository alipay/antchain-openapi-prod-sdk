// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListRegionResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // region list
    @NameInMap("data")
    public java.util.List<RegionMeta> data;

    public static ListRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegionResponse self = new ListRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListRegionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListRegionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRegionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListRegionResponse setData(java.util.List<RegionMeta> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RegionMeta> getData() {
        return this.data;
    }

}
