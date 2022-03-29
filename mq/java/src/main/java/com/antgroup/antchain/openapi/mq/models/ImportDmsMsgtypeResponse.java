// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ImportDmsMsgtypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 导入内容总条数
    @NameInMap("total_count")
    public Long totalCount;

    // 导入成功数量
    @NameInMap("success_count")
    public Long successCount;

    // 已经存在的记录总数
    @NameInMap("exist_records")
    public java.util.List<MsgTypeDTO> existRecords;

    // 导入失败的记录详情
    @NameInMap("process_error_records")
    public java.util.List<MsgTypeDTO> processErrorRecords;

    // 格式错误的记录
    @NameInMap("format_error_records")
    public java.util.List<MsgTypeDTO> formatErrorRecords;

    public static ImportDmsMsgtypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDmsMsgtypeResponse self = new ImportDmsMsgtypeResponse();
        return TeaModel.build(map, self);
    }

    public ImportDmsMsgtypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportDmsMsgtypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportDmsMsgtypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportDmsMsgtypeResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ImportDmsMsgtypeResponse setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public ImportDmsMsgtypeResponse setExistRecords(java.util.List<MsgTypeDTO> existRecords) {
        this.existRecords = existRecords;
        return this;
    }
    public java.util.List<MsgTypeDTO> getExistRecords() {
        return this.existRecords;
    }

    public ImportDmsMsgtypeResponse setProcessErrorRecords(java.util.List<MsgTypeDTO> processErrorRecords) {
        this.processErrorRecords = processErrorRecords;
        return this;
    }
    public java.util.List<MsgTypeDTO> getProcessErrorRecords() {
        return this.processErrorRecords;
    }

    public ImportDmsMsgtypeResponse setFormatErrorRecords(java.util.List<MsgTypeDTO> formatErrorRecords) {
        this.formatErrorRecords = formatErrorRecords;
        return this;
    }
    public java.util.List<MsgTypeDTO> getFormatErrorRecords() {
        return this.formatErrorRecords;
    }

}
