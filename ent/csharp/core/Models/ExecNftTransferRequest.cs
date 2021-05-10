// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class ExecNftTransferRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付用户uid
        [NameInMap("alipay_uid")]
        [Validation(Required=true)]
        public string AlipayUid { get; set; }

        // 在外部渠道的全局唯一id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 外部订单号（阿里拍卖成功的订单号）
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 拍品成交价（单位：分）
        [NameInMap("price_cent")]
        [Validation(Required=true)]
        public long? PriceCent { get; set; }

        // 订单成功时间
        [NameInMap("order_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrderTime { get; set; }

    }

}
