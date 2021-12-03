// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class PagequeryNftCustomerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页码，查询时传入
    @NameInMap("page")
    public Long page;

    // 页长，查询时传入
    @NameInMap("page_size")
    public Long pageSize;

    // 列表总数
    @NameInMap("total_count")
    public Long totalCount;

    // 用户资产列表
    @NameInMap("asset_list")
    public java.util.List<UserAsset> assetList;

    public static PagequeryNftCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryNftCustomerResponse self = new PagequeryNftCustomerResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryNftCustomerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryNftCustomerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryNftCustomerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryNftCustomerResponse setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PagequeryNftCustomerResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryNftCustomerResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryNftCustomerResponse setAssetList(java.util.List<UserAsset> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<UserAsset> getAssetList() {
        return this.assetList;
    }

}
