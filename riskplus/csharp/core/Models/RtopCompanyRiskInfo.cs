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
        [NameInMap("place_type")]
        [Validation(Required=false)]
        public string PlaceType { get; set; }

        // 区域
        [NameInMap("place_name")]
        [Validation(Required=false)]
        public string PlaceName { get; set; }

        // 企业唯一id
        [NameInMap("mct_one_id")]
        [Validation(Required=false)]
        public string MctOneId { get; set; }

        // 企业统一社会信用代码
        [NameInMap("uc_code")]
        [Validation(Required=false)]
        public string UcCode { get; set; }

        // 工商注册号
        [NameInMap("reg_no")]
        [Validation(Required=false)]
        public string RegNo { get; set; }

        // 组织机构代码
        [NameInMap("org_code")]
        [Validation(Required=false)]
        public string OrgCode { get; set; }

        // 企业名
        [NameInMap("org_name")]
        [Validation(Required=false)]
        public string OrgName { get; set; }

        // 风险评分
        [NameInMap("risk_score")]
        [Validation(Required=false)]
        public string RiskScore { get; set; }

        // 风险变化程度排序，根据分值波动大小，标签变更次数排序
        [NameInMap("risk_shift_rank")]
        [Validation(Required=false)]
        public string RiskShiftRank { get; set; }

        // 风险定性
        [NameInMap("risk_type")]
        [Validation(Required=false)]
        public string RiskType { get; set; }

        // 风险标签id列表
        [NameInMap("risk_tags_id")]
        [Validation(Required=false)]
        public List<string> RiskTagsId { get; set; }

        // 线索
        [NameInMap("tags_clue")]
        [Validation(Required=false)]
        public string TagsClue { get; set; }

        // 风险线索明细
        [NameInMap("tags_clue_detail")]
        [Validation(Required=false)]
        public string TagsClueDetail { get; set; }

    }

}
