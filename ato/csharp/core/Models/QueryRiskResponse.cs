// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryRiskResponse : TeaModel {
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

        // 请求唯一ID标识，为空则是异常
        [NameInMap("security_id")]
        [Validation(Required=false)]
        public string SecurityId { get; set; }

        // 总风险决策结果，枚举值为：reject[拒绝],validate[待定],accept[通过]。
        [NameInMap("decision")]
        [Validation(Required=false)]
        public string Decision { get; set; }

        // 风险场景的决策结果
        [NameInMap("scenes")]
        [Validation(Required=false)]
        public List<RiskScene> Scenes { get; set; }

        // 策略结果详情
        [NameInMap("strategies")]
        [Validation(Required=false)]
        public List<RiskStrategy> Strategies { get; set; }

        // 模型结果详情
        [NameInMap("models")]
        [Validation(Required=false)]
        public List<RiskModel> Models { get; set; }

    }

}
