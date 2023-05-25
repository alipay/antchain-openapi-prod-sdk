// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class CreateImageReposcanstrategyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 定时任务ID
    @NameInMap("cronjob_id")
    public String cronjobId;

    public static CreateImageReposcanstrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageReposcanstrategyResponse self = new CreateImageReposcanstrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageReposcanstrategyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateImageReposcanstrategyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateImageReposcanstrategyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateImageReposcanstrategyResponse setCronjobId(String cronjobId) {
        this.cronjobId = cronjobId;
        return this;
    }
    public String getCronjobId() {
        return this.cronjobId;
    }

}
