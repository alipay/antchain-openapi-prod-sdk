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

        // ALIPAY 表示小程序支付，ALIPAY_APP表示App支付, ALIPAY_WAP表示手机网站支付
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

        // 接入方存储的accessToken
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

        // 支付完成后的回跳地址
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // AC编码
        [NameInMap("nft_id")]
        [Validation(Required=false)]
        public string NftId { get; set; }

        // 鲸探测分配的实物规格编码
        [NameInMap("item_code")]
        [Validation(Required=false)]
        public string ItemCode { get; set; }

        // 用户购买的商品个数
        [NameInMap("item_num")]
        [Validation(Required=false)]
        public long? ItemNum { get; set; }

        // 商品单价，单位分
        [NameInMap("item_price_cent")]
        [Validation(Required=false)]
        public long? ItemPriceCent { get; set; }

        // 资源ID
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 根据实际情况传递
        [NameInMap("resource_type")]
        [Validation(Required=false)]
        public string ResourceType { get; set; }

        // 是否使用GET方法支持wap支付
        [NameInMap("wap_pay_use_get")]
        [Validation(Required=false)]
        public bool? WapPayUseGet { get; set; }

    }

}
