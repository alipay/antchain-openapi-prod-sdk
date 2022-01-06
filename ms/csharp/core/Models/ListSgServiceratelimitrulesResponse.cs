// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class ListSgServiceratelimitrulesResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 限流规则json串：[{"appName":"testRuleApp","limitRules":[{"dataId":"com.alipay.sofa.service@SOFA","enable":false,"id":195,"instanceId":"testInstanceId","methodName":"helloMesh","name":"xytest","resourceType":"DATA_ID_METHOD","ruleConfig":{"limitRuleItems":[{"action":{"extension":"","type":"REJECT"},"configs":{"algorithm":"TokenBucket","maxBurstRatio":1,"metricWindowSize":1000,"threshold":1},"ruleId":"o-620bb9","ruleType":"QPS","trafficConditions":[{"field":"sourceApp","operation":"IN","type":"system","value":["a","b"]}]}],"resource":"com.alipay.sofa.mesh.facade.TomJerryFacade:1.0@DEFAULT.helloMesh:i:r"},"serviceType":"SOFA"}]}]
        [NameInMap("service_rate_limit_rules")]
        [Validation(Required=false)]
        public string ServiceRateLimitRules { get; set; }

        // 起始索引
        [NameInMap("start_index")]
        [Validation(Required=false)]
        public long? StartIndex { get; set; }

        // 总条数
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

    }

}
