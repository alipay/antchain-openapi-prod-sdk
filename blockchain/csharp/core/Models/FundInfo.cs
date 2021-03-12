// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 营销分销平台推广人账户信息
    public class FundInfo : TeaModel {
        // 可提现余额
        [NameInMap("balance")]
        [Validation(Required=true)]
        public string Balance { get; set; }

        // 待结算额度
        [NameInMap("settle_quota")]
        [Validation(Required=true)]
        public string SettleQuota { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

    }

}
