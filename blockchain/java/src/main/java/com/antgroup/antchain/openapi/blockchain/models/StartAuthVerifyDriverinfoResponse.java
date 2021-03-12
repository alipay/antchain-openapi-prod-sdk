// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVerifyDriverinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 业务流水号，输入参数的bizId返回。
    @NameInMap("biz_id")
    public String bizId;

    // 来自入参，具体看业务场景。
    @NameInMap("biz_type")
    public String bizType;

    // 目标用户创建的did结果，如果为空则表明未创建。
    @NameInMap("did")
    public String did;

    // 查询结果：
    // 1 一致(收费) 
    // 2 姓名不一致(收费) 
    // 3 身份证未命中(收费) 
    // 4 车牌号不一致(收费) 
    // 0 无意义
    @NameInMap("result_status")
    public Long resultStatus;

    // 查询结果数据，result_status 不等于 1 时为null，结果是一个JSON字符串，具体结果内容解释，需要参考文档说明。
    @NameInMap("result_data")
    public String resultData;

    public static StartAuthVerifyDriverinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVerifyDriverinfoResponse self = new StartAuthVerifyDriverinfoResponse();
        return TeaModel.build(map, self);
    }

    public StartAuthVerifyDriverinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAuthVerifyDriverinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAuthVerifyDriverinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAuthVerifyDriverinfoResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartAuthVerifyDriverinfoResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartAuthVerifyDriverinfoResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartAuthVerifyDriverinfoResponse setResultStatus(Long resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }
    public Long getResultStatus() {
        return this.resultStatus;
    }

    public StartAuthVerifyDriverinfoResponse setResultData(String resultData) {
        this.resultData = resultData;
        return this;
    }
    public String getResultData() {
        return this.resultData;
    }

}
