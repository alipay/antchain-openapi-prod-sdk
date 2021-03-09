// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetRegionTenantResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // regionDto
    @NameInMap("data")
    public RegionDto data;

    public static GetRegionTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegionTenantResponse self = new GetRegionTenantResponse();
        return TeaModel.build(map, self);
    }

    public GetRegionTenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRegionTenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRegionTenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRegionTenantResponse setData(RegionDto data) {
        this.data = data;
        return this;
    }
    public RegionDto getData() {
        return this.data;
    }

}
