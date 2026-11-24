// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotsuccessProductCategoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("categories")
    @Validation(required = true)
    public java.util.List<OpenApiCategoryInfo> categories;

    public static ListBlockchainBotIotsuccessProductCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotsuccessProductCategoryResponse self = new ListBlockchainBotIotsuccessProductCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotsuccessProductCategoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListBlockchainBotIotsuccessProductCategoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListBlockchainBotIotsuccessProductCategoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListBlockchainBotIotsuccessProductCategoryResponse setCategories(java.util.List<OpenApiCategoryInfo> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<OpenApiCategoryInfo> getCategories() {
        return this.categories;
    }

}
