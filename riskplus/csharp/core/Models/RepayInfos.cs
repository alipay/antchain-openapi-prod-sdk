// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 还款信息列表
    public class RepayInfos : TeaModel {
        // 期次
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 实还总额
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 实还本金
        [NameInMap("principal")]
        [Validation(Required=true)]
        public long? Principal { get; set; }

        // 实还利息
        [NameInMap("interest")]
        [Validation(Required=true)]
        public long? Interest { get; set; }

        // 实还通道手续费
        [NameInMap("channel_amt")]
        [Validation(Required=true)]
        public long? ChannelAmt { get; set; }

        // 实还手续费
        [NameInMap("fee")]
        [Validation(Required=true)]
        public long? Fee { get; set; }

        // 实收罚息
        [NameInMap("punish")]
        [Validation(Required=true)]
        public long? Punish { get; set; }

        // 担保费
        [NameInMap("guarantee_fee")]
        [Validation(Required=true)]
        public long? GuaranteeFee { get; set; }

        // 违约金
        [NameInMap("liquidated_damages")]
        [Validation(Required=true)]
        public long? LiquidatedDamages { get; set; }

    }

}
