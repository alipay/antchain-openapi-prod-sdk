// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class UpdatePoiOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝小程序用户唯一ID
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 商户入驻主体ID
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商城订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 履约状态：SHIPPED-已发货 / RECEIVED-已确认收货
        [NameInMap("fulfill_status")]
        [Validation(Required=true)]
        public string FulfillStatus { get; set; }

        // 状态发生业务时间，格式yyyy-MM-dd HH:mm:ss，建议传入便于对账
        [NameInMap("status_gmt")]
        [Validation(Required=false)]
        public string StatusGmt { get; set; }

    }

}
