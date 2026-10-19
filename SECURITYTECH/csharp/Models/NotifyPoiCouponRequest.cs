// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class NotifyPoiCouponRequest : TeaModel {
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

        // 通知模版枚举值：
        // COUPON_RECEIVE_REMIND-优惠券领取提醒（用户接收频次：2周1次）；COUPON_EXPIRE_REMIND-优惠券到期提醒（用户接收频次：1周1次）。
        [NameInMap("notify_template")]
        [Validation(Required=true)]
        public string NotifyTemplate { get; set; }

        // 通知模版内容（JSON格式）
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
