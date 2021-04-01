// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ReleaseBlockchainOrderLogicalResponse extends TeaModel {
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

    // data
    @NameInMap("data")
    public Boolean data;

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

    // reques_id
    @NameInMap("reques_id")
    public String requesId;

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

    public static ReleaseBlockchainOrderLogicalResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBlockchainOrderLogicalResponse self = new ReleaseBlockchainOrderLogicalResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseBlockchainOrderLogicalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ReleaseBlockchainOrderLogicalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReleaseBlockchainOrderLogicalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ReleaseBlockchainOrderLogicalResponse setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ReleaseBlockchainOrderLogicalResponse setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ReleaseBlockchainOrderLogicalResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ReleaseBlockchainOrderLogicalResponse setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public ReleaseBlockchainOrderLogicalResponse setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public ReleaseBlockchainOrderLogicalResponse setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public ReleaseBlockchainOrderLogicalResponse setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public ReleaseBlockchainOrderLogicalResponse setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public ReleaseBlockchainOrderLogicalResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseBlockchainOrderLogicalResponse setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public ReleaseBlockchainOrderLogicalResponse setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ReleaseBlockchainOrderLogicalResponse setRequesId(String requesId) {
        this.requesId = requesId;
        return this;
    }
    public String getRequesId() {
        return this.requesId;
    }

    public ReleaseBlockchainOrderLogicalResponse setResult(ALiYunDeleteResource result) {
        this.result = result;
        return this;
    }
    public ALiYunDeleteResource getResult() {
        return this.result;
    }

    public ReleaseBlockchainOrderLogicalResponse setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public ReleaseBlockchainOrderLogicalResponse setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public ReleaseBlockchainOrderLogicalResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
