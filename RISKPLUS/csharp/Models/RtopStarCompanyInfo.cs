// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 收藏的企业信息
    public class RtopStarCompanyInfo : TeaModel {
        // 行业
        [NameInMap("categories")]
        [Validation(Required=false)]
        public List<string> Categories { get; set; }

        // 经营地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>广东省珠海市前山金鸡西路</para>
        /// </summary>
        [NameInMap("operating_place")]
        [Validation(Required=false)]
        public string OperatingPlace { get; set; }

        // 经营省份
        /// <summary>
        /// <b>Example:</b>
        /// <para>湖北省</para>
        /// </summary>
        [NameInMap("operating_province")]
        [Validation(Required=false)]
        public string OperatingProvince { get; set; }

        // 企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>珠海格力电器股份有限公司</para>
        /// </summary>
        [NameInMap("org_name")]
        [Validation(Required=false)]
        public string OrgName { get; set; }

        // 风险分数
        /// <summary>
        /// <b>Example:</b>
        /// <para>80</para>
        /// </summary>
        [NameInMap("risk_score")]
        [Validation(Required=false)]
        public long? RiskScore { get; set; }

        // 风险标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;内部被投诉&quot;,&quot;法定代表人名下企业超过6家&quot;]</para>
        /// </summary>
        [NameInMap("risk_tags")]
        [Validation(Required=false)]
        public List<string> RiskTags { get; set; }

        // 风险线索
        [NameInMap("risk_tag_details")]
        [Validation(Required=false)]
        public List<RtopRiskTag> RiskTagDetails { get; set; }

        // 风险标签Id集合
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;CMN00025&quot;, &quot;CMN00011&quot;]</para>
        /// </summary>
        [NameInMap("risk_tag_ids")]
        [Validation(Required=false)]
        public List<string> RiskTagIds { get; set; }

        // 统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91440400192548256N</para>
        /// </summary>
        [NameInMap("uc_code")]
        [Validation(Required=false)]
        public string UcCode { get; set; }

    }

}
