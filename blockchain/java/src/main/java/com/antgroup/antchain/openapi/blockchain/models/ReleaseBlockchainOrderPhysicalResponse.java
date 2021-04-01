// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ReleaseBlockchainOrderPhysicalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // bid
    @NameInMap("bid")
    public String bid;

    // country
    @NameInMap("country")
    public String country;

    // gmt_wakeup
    @NameInMap("gmt_wakeup")
    public String gmtWakeup;

    // hid
    @NameInMap("hid")
    public Long hid;

    // interrupt
    @NameInMap("interrupt")
    public Boolean interrupt;

    // invoker
    @NameInMap("invoker")
    public String invoker;

    // level
    @NameInMap("level")
    public Long level;

    // message
    @NameInMap("message")
    public String message;

    // pk
    @NameInMap("pk")
    public String pk;

    // prompt
    @NameInMap("prompt")
    public String prompt;

    // request_id
    @NameInMap("request_id")
    public String requestId;

    // 阿里云请求返回结果
    @NameInMap("result")
    public ALiYunDeleteResource result;

    // task_extra_data
    @NameInMap("task_extra_data")
    public String taskExtraData;

    // task_identifier
    @NameInMap("task_identifier")
    public String taskIdentifier;

    // url
    @NameInMap("url")
    public String url;

    public static ReleaseBlockchainOrderPhysicalResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBlockchainOrderPhysicalResponse self = new ReleaseBlockchainOrderPhysicalResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseBlockchainOrderPhysicalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ReleaseBlockchainOrderPhysicalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReleaseBlockchainOrderPhysicalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ReleaseBlockchainOrderPhysicalResponse setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ReleaseBlockchainOrderPhysicalResponse setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ReleaseBlockchainOrderPhysicalResponse setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public ReleaseBlockchainOrderPhysicalResponse setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public ReleaseBlockchainOrderPhysicalResponse setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public ReleaseBlockchainOrderPhysicalResponse setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public ReleaseBlockchainOrderPhysicalResponse setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public ReleaseBlockchainOrderPhysicalResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseBlockchainOrderPhysicalResponse setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public ReleaseBlockchainOrderPhysicalResponse setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ReleaseBlockchainOrderPhysicalResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseBlockchainOrderPhysicalResponse setResult(ALiYunDeleteResource result) {
        this.result = result;
        return this;
    }
    public ALiYunDeleteResource getResult() {
        return this.result;
    }

    public ReleaseBlockchainOrderPhysicalResponse setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public ReleaseBlockchainOrderPhysicalResponse setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public ReleaseBlockchainOrderPhysicalResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
