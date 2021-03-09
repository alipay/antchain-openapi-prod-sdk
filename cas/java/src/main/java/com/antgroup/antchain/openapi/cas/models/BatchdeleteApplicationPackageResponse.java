// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BatchdeleteApplicationPackageResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // Map<String, Boolean>
    @NameInMap("data")
    public java.util.List<MapStringToBooleanEntity> data;

    public static BatchdeleteApplicationPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteApplicationPackageResponse self = new BatchdeleteApplicationPackageResponse();
        return TeaModel.build(map, self);
    }

    public BatchdeleteApplicationPackageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchdeleteApplicationPackageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchdeleteApplicationPackageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchdeleteApplicationPackageResponse setData(java.util.List<MapStringToBooleanEntity> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MapStringToBooleanEntity> getData() {
        return this.data;
    }

}
