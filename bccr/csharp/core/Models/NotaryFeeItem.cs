// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 本次需支付费用的分项明细
    public class NotaryFeeItem : TeaModel {
        // 费用分项描述
        [NameInMap("fee_item_desc")]
        [Validation(Required=true)]
        public string FeeItemDesc { get; set; }

        // 费用分项金额(分)
        [NameInMap("fee_item_amount_rmb_fen")]
        [Validation(Required=true)]
        public long? FeeItemAmountRmbFen { get; set; }

        // 费用分项详情列表
        [NameInMap("fee_detail_list")]
        [Validation(Required=true)]
        public List<FeeDetail> FeeDetailList { get; set; }

    }

}
