// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class EnableProdAutotestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否可执行测试用例结果
    @NameInMap("options")
    public java.util.List<AutoTestAvailableProdOption> options;

    public static EnableProdAutotestResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableProdAutotestResponse self = new EnableProdAutotestResponse();
        return TeaModel.build(map, self);
    }

    public EnableProdAutotestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public EnableProdAutotestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public EnableProdAutotestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EnableProdAutotestResponse setOptions(java.util.List<AutoTestAvailableProdOption> options) {
        this.options = options;
        return this;
    }
    public java.util.List<AutoTestAvailableProdOption> getOptions() {
        return this.options;
    }

}
