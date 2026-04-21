// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 结算详细信息
    public class SettleDetailInfo : TeaModel {
        // 结算收款方账户类型
        [NameInMap("trans_in_type")]
        [Validation(Required=true)]
        public string TransInType { get; set; }

        // 结算收款方
        [NameInMap("trans_in")]
        [Validation(Required=true)]
        public string TransIn { get; set; }

        // 结算汇总维度
        [NameInMap("summary_dimension")]
        [Validation(Required=false)]
        public string SummaryDimension { get; set; }

        // 结算主体类型
        [NameInMap("settle_entity_type")]
        [Validation(Required=false)]
        public string SettleEntityType { get; set; }

        // 结算主体标识
        [NameInMap("settle_entity_id")]
        [Validation(Required=false)]
        public string SettleEntityId { get; set; }

    }

}
