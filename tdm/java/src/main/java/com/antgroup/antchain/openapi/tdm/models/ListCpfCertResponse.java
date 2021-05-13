// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ListCpfCertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 每页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 记录总数
    @NameInMap("total")
    public Long total;

    // 证明开具信息列表
    @NameInMap("cert_list")
    public java.util.List<CertSummary> certList;

    public static ListCpfCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCpfCertResponse self = new ListCpfCertResponse();
        return TeaModel.build(map, self);
    }

    public ListCpfCertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCpfCertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCpfCertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCpfCertResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListCpfCertResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCpfCertResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListCpfCertResponse setCertList(java.util.List<CertSummary> certList) {
        this.certList = certList;
        return this;
    }
    public java.util.List<CertSummary> getCertList() {
        return this.certList;
    }

}
