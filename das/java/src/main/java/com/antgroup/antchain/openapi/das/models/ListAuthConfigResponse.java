// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ListAuthConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总条数
    @NameInMap("count")
    public Long count;

    // 总页数
    @NameInMap("total_pages")
    public Long totalPages;

    // 列表记录
    @NameInMap("data_list")
    public java.util.List<DataAuthConfigListResponse> dataList;

    public static ListAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthConfigResponse self = new ListAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAuthConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAuthConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAuthConfigResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListAuthConfigResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public ListAuthConfigResponse setDataList(java.util.List<DataAuthConfigListResponse> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DataAuthConfigListResponse> getDataList() {
        return this.dataList;
    }

}
