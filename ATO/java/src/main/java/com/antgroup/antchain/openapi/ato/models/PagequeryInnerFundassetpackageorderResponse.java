// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFundassetpackageorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // AssetPackageOrderPageQueryRes响应体json格式
    @NameInMap("data_list")
    public String dataList;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static PagequeryInnerFundassetpackageorderResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFundassetpackageorderResponse self = new PagequeryInnerFundassetpackageorderResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFundassetpackageorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerFundassetpackageorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerFundassetpackageorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerFundassetpackageorderResponse setDataList(String dataList) {
        this.dataList = dataList;
        return this;
    }
    public String getDataList() {
        return this.dataList;
    }

    public PagequeryInnerFundassetpackageorderResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
