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
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市</para>
        /// </summary>
        [NameInMap("active_city")]
        [Validation(Required=false)]
        public string ActiveCity { get; set; }

        // 活跃县
        /// <summary>
        /// <b>Example:</b>
        /// <para>西湖区</para>
        /// </summary>
        [NameInMap("active_county")]
        [Validation(Required=false)]
        public string ActiveCounty { get; set; }

        // 活跃省
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省</para>
        /// </summary>
        [NameInMap("active_province")]
        [Validation(Required=false)]
        public string ActiveProvince { get; set; }

        // 风险标签
        [NameInMap("clue_tags")]
        [Validation(Required=false)]
        public List<string> ClueTags { get; set; }

        // 企业ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456789</para>
        /// </summary>
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXXXX有限公司</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 风险等级
        /// <summary>
        /// <b>Example:</b>
        /// <para>EX_HIGH_RISK</para>
        /// </summary>
        [NameInMap("crowd_risk_level")]
        [Validation(Required=false)]
        public string CrowdRiskLevel { get; set; }

        // 涉众风险分数
        /// <summary>
        /// <b>Example:</b>
        /// <para>80</para>
        /// </summary>
        [NameInMap("crowd_risk_score")]
        [Validation(Required=false)]
        public long? CrowdRiskScore { get; set; }

        // 涉众风险类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>MLM</para>
        /// </summary>
        [NameInMap("crowd_risk_type")]
        [Validation(Required=false)]
        public string CrowdRiskType { get; set; }

        // 发现时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-07-15</para>
        /// </summary>
        [NameInMap("detected_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DetectedTime { get; set; }

        // 影响金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("money_involved")]
        [Validation(Required=false)]
        public long? MoneyInvolved { get; set; }

        // 影响人数
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("people_involved")]
        [Validation(Required=false)]
        public long? PeopleInvolved { get; set; }

        // 注册市
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市</para>
        /// </summary>
        [NameInMap("registered_city")]
        [Validation(Required=false)]
        public string RegisteredCity { get; set; }

        // 注册县
        /// <summary>
        /// <b>Example:</b>
        /// <para>西湖区</para>
        /// </summary>
        [NameInMap("registered_county")]
        [Validation(Required=false)]
        public string RegisteredCounty { get; set; }

        // 注册省
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省</para>
        /// </summary>
        [NameInMap("registered_province")]
        [Validation(Required=false)]
        public string RegisteredProvince { get; set; }

    }

}
