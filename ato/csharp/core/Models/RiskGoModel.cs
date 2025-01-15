// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 云 api 风控查询响应
    public class RiskGoModel : TeaModel {
        // 风险类型。
        // 枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
        [NameInMap("risk_type")]
        [Validation(Required=true)]
        public string RiskType { get; set; }

        // 风险等级。
        // 枚举：rank0 无法判断；rank1 极低风险；rank2 较低风险；rank3 中风险；rank4 高风险；rank5 极高风险
        [NameInMap("risk_value")]
        [Validation(Required=true)]
        public string RiskValue { get; set; }

        // 风险描述
        [NameInMap("risk_desc")]
        [Validation(Required=true)]
        public string RiskDesc { get; set; }

        // 风险标签
        [NameInMap("info_code")]
        [Validation(Required=false)]
        public string InfoCode { get; set; }

    }

}
