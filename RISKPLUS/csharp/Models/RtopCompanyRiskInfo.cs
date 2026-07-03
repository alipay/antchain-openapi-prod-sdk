// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 风报接口返回结构体
    public class RtopCompanyRiskInfo : TeaModel {
        // 区域类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>place_type</para>
        /// </summary>
        [NameInMap("place_type")]
        [Validation(Required=false)]
        public string PlaceType { get; set; }

        // 区域
        /// <summary>
        /// <b>Example:</b>
        /// <para>天津市</para>
        /// </summary>
        [NameInMap("place_name")]
        [Validation(Required=false)]
        public string PlaceName { get; set; }

        // 企业唯一id
        /// <summary>
        /// <b>Example:</b>
        /// <para>mct_one_id</para>
        /// </summary>
        [NameInMap("mct_one_id")]
        [Validation(Required=false)]
        public string MctOneId { get; set; }

        // 企业统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>uc_code</para>
        /// </summary>
        [NameInMap("uc_code")]
        [Validation(Required=false)]
        public string UcCode { get; set; }

        // 工商注册号
        /// <summary>
        /// <b>Example:</b>
        /// <para>reg_no</para>
        /// </summary>
        [NameInMap("reg_no")]
        [Validation(Required=false)]
        public string RegNo { get; set; }

        // 组织机构代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>org_code</para>
        /// </summary>
        [NameInMap("org_code")]
        [Validation(Required=false)]
        public string OrgCode { get; set; }

        // 企业名
        /// <summary>
        /// <b>Example:</b>
        /// <para>org_name</para>
        /// </summary>
        [NameInMap("org_name")]
        [Validation(Required=false)]
        public string OrgName { get; set; }

        // 风险评分
        /// <summary>
        /// <b>Example:</b>
        /// <para>risk_score</para>
        /// </summary>
        [NameInMap("risk_score")]
        [Validation(Required=false)]
        public string RiskScore { get; set; }

        // 风险变化程度排序，根据分值波动大小，标签变更次数排序
        /// <summary>
        /// <b>Example:</b>
        /// <para>risk_shift_rank</para>
        /// </summary>
        [NameInMap("risk_shift_rank")]
        [Validation(Required=false)]
        public string RiskShiftRank { get; set; }

        // 风险定性
        /// <summary>
        /// <b>Example:</b>
        /// <para>risk_type</para>
        /// </summary>
        [NameInMap("risk_type")]
        [Validation(Required=false)]
        public string RiskType { get; set; }

        // 风险标签id列表
        [NameInMap("risk_tags_id")]
        [Validation(Required=false)]
        public List<string> RiskTagsId { get; set; }

        // 线索
        /// <summary>
        /// <b>Example:</b>
        /// <para>tags_clue</para>
        /// </summary>
        [NameInMap("tags_clue")]
        [Validation(Required=false)]
        public string TagsClue { get; set; }

        // 风险线索明细
        /// <summary>
        /// <b>Example:</b>
        /// <para>tags_clue_detail</para>
        /// </summary>
        [NameInMap("tags_clue_detail")]
        [Validation(Required=false)]
        public string TagsClueDetail { get; set; }

    }

}
