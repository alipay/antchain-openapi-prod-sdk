// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智租风控模型结构体
    public class AppletRiskModel : TeaModel {
        // 风险咨询事件ID
        [NameInMap("record_id")]
        [Validation(Required=true)]
        public string RecordId { get; set; }

        // 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险
        [NameInMap("risk_rank")]
        [Validation(Required=true)]
        public string RiskRank { get; set; }

        // 风险名称
        [NameInMap("risk_name")]
        [Validation(Required=true)]
        public string RiskName { get; set; }

        // 风险等级中文描述
        [NameInMap("risk_desc")]
        [Validation(Required=true)]
        public string RiskDesc { get; set; }

        // 子风险结果列表
        [NameInMap("sub_risk_result_list")]
        [Validation(Required=true)]
        public List<SubRentRiskItem> SubRiskResultList { get; set; }

    }

}
