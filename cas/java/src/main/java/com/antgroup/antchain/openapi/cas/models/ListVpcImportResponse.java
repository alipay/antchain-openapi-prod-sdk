// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListVpcImportResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // vpc import infos
    @NameInMap("data")
    public java.util.List<VpcImport> data;

    public static ListVpcImportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcImportResponse self = new ListVpcImportResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcImportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListVpcImportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListVpcImportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListVpcImportResponse setData(java.util.List<VpcImport> data) {
        this.data = data;
        return this;
    }
    public java.util.List<VpcImport> getData() {
        return this.data;
    }

}
