// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ImportDmsBindingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 导入总数
    @NameInMap("total_count")
    public Long totalCount;

    // 导入成功总数
    @NameInMap("success_count")
    public Long successCount;

    // 格式化或者参数错误元素列表
    @NameInMap("format_error_records")
    public java.util.List<BindingDTO> formatErrorRecords;

    // 导入错误元素列表
    @NameInMap("process_error_records")
    public java.util.List<BindingDTO> processErrorRecords;

    // 已存在元素列表
    @NameInMap("exist_records")
    public java.util.List<BindingDTO> existRecords;

    public static ImportDmsBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDmsBindingResponse self = new ImportDmsBindingResponse();
        return TeaModel.build(map, self);
    }

    public ImportDmsBindingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportDmsBindingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportDmsBindingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportDmsBindingResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ImportDmsBindingResponse setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public ImportDmsBindingResponse setFormatErrorRecords(java.util.List<BindingDTO> formatErrorRecords) {
        this.formatErrorRecords = formatErrorRecords;
        return this;
    }
    public java.util.List<BindingDTO> getFormatErrorRecords() {
        return this.formatErrorRecords;
    }

    public ImportDmsBindingResponse setProcessErrorRecords(java.util.List<BindingDTO> processErrorRecords) {
        this.processErrorRecords = processErrorRecords;
        return this;
    }
    public java.util.List<BindingDTO> getProcessErrorRecords() {
        return this.processErrorRecords;
    }

    public ImportDmsBindingResponse setExistRecords(java.util.List<BindingDTO> existRecords) {
        this.existRecords = existRecords;
        return this;
    }
    public java.util.List<BindingDTO> getExistRecords() {
        return this.existRecords;
    }

}
