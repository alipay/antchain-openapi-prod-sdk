// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class ExecMaasPriceResponse : TeaModel {
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

        // 至少一个输出单元命中
        [NameInMap("matched")]
        [Validation(Required=false)]
        public bool? Matched { get; set; }

        // 首个输出单元是否命中兜底规则
        [NameInMap("fallback")]
        [Validation(Required=false)]
        public bool? Fallback { get; set; }

        // 命中规则编码
        [NameInMap("price_rule_code")]
        [Validation(Required=false)]
        public string PriceRuleCode { get; set; }

        // 规则版本
        [NameInMap("matched_rule_version")]
        [Validation(Required=false)]
        public long? MatchedRuleVersion { get; set; }

        // 规则名称
        [NameInMap("rule_name")]
        [Validation(Required=false)]
        public string RuleName { get; set; }

        // 规则优先级
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

        // 只计一次的请求级费用明细
        [NameInMap("request_items")]
        [Validation(Required=false)]
        public List<RequestItems> RequestItems { get; set; }

        // 各输出单元的试算明细
        [NameInMap("unit_estimates")]
        [Validation(Required=false)]
        public List<UnitEstimates> UnitEstimates { get; set; }

        // 试算总金额
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public string TotalAmount { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 未命中或部分命中时的提示
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
