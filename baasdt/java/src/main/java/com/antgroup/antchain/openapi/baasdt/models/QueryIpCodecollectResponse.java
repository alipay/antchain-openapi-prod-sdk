// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpCodecollectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 正版码商品信息配置列表,包含产品名和出品方
    @NameInMap("goods_info_list")
    public java.util.List<IPCodeGoodsInfo> goodsInfoList;

    // 正版码流转信息
    @NameInMap("code_flow_list")
    public java.util.List<IPCodeFlowInfo> codeFlowList;

    // 正版码生命周期
    @NameInMap("code_life_circle")
    public IPCodeConfigTimeInfo codeLifeCircle;

    // 区块链信息
    @NameInMap("chain_info")
    public IPCodeChainInfo chainInfo;

    // 版权信息
    @NameInMap("ipowner_info")
    public IPCodeIpOwnerInfo ipownerInfo;

    public static QueryIpCodecollectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpCodecollectResponse self = new QueryIpCodecollectResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpCodecollectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpCodecollectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpCodecollectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpCodecollectResponse setGoodsInfoList(java.util.List<IPCodeGoodsInfo> goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
        return this;
    }
    public java.util.List<IPCodeGoodsInfo> getGoodsInfoList() {
        return this.goodsInfoList;
    }

    public QueryIpCodecollectResponse setCodeFlowList(java.util.List<IPCodeFlowInfo> codeFlowList) {
        this.codeFlowList = codeFlowList;
        return this;
    }
    public java.util.List<IPCodeFlowInfo> getCodeFlowList() {
        return this.codeFlowList;
    }

    public QueryIpCodecollectResponse setCodeLifeCircle(IPCodeConfigTimeInfo codeLifeCircle) {
        this.codeLifeCircle = codeLifeCircle;
        return this;
    }
    public IPCodeConfigTimeInfo getCodeLifeCircle() {
        return this.codeLifeCircle;
    }

    public QueryIpCodecollectResponse setChainInfo(IPCodeChainInfo chainInfo) {
        this.chainInfo = chainInfo;
        return this;
    }
    public IPCodeChainInfo getChainInfo() {
        return this.chainInfo;
    }

    public QueryIpCodecollectResponse setIpownerInfo(IPCodeIpOwnerInfo ipownerInfo) {
        this.ipownerInfo = ipownerInfo;
        return this;
    }
    public IPCodeIpOwnerInfo getIpownerInfo() {
        return this.ipownerInfo;
    }

}
