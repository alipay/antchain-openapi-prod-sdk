// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListResourceComputertypefamilyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // computer 规格族
    @NameInMap("data")
    public java.util.List<ComputerTypeFamily> data;

    public static ListResourceComputertypefamilyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceComputertypefamilyResponse self = new ListResourceComputertypefamilyResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceComputertypefamilyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListResourceComputertypefamilyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListResourceComputertypefamilyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListResourceComputertypefamilyResponse setData(java.util.List<ComputerTypeFamily> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ComputerTypeFamily> getData() {
        return this.data;
    }

}
