// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class InitTradeAppRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接入方 外部业务订单号，接入方 内唯一，创建后不可变
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

        // 支付金额，单位：元，大于 0，最多两位小数
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

        // 商品或权益卡标题
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 用户登记手机号，中国大陆 11 位手机号
        [NameInMap("registered_mobile")]
        [Validation(Required=false)]
        public string RegisteredMobile { get; set; }

        // 用户登录接口返回的用户唯一标识
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 权益档位 ID
        [NameInMap("tier_id")]
        [Validation(Required=true)]
        public string TierId { get; set; }

    }

}
