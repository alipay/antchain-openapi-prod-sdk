// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateXdatasourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  
    @NameInMap("data")
    public XDatasourceCRULResponseCURequest data;

    public static CreateXdatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateXdatasourceResponse self = new CreateXdatasourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateXdatasourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateXdatasourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateXdatasourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateXdatasourceResponse setData(XDatasourceCRULResponseCURequest data) {
        this.data = data;
        return this;
    }
    public XDatasourceCRULResponseCURequest getData() {
        return this.data;
    }

}
