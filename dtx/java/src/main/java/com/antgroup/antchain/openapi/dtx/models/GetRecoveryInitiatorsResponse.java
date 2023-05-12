// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetRecoveryInitiatorsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // biz_type
    @NameInMap("biz_type")
    public String bizType;

    // 关联关系表的id，用于更新
    @NameInMap("biz_type_id")
    public Long bizTypeId;

    // client_version
    @NameInMap("client_version")
    public String clientVersion;

    // id
    @NameInMap("id")
    public Long id;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // is_asyn
    @NameInMap("is_asyn")
    public Boolean isAsyn;

    // is_load_test
    @NameInMap("is_load_test")
    public Boolean isLoadTest;

    // is_mix
    @NameInMap("is_mix")
    public Boolean isMix;

    // recovery_datasources
    @NameInMap("recovery_datasources")
    public java.util.List<InitiatorDatasource> recoveryDatasources;

    // recovery_limit
    @NameInMap("recovery_limit")
    public Long recoveryLimit;

    // thread_num
    @NameInMap("thread_num")
    public Long threadNum;

    public static GetRecoveryInitiatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecoveryInitiatorsResponse self = new GetRecoveryInitiatorsResponse();
        return TeaModel.build(map, self);
    }

    public GetRecoveryInitiatorsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRecoveryInitiatorsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRecoveryInitiatorsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRecoveryInitiatorsResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetRecoveryInitiatorsResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetRecoveryInitiatorsResponse setBizTypeId(Long bizTypeId) {
        this.bizTypeId = bizTypeId;
        return this;
    }
    public Long getBizTypeId() {
        return this.bizTypeId;
    }

    public GetRecoveryInitiatorsResponse setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetRecoveryInitiatorsResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetRecoveryInitiatorsResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRecoveryInitiatorsResponse setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }
    public Boolean getIsAsyn() {
        return this.isAsyn;
    }

    public GetRecoveryInitiatorsResponse setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public GetRecoveryInitiatorsResponse setIsMix(Boolean isMix) {
        this.isMix = isMix;
        return this;
    }
    public Boolean getIsMix() {
        return this.isMix;
    }

    public GetRecoveryInitiatorsResponse setRecoveryDatasources(java.util.List<InitiatorDatasource> recoveryDatasources) {
        this.recoveryDatasources = recoveryDatasources;
        return this;
    }
    public java.util.List<InitiatorDatasource> getRecoveryDatasources() {
        return this.recoveryDatasources;
    }

    public GetRecoveryInitiatorsResponse setRecoveryLimit(Long recoveryLimit) {
        this.recoveryLimit = recoveryLimit;
        return this;
    }
    public Long getRecoveryLimit() {
        return this.recoveryLimit;
    }

    public GetRecoveryInitiatorsResponse setThreadNum(Long threadNum) {
        this.threadNum = threadNum;
        return this;
    }
    public Long getThreadNum() {
        return this.threadNum;
    }

}
