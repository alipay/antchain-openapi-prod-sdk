// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.micservice.models;

import com.aliyun.tea.*;

public class FeaturesearchFaceverifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否处理成功
    @NameInMap("success")
    public Boolean success;

    // 是否有风险，默认false
    @NameInMap("has_risk")
    public Boolean hasRisk;

    // 搜索结果明细，即搜索到的最相似的N个样本信息
    @NameInMap("search_detail")
    public java.util.List<SearchedItem> searchDetail;

    public static FeaturesearchFaceverifyResponse build(java.util.Map<String, ?> map) throws Exception {
        FeaturesearchFaceverifyResponse self = new FeaturesearchFaceverifyResponse();
        return TeaModel.build(map, self);
    }

    public FeaturesearchFaceverifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FeaturesearchFaceverifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FeaturesearchFaceverifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FeaturesearchFaceverifyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FeaturesearchFaceverifyResponse setHasRisk(Boolean hasRisk) {
        this.hasRisk = hasRisk;
        return this;
    }
    public Boolean getHasRisk() {
        return this.hasRisk;
    }

    public FeaturesearchFaceverifyResponse setSearchDetail(java.util.List<SearchedItem> searchDetail) {
        this.searchDetail = searchDetail;
        return this;
    }
    public java.util.List<SearchedItem> getSearchDetail() {
        return this.searchDetail;
    }

}
