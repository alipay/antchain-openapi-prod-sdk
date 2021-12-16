// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class AllCommercialcoreCatalogResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 全部类目树结构体
    @NameInMap("catalog_trees")
    public java.util.List<CatalogVO> catalogTrees;

    public static AllCommercialcoreCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        AllCommercialcoreCatalogResponse self = new AllCommercialcoreCatalogResponse();
        return TeaModel.build(map, self);
    }

    public AllCommercialcoreCatalogResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllCommercialcoreCatalogResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllCommercialcoreCatalogResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllCommercialcoreCatalogResponse setCatalogTrees(java.util.List<CatalogVO> catalogTrees) {
        this.catalogTrees = catalogTrees;
        return this;
    }
    public java.util.List<CatalogVO> getCatalogTrees() {
        return this.catalogTrees;
    }

}
