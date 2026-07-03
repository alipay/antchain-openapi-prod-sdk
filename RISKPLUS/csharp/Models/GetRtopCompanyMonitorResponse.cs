// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class GetRtopCompanyMonitorResponse : TeaModel {
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

        // 活跃市，不带国家和地区的代码
        [NameInMap("active_city")]
        [Validation(Required=true)]
        public string ActiveCity { get; set; }

        // 监测企业的行业
        [NameInMap("company_category")]
        [Validation(Required=false)]
        public string CompanyCategory { get; set; }

        // 涉众风险类型
        [NameInMap("crowd_risk_type")]
        [Validation(Required=true)]
        public string CrowdRiskType { get; set; }

        [NameInMap("features")]
        [Validation(Required=true)]
        public List<RtopMonitorCompanyFeature> Features { get; set; }

        // 影响金额
        [NameInMap("money_involved")]
        [Validation(Required=true)]
        public long? MoneyInvolved { get; set; }

        [NameInMap("monitor_risk_tags")]
        [Validation(Required=true)]
        public List<string> MonitorRiskTags { get; set; }

        // 监测企业的评分
        [NameInMap("monitor_score")]
        [Validation(Required=true)]
        public long? MonitorScore { get; set; }

        // 影响人数
        [NameInMap("people_involved")]
        [Validation(Required=true)]
        public long? PeopleInvolved { get; set; }

        // 注册市，不带国家和地区的代码
        [NameInMap("registered_city")]
        [Validation(Required=true)]
        public string RegisteredCity { get; set; }

    }

}
