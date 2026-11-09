// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class SyncAntchainAtoTradeUserpromisedelayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // order_id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // merchant_id
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 1
        [NameInMap("delay_start_period")]
        [Validation(Required=true)]
        public long? DelayStartPeriod { get; set; }

        // 延期时间单位
        [NameInMap("delay_time_unit")]
        [Validation(Required=true)]
        public string DelayTimeUnit { get; set; }

        // 延期时间数值
        [NameInMap("delay_time_value")]
        [Validation(Required=true)]
        public long? DelayTimeValue { get; set; }

        // 原因描述
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

    }

}
