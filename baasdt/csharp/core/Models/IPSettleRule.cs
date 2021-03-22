// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP授权服务: SettleRule
    public class IPSettleRule : TeaModel {
        // 结算类型， 1-表示结算到银行卡；2-表示结算到支付宝账号
        [NameInMap("settle_type")]
        [Validation(Required=true)]
        public long? SettleType { get; set; }

        // 结算目标 如果settle_type = 1, 这里填写银行卡卡号; 如果settle_type = 2, 这里填写支付宝账号登录号, 且要求与商户名称name同名
        [NameInMap("settle_target")]
        [Validation(Required=true)]
        public string SettleTarget { get; set; }

    }

}
