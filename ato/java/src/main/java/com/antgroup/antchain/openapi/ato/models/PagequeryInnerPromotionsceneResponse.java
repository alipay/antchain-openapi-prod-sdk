// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerPromotionsceneResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 营销场景列表
    @NameInMap("promotion_scene_list")
    public java.util.List<PromotionScene> promotionSceneList;

    // 记录总数量
    @NameInMap("total_count")
    public Long totalCount;

    public static PagequeryInnerPromotionsceneResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerPromotionsceneResponse self = new PagequeryInnerPromotionsceneResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerPromotionsceneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerPromotionsceneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerPromotionsceneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerPromotionsceneResponse setPromotionSceneList(java.util.List<PromotionScene> promotionSceneList) {
        this.promotionSceneList = promotionSceneList;
        return this;
    }
    public java.util.List<PromotionScene> getPromotionSceneList() {
        return this.promotionSceneList;
    }

    public PagequeryInnerPromotionsceneResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
