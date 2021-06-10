// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    // 结算规则
    public class SettleRule : TeaModel {
        // 结算类型， bankCard-表示结算到银行卡；alipayAccount-表示结算到支付宝账号
        [NameInMap("default_settle_type")]
        [Validation(Required=true)]
        public string DefaultSettleType { get; set; }

        // 结算目标
        // 如果settle_type = bankCard, 这里填写银行卡卡号;
        // 如果settle_type = alipayAccount, 这里填写支付宝账号登录号, 且要求与商户名称name同名
        [NameInMap("default_settle_target")]
        [Validation(Required=true)]
        public string DefaultSettleTarget { get; set; }

    }

}
