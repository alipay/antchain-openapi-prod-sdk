// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVerifyCarinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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

    // 查询结果
    // 1 一致(收费)
    // 2 姓名不一致(收费)
    // 3 身份证未命中(收费)
    // 4 车牌号不一致(收费)
    // 0 无意义(responsecode 不为 100 时 出现)
    @NameInMap("result_status")
    public Long resultStatus;

    // 查询结果数据，result_status 不等于 1 时为null，结果是一个JSON字符串，具体结果内容解释，需要参考文档说明。
    @NameInMap("result_data")
    public String resultData;

    public static StartAuthVerifyCarinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVerifyCarinfoResponse self = new StartAuthVerifyCarinfoResponse();
        return TeaModel.build(map, self);
    }

    public StartAuthVerifyCarinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAuthVerifyCarinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAuthVerifyCarinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAuthVerifyCarinfoResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartAuthVerifyCarinfoResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartAuthVerifyCarinfoResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartAuthVerifyCarinfoResponse setResultStatus(Long resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }
    public Long getResultStatus() {
        return this.resultStatus;
    }

    public StartAuthVerifyCarinfoResponse setResultData(String resultData) {
        this.resultData = resultData;
        return this;
    }
    public String getResultData() {
        return this.resultData;
    }

}
