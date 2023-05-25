// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryClusterScanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果
    @NameInMap("result")
    public java.util.List<ScanResult> result;

    // 扫描id
    @NameInMap("scan_id")
    public String scanId;

    // 集群id
    @NameInMap("cluster_id")
    public String clusterId;

    public static QueryClusterScanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterScanResponse self = new QueryClusterScanResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterScanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryClusterScanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryClusterScanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryClusterScanResponse setResult(java.util.List<ScanResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ScanResult> getResult() {
        return this.result;
    }

    public QueryClusterScanResponse setScanId(String scanId) {
        this.scanId = scanId;
        return this;
    }
    public String getScanId() {
        return this.scanId;
    }

    public QueryClusterScanResponse setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
