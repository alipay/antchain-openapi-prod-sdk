// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 客户历史交易信息
    public class HisTranInfo : TeaModel {
        // 维修单号
        [NameInMap("repair_no")]
        [Validation(Required=false)]
        public string RepairNo { get; set; }

        // 购买日期
        [NameInMap("buy_date")]
        [Validation(Required=false)]
        public string BuyDate { get; set; }

        // 商品型号
        [NameInMap("comm_type")]
        [Validation(Required=false)]
        public string CommType { get; set; }

        // 商品金额
        [NameInMap("comm_amount")]
        [Validation(Required=false)]
        public string CommAmount { get; set; }

        // 维修时间
        [NameInMap("repair_time")]
        [Validation(Required=false)]
        public string RepairTime { get; set; }

        // 是否联保
        [NameInMap("is_joint")]
        [Validation(Required=false)]
        public string IsJoint { get; set; }

        // 合计费用(每笔历史交易的合计费用)
        [NameInMap("total_cost")]
        [Validation(Required=false)]
        public string TotalCost { get; set; }

    }

}
