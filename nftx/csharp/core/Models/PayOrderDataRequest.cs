// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class PayOrderDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接入方测订单号，保证全局唯一
        [NameInMap("external_order_no")]
        [Validation(Required=true)]
        public string ExternalOrderNo { get; set; }

        // 订单金额，单位为分
        [NameInMap("amount_cent")]
        [Validation(Required=true)]
        public long? AmountCent { get; set; }

        // ALIPAY 表示小程序支付，ALIPAY_APP表示App支付
        [NameInMap("pay_channel")]
        [Validation(Required=true)]
        public string PayChannel { get; set; }

        // 订单标题，支付宝账单会展示
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 订单超时时间，秒级
        [NameInMap("timeout_expire_second")]
        [Validation(Required=true)]
        public long? TimeoutExpireSecond { get; set; }

    }

}
