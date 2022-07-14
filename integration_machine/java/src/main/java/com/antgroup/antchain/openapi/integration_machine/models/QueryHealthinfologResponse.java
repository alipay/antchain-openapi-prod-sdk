// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryHealthinfologResponse extends TeaModel {
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
    @NameInMap("total")
    public Long total;

    // 总页数
    @NameInMap("pages")
    public Long pages;

    // 列表数据
    @NameInMap("data_list")
    public java.util.List<HealthInfoLog> dataList;

    public static QueryHealthinfologResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthinfologResponse self = new QueryHealthinfologResponse();
        return TeaModel.build(map, self);
    }

    public QueryHealthinfologResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryHealthinfologResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHealthinfologResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryHealthinfologResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryHealthinfologResponse setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public QueryHealthinfologResponse setDataList(java.util.List<HealthInfoLog> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<HealthInfoLog> getDataList() {
        return this.dataList;
    }

}
