// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class ImportItemResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // succeed_count
    @NameInMap("succeed_count")
    public Long succeedCount;

    // failed_count
    @NameInMap("failed_count")
    public Long failedCount;

    // failed_reasons
    @NameInMap("failed_reasons")
    public java.util.List<String> failedReasons;

    public static ImportItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportItemResponse self = new ImportItemResponse();
        return TeaModel.build(map, self);
    }

    public ImportItemResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportItemResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportItemResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportItemResponse setSucceedCount(Long succeedCount) {
        this.succeedCount = succeedCount;
        return this;
    }
    public Long getSucceedCount() {
        return this.succeedCount;
    }

    public ImportItemResponse setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public ImportItemResponse setFailedReasons(java.util.List<String> failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }
    public java.util.List<String> getFailedReasons() {
        return this.failedReasons;
    }

}
