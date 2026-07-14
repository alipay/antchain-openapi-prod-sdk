// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushElectrocarOtajobbymoduleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否请求成功
    @NameInMap("success")
    public Boolean success;

    // 响应编码
    @NameInMap("code")
    public Boolean code;

    // 响应消息
    @NameInMap("message")
    public String message;

    // 去重后的目标设备总数
    @NameInMap("total_device_count")
    public Long totalDeviceCount;

    // 实际创建的OTA批次数量
    @NameInMap("batch_count")
    public Long batchCount;

    // 创建成功的OTA任务ID列表
    @NameInMap("job_ids")
    public java.util.List<String> jobIds;

    public static PushElectrocarOtajobbymoduleResponse build(java.util.Map<String, ?> map) throws Exception {
        PushElectrocarOtajobbymoduleResponse self = new PushElectrocarOtajobbymoduleResponse();
        return TeaModel.build(map, self);
    }

    public PushElectrocarOtajobbymoduleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushElectrocarOtajobbymoduleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushElectrocarOtajobbymoduleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushElectrocarOtajobbymoduleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PushElectrocarOtajobbymoduleResponse setCode(Boolean code) {
        this.code = code;
        return this;
    }
    public Boolean getCode() {
        return this.code;
    }

    public PushElectrocarOtajobbymoduleResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushElectrocarOtajobbymoduleResponse setTotalDeviceCount(Long totalDeviceCount) {
        this.totalDeviceCount = totalDeviceCount;
        return this;
    }
    public Long getTotalDeviceCount() {
        return this.totalDeviceCount;
    }

    public PushElectrocarOtajobbymoduleResponse setBatchCount(Long batchCount) {
        this.batchCount = batchCount;
        return this;
    }
    public Long getBatchCount() {
        return this.batchCount;
    }

    public PushElectrocarOtajobbymoduleResponse setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

}
