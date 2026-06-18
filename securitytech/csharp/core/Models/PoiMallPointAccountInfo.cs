// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 积分账户信息
    public class PoiMallPointAccountInfo : TeaModel {
        // 门店ID
        [NameInMap("store_id")]
        [Validation(Required=false)]
        public string StoreId { get; set; }

        // 账户ID
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 总积分
        [NameInMap("total_point")]
        [Validation(Required=false)]
        public string TotalPoint { get; set; }

        // 已充值积分
        [NameInMap("recharged_point")]
        [Validation(Required=false)]
        public string RechargedPoint { get; set; }

        // 可用积分
        [NameInMap("available_point")]
        [Validation(Required=false)]
        public string AvailablePoint { get; set; }

        // 冻结积分
        [NameInMap("frozen_point")]
        [Validation(Required=false)]
        public string FrozenPoint { get; set; }

        // 已消费积分
        [NameInMap("consumed_point")]
        [Validation(Required=false)]
        public string ConsumedPoint { get; set; }

        // 账户状态
        [NameInMap("account_status")]
        [Validation(Required=false)]
        public string AccountStatus { get; set; }

    }

}
