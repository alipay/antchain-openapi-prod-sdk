// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ListbysubjectAntchainDasKyaVcdigestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数目
    @NameInMap("total")
    public Long total;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // vc摘要详情
    @NameInMap("vc_items")
    public java.util.List<VcSummaryItem> vcItems;

    public static ListbysubjectAntchainDasKyaVcdigestResponse build(java.util.Map<String, ?> map) throws Exception {
        ListbysubjectAntchainDasKyaVcdigestResponse self = new ListbysubjectAntchainDasKyaVcdigestResponse();
        return TeaModel.build(map, self);
    }

    public ListbysubjectAntchainDasKyaVcdigestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListbysubjectAntchainDasKyaVcdigestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListbysubjectAntchainDasKyaVcdigestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListbysubjectAntchainDasKyaVcdigestResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListbysubjectAntchainDasKyaVcdigestResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListbysubjectAntchainDasKyaVcdigestResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListbysubjectAntchainDasKyaVcdigestResponse setVcItems(java.util.List<VcSummaryItem> vcItems) {
        this.vcItems = vcItems;
        return this;
    }
    public java.util.List<VcSummaryItem> getVcItems() {
        return this.vcItems;
    }

}
