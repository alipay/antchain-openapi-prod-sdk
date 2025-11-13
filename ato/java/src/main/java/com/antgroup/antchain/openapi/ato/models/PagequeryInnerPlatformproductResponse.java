// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerPlatformproductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    // 商品列表对象
    @NameInMap("platform_product_info_list")
    public java.util.List<PlatformProductInfoResp> platformProductInfoList;

    public static PagequeryInnerPlatformproductResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerPlatformproductResponse self = new PagequeryInnerPlatformproductResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerPlatformproductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerPlatformproductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerPlatformproductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerPlatformproductResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryInnerPlatformproductResponse setPlatformProductInfoList(java.util.List<PlatformProductInfoResp> platformProductInfoList) {
        this.platformProductInfoList = platformProductInfoList;
        return this;
    }
    public java.util.List<PlatformProductInfoResp> getPlatformProductInfoList() {
        return this.platformProductInfoList;
    }

}
