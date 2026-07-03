// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCrowdriskDetailResponse : TeaModel {
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

        // 年龄分布
        [NameInMap("age_distribution")]
        [Validation(Required=false)]
        public List<RtopAgeDistribution> AgeDistribution { get; set; }

        // 线索标签
        [NameInMap("clue_tags")]
        [Validation(Required=false)]
        public List<string> ClueTags { get; set; }

        // 报文
        [NameInMap("conclusion")]
        [Validation(Required=false)]
        public string Conclusion { get; set; }

        // 风险等级
        [NameInMap("crowd_risk_level")]
        [Validation(Required=false)]
        public string CrowdRiskLevel { get; set; }

        // 涉众风险分析的分数
        [NameInMap("crowd_risk_score")]
        [Validation(Required=false)]
        public long? CrowdRiskScore { get; set; }

        // 风险类型
        [NameInMap("crowd_risk_type")]
        [Validation(Required=false)]
        public string CrowdRiskType { get; set; }

        // 发现时间
        [NameInMap("detected_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DetectedTime { get; set; }

        // 特征
        [NameInMap("features")]
        [Validation(Required=false)]
        public List<RtopCrowdRiskFeatureResp> Features { get; set; }

        // 性别分布
        [NameInMap("gender_distribution")]
        [Validation(Required=false)]
        public List<RtopGenderDistribution> GenderDistribution { get; set; }

        // 上次活跃时间
        [NameInMap("last_active_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastActiveTime { get; set; }

        // 涉案金额
        [NameInMap("money_involved")]
        [Validation(Required=false)]
        public long? MoneyInvolved { get; set; }

        // 影响金额的历史曲线
        [NameInMap("money_involved_history")]
        [Validation(Required=false)]
        public List<RtopDateDistribution> MoneyInvolvedHistory { get; set; }

        // 涉案人数
        [NameInMap("people_involved")]
        [Validation(Required=false)]
        public long? PeopleInvolved { get; set; }

        // 影响人数的历史曲线
        [NameInMap("people_involved_history")]
        [Validation(Required=false)]
        public List<RtopDateDistribution> PeopleInvolvedHistory { get; set; }

        // 影响的人数分布，key为地区城市，value为影响的人数
        [NameInMap("population_distribution")]
        [Validation(Required=false)]
        public List<RtopPopulationDistribution> PopulationDistribution { get; set; }

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
