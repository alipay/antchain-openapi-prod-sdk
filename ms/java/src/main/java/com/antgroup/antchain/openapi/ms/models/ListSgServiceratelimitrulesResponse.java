// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgServiceratelimitrulesResponse extends TeaModel {
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

    // 限流规则json串：[{"appName":"testRuleApp","limitRules":[{"dataId":"com.alipay.sofa.service@SOFA","enable":false,"id":195,"instanceId":"testInstanceId","methodName":"helloMesh","name":"xytest","resourceType":"DATA_ID_METHOD","ruleConfig":{"limitRuleItems":[{"action":{"extension":"","type":"REJECT"},"configs":{"algorithm":"TokenBucket","maxBurstRatio":1,"metricWindowSize":1000,"threshold":1},"ruleId":"o-620bb9","ruleType":"QPS","trafficConditions":[{"field":"sourceApp","operation":"IN","type":"system","value":["a","b"]}]}],"resource":"com.alipay.sofa.mesh.facade.TomJerryFacade:1.0@DEFAULT.helloMesh:i:r"},"serviceType":"SOFA"}]}]
    @NameInMap("service_rate_limit_rules")
    public String serviceRateLimitRules;

    // 起始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    public static ListSgServiceratelimitrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgServiceratelimitrulesResponse self = new ListSgServiceratelimitrulesResponse();
        return TeaModel.build(map, self);
    }

    public ListSgServiceratelimitrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgServiceratelimitrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgServiceratelimitrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgServiceratelimitrulesResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSgServiceratelimitrulesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgServiceratelimitrulesResponse setServiceRateLimitRules(String serviceRateLimitRules) {
        this.serviceRateLimitRules = serviceRateLimitRules;
        return this;
    }
    public String getServiceRateLimitRules() {
        return this.serviceRateLimitRules;
    }

    public ListSgServiceratelimitrulesResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListSgServiceratelimitrulesResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
