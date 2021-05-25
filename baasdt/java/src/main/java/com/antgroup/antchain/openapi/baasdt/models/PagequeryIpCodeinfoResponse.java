// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpCodeinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页码
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面数据量大小
    @NameInMap("page_size")
    public Long pageSize;

    // 领取到的正版码总数
    @NameInMap("code_count")
    public Long codeCount;

    // 正版码列表信息
    @NameInMap("code_list")
    public java.util.List<IPCodeScannedInfo> codeList;

    public static PagequeryIpCodeinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpCodeinfoResponse self = new PagequeryIpCodeinfoResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIpCodeinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIpCodeinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIpCodeinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIpCodeinfoResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpCodeinfoResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIpCodeinfoResponse setCodeCount(Long codeCount) {
        this.codeCount = codeCount;
        return this;
    }
    public Long getCodeCount() {
        return this.codeCount;
    }

    public PagequeryIpCodeinfoResponse setCodeList(java.util.List<IPCodeScannedInfo> codeList) {
        this.codeList = codeList;
        return this;
    }
    public java.util.List<IPCodeScannedInfo> getCodeList() {
        return this.codeList;
    }

}
