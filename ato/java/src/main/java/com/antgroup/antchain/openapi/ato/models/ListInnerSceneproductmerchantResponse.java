// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ListInnerSceneproductmerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 场景商品适用商家列表
    @NameInMap("apply_scene_product_merchant_list")
    public java.util.List<ApplySceneProductMerchantInfo> applySceneProductMerchantList;

    public static ListInnerSceneproductmerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInnerSceneproductmerchantResponse self = new ListInnerSceneproductmerchantResponse();
        return TeaModel.build(map, self);
    }

    public ListInnerSceneproductmerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListInnerSceneproductmerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListInnerSceneproductmerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListInnerSceneproductmerchantResponse setApplySceneProductMerchantList(java.util.List<ApplySceneProductMerchantInfo> applySceneProductMerchantList) {
        this.applySceneProductMerchantList = applySceneProductMerchantList;
        return this;
    }
    public java.util.List<ApplySceneProductMerchantInfo> getApplySceneProductMerchantList() {
        return this.applySceneProductMerchantList;
    }

}
