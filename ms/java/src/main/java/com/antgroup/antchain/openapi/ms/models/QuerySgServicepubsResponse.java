// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgServicepubsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // [
    //         {
    //             "gmtModified":"2019-12-12T20:58:26+08:00",
    //             "alive":true,
    //             "hostIp":"10.15.228.102",
    //             "appName":"aliyun-demo",
    //             "weight":100,
    //             "gmtCreate":"2019-12-12T20:58:26+08:00",
    //             "content":"10.15.228.96:12200?rpcVer=50303&serialization=hessian2&weight=100&timeout=3000&appName=aliyun-demo&warmupTime=0&warmupWeight=10&p=1&v=4.0&_SERIALIZETYPE=hessian2&_WEIGHT=100&_TIMEOUT=3000&app_name=aliyun-demo&startTime=1576047463993",
    //             "mosn":false,
    //             "timeout":3000,
    //             "serviceIp":"10.15.228.96",
    //             "protocol":"bolt",
    //             "instanceId":"0SGTOGOOLRD8",
    //             "dataId":"com.antfin.demo.endpoint.facade.SampleRestFacade:1.0@DEFAULT",
    //             "processId":"10.15.228.102:64638",
    //             "zone":"DEFAULT_ZONE",
    //             "checkSum":"d7e0e231f57d1156fe4a4f0979231fe5",
    //             "vmMode":false,
    //             "id":969,
    //             "servicePort":12200,
    //             "status":true
    //         }
    @NameInMap("publishers")
    public java.util.List<Publisher> publishers;

    // 起始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    public static QuerySgServicepubsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgServicepubsResponse self = new QuerySgServicepubsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgServicepubsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgServicepubsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgServicepubsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgServicepubsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QuerySgServicepubsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySgServicepubsResponse setPublishers(java.util.List<Publisher> publishers) {
        this.publishers = publishers;
        return this;
    }
    public java.util.List<Publisher> getPublishers() {
        return this.publishers;
    }

    public QuerySgServicepubsResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QuerySgServicepubsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
