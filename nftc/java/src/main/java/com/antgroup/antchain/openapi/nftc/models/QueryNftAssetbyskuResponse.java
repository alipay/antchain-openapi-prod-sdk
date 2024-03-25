// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryNftAssetbyskuResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户资产列表
    @NameInMap("asset_list")
    public UserAsset assetList;

    // 支付宝账户id，特殊场景返回，通常情况无需关注
    @NameInMap("alipay_uid")
    public String alipayUid;

    public static QueryNftAssetbyskuResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNftAssetbyskuResponse self = new QueryNftAssetbyskuResponse();
        return TeaModel.build(map, self);
    }

    public QueryNftAssetbyskuResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNftAssetbyskuResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNftAssetbyskuResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNftAssetbyskuResponse setAssetList(UserAsset assetList) {
        this.assetList = assetList;
        return this;
    }
    public UserAsset getAssetList() {
        return this.assetList;
    }

    public QueryNftAssetbyskuResponse setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

}
