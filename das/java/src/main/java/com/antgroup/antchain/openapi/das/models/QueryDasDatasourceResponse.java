// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryDasDatasourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据源信息列表
    @NameInMap("data_sources")
    public java.util.List<DataSourceInfo> dataSources;

    public static QueryDasDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDasDatasourceResponse self = new QueryDasDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public QueryDasDatasourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDasDatasourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDasDatasourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDasDatasourceResponse setDataSources(java.util.List<DataSourceInfo> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DataSourceInfo> getDataSources() {
        return this.dataSources;
    }

}
