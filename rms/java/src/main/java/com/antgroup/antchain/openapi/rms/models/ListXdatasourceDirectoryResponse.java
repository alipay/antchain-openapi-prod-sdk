// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListXdatasourceDirectoryResponse extends TeaModel {
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
    public java.util.List<XDatasourceCRULResponseCURequest> data;

    public static ListXdatasourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListXdatasourceDirectoryResponse self = new ListXdatasourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public ListXdatasourceDirectoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListXdatasourceDirectoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListXdatasourceDirectoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListXdatasourceDirectoryResponse setData(java.util.List<XDatasourceCRULResponseCURequest> data) {
        this.data = data;
        return this;
    }
    public java.util.List<XDatasourceCRULResponseCURequest> getData() {
        return this.data;
    }

}
