// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class BatchqueryCarloanTestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务id
    @NameInMap("business_ids")
    public java.util.List<String> businessIds;

    public static BatchqueryCarloanTestResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryCarloanTestResponse self = new BatchqueryCarloanTestResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryCarloanTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryCarloanTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryCarloanTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryCarloanTestResponse setBusinessIds(java.util.List<String> businessIds) {
        this.businessIds = businessIds;
        return this;
    }
    public java.util.List<String> getBusinessIds() {
        return this.businessIds;
    }

}
