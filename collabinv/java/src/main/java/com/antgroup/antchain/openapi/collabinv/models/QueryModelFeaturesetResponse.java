// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryModelFeaturesetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 特征列表
    @NameInMap("featuresets")
    public java.util.List<FeatureSetInfo> featuresets;

    // 分页信息
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static QueryModelFeaturesetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModelFeaturesetResponse self = new QueryModelFeaturesetResponse();
        return TeaModel.build(map, self);
    }

    public QueryModelFeaturesetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryModelFeaturesetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryModelFeaturesetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryModelFeaturesetResponse setFeaturesets(java.util.List<FeatureSetInfo> featuresets) {
        this.featuresets = featuresets;
        return this;
    }
    public java.util.List<FeatureSetInfo> getFeaturesets() {
        return this.featuresets;
    }

    public QueryModelFeaturesetResponse setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
