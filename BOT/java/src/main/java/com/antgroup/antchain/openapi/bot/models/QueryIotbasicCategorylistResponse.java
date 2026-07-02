// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotbasicCategorylistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口调用结果
    @NameInMap("success")
    public Boolean success;

    // 品类信息列表
    @NameInMap("data")
    public java.util.List<CategoryInfo> data;

    public static QueryIotbasicCategorylistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotbasicCategorylistResponse self = new QueryIotbasicCategorylistResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotbasicCategorylistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIotbasicCategorylistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIotbasicCategorylistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIotbasicCategorylistResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIotbasicCategorylistResponse setData(java.util.List<CategoryInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CategoryInfo> getData() {
        return this.data;
    }

}
