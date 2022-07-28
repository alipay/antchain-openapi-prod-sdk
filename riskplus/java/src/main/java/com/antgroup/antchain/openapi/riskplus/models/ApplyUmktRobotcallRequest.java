// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyUmktRobotcallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外呼主叫号码
    @NameInMap("called_show_number")
    @Validation(required = true)
    public String calledShowNumber;

    // 被叫号码
    @NameInMap("called_number")
    @Validation(required = true)
    public String calledNumber;

    // 机器人id
    @NameInMap("robot_id")
    @Validation(required = true)
    public Long robotId;

    // 是否开启录音
    @NameInMap("record_flag")
    public Boolean recordFlag;

    // 是否开启早媒体
    @NameInMap("early_media_asr")
    public Boolean earlyMediaAsr;

    // 机器人参数
    @NameInMap("params")
    public String params;

    public static ApplyUmktRobotcallRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyUmktRobotcallRequest self = new ApplyUmktRobotcallRequest();
        return TeaModel.build(map, self);
    }

    public ApplyUmktRobotcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyUmktRobotcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyUmktRobotcallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public ApplyUmktRobotcallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public ApplyUmktRobotcallRequest setRobotId(Long robotId) {
        this.robotId = robotId;
        return this;
    }
    public Long getRobotId() {
        return this.robotId;
    }

    public ApplyUmktRobotcallRequest setRecordFlag(Boolean recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }
    public Boolean getRecordFlag() {
        return this.recordFlag;
    }

    public ApplyUmktRobotcallRequest setEarlyMediaAsr(Boolean earlyMediaAsr) {
        this.earlyMediaAsr = earlyMediaAsr;
        return this;
    }
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
    }

    public ApplyUmktRobotcallRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
