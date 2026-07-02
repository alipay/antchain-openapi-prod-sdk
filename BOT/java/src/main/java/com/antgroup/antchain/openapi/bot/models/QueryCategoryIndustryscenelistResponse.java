// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryCategoryIndustryscenelistResponse extends TeaModel {
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

    // 行业场景列表
    @NameInMap("data")
    public java.util.List<IotbasicCategoryIndustrySceneInfo> data;

    public static QueryCategoryIndustryscenelistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCategoryIndustryscenelistResponse self = new QueryCategoryIndustryscenelistResponse();
        return TeaModel.build(map, self);
    }

    public QueryCategoryIndustryscenelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCategoryIndustryscenelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCategoryIndustryscenelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCategoryIndustryscenelistResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCategoryIndustryscenelistResponse setData(java.util.List<IotbasicCategoryIndustrySceneInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<IotbasicCategoryIndustrySceneInfo> getData() {
        return this.data;
    }

}
