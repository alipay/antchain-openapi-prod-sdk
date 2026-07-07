// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PagequeryDataassetTypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // DataTypeInfo
    @NameInMap("data_type_info")
    public java.util.List<DataTypeInfo> dataTypeInfo;

    // 总数量
    @NameInMap("total")
    public Long total;

    // 1
    @NameInMap("page_number")
    public Long pageNumber;

    // pageSize
    @NameInMap("page_size")
    public Long pageSize;

    public static PagequeryDataassetTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDataassetTypeResponse self = new PagequeryDataassetTypeResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryDataassetTypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryDataassetTypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryDataassetTypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryDataassetTypeResponse setDataTypeInfo(java.util.List<DataTypeInfo> dataTypeInfo) {
        this.dataTypeInfo = dataTypeInfo;
        return this;
    }
    public java.util.List<DataTypeInfo> getDataTypeInfo() {
        return this.dataTypeInfo;
    }

    public PagequeryDataassetTypeResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryDataassetTypeResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryDataassetTypeResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
