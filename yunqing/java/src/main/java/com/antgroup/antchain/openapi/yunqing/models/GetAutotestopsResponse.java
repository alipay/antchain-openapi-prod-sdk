// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetAutotestopsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 所属环境id
    @NameInMap("env_id")
    public String envId;

    // 测试单名字
    @NameInMap("name")
    public String name;

    // 测试单的id
    @NameInMap("ops_plan_id")
    public String opsPlanId;

    // 产品测试结果
    @NameInMap("prod_test_result")
    public java.util.List<AutoTestProdResult> prodTestResult;

    // 当前状态
    @NameInMap("status")
    public String status;

    // 测试单创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // 测试单结束时间
    @NameInMap("utc_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcEnd;

    // 测试单修改时间
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // 测试单开始时间
    @NameInMap("utc_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcStart;

    public static GetAutotestopsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutotestopsResponse self = new GetAutotestopsResponse();
        return TeaModel.build(map, self);
    }

    public GetAutotestopsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAutotestopsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAutotestopsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAutotestopsResponse setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GetAutotestopsResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAutotestopsResponse setOpsPlanId(String opsPlanId) {
        this.opsPlanId = opsPlanId;
        return this;
    }
    public String getOpsPlanId() {
        return this.opsPlanId;
    }

    public GetAutotestopsResponse setProdTestResult(java.util.List<AutoTestProdResult> prodTestResult) {
        this.prodTestResult = prodTestResult;
        return this;
    }
    public java.util.List<AutoTestProdResult> getProdTestResult() {
        return this.prodTestResult;
    }

    public GetAutotestopsResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAutotestopsResponse setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public GetAutotestopsResponse setUtcEnd(String utcEnd) {
        this.utcEnd = utcEnd;
        return this;
    }
    public String getUtcEnd() {
        return this.utcEnd;
    }

    public GetAutotestopsResponse setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public GetAutotestopsResponse setUtcStart(String utcStart) {
        this.utcStart = utcStart;
        return this;
    }
    public String getUtcStart() {
        return this.utcStart;
    }

}
