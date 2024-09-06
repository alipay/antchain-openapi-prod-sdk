// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智租风控-子风险项
    public class SubRentRiskItem : TeaModel {
        // 风险名称。枚举值：BASE_PERFORMANCE - 基础履约风险；OVERDUE - 逾期风险；MULTI_RENT - 共租风险。
        [NameInMap("risk_name")]
        [Validation(Required=true)]
        public string RiskName { get; set; }

        // 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险。 
        [NameInMap("risk_rank")]
        [Validation(Required=true)]
        public string RiskRank { get; set; }

        // 风险描述
        [NameInMap("risk_desc")]
        [Validation(Required=true)]
        public string RiskDesc { get; set; }

    }

}
