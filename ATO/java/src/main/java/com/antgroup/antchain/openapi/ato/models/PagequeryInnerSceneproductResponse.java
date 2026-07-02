// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerSceneproductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总条数
    @NameInMap("total_count")
    public Long totalCount;

    // 场景添加商品数
    @NameInMap("added_scene_product_count")
    public Long addedSceneProductCount;

    // 场景产品列表
    @NameInMap("scene_product_info_list")
    public java.util.List<SceneProductInfoResp> sceneProductInfoList;

    public static PagequeryInnerSceneproductResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerSceneproductResponse self = new PagequeryInnerSceneproductResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerSceneproductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerSceneproductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerSceneproductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerSceneproductResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryInnerSceneproductResponse setAddedSceneProductCount(Long addedSceneProductCount) {
        this.addedSceneProductCount = addedSceneProductCount;
        return this;
    }
    public Long getAddedSceneProductCount() {
        return this.addedSceneProductCount;
    }

    public PagequeryInnerSceneproductResponse setSceneProductInfoList(java.util.List<SceneProductInfoResp> sceneProductInfoList) {
        this.sceneProductInfoList = sceneProductInfoList;
        return this;
    }
    public java.util.List<SceneProductInfoResp> getSceneProductInfoList() {
        return this.sceneProductInfoList;
    }

}
