// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业涉众风险详细信息
    public class RtopCrowdRiskSummaryResp : TeaModel {
        // 活跃市
        [NameInMap("active_city")]
        [Validation(Required=false)]
        public string ActiveCity { get; set; }

        // 活跃县
        [NameInMap("active_county")]
        [Validation(Required=false)]
        public string ActiveCounty { get; set; }

        // 活跃省
        [NameInMap("active_province")]
        [Validation(Required=false)]
        public string ActiveProvince { get; set; }

        // 风险标签
        [NameInMap("clue_tags")]
        [Validation(Required=false)]
        public List<string> ClueTags { get; set; }

        // 企业ID
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 风险等级
        [NameInMap("crowd_risk_level")]
        [Validation(Required=false)]
        public string CrowdRiskLevel { get; set; }

        // 涉众风险分数
        [NameInMap("crowd_risk_score")]
        [Validation(Required=false)]
        public long? CrowdRiskScore { get; set; }

        // 涉众风险类型
        [NameInMap("crowd_risk_type")]
        [Validation(Required=false)]
        public string CrowdRiskType { get; set; }

        // 发现时间
        [NameInMap("detected_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DetectedTime { get; set; }

        // 影响金额
        [NameInMap("money_involved")]
        [Validation(Required=false)]
        public long? MoneyInvolved { get; set; }

        // 影响人数
        [NameInMap("people_involved")]
        [Validation(Required=false)]
        public long? PeopleInvolved { get; set; }

        // 注册市
        [NameInMap("registered_city")]
        [Validation(Required=false)]
        public string RegisteredCity { get; set; }

        // 注册县
        [NameInMap("registered_county")]
        [Validation(Required=false)]
        public string RegisteredCounty { get; set; }

        // 注册省
        [NameInMap("registered_province")]
        [Validation(Required=false)]
        public string RegisteredProvince { get; set; }

    }

}
