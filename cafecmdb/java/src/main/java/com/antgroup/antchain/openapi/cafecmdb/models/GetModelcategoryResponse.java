// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class GetModelcategoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 获取到的模型分组
    @NameInMap("data")
    public ModelCategory data;

    public static GetModelcategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelcategoryResponse self = new GetModelcategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetModelcategoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetModelcategoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetModelcategoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetModelcategoryResponse setData(ModelCategory data) {
        this.data = data;
        return this;
    }
    public ModelCategory getData() {
        return this.data;
    }

}
