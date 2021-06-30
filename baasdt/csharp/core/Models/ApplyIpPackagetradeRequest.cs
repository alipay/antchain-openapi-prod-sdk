// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ApplyIpPackagetradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 买方的链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // IP授权交易时传入IP ID；增值服务交易时传入服务ID
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // true 只上链不走真实支付，false 上链并链下真实支付账单
        [NameInMap("only_call_blockchain")]
        [Validation(Required=true)]
        public bool? OnlyCallBlockchain { get; set; }

        // 终端商品价格区间
        [NameInMap("price_range")]
        [Validation(Required=true)]
        public string PriceRange { get; set; }

        // 套餐中包含终端商品数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 套餐交易应付金额，单位元，保留两位小数
        [NameInMap("expected_total_price")]
        [Validation(Required=true)]
        public string ExpectedTotalPrice { get; set; }

        // 授权合作开始期限（毫秒时间戳）
        [NameInMap("auth_begin_time")]
        [Validation(Required=true)]
        public long? AuthBeginTime { get; set; }

        // 授权合作结束期限（毫秒时间戳）
        [NameInMap("auth_end_time")]
        [Validation(Required=true)]
        public long? AuthEndTime { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 授权产品范围
        [NameInMap("auth_product_scope")]
        [Validation(Required=false)]
        public string AuthProductScope { get; set; }

        // 授权地域范围
        [NameInMap("auth_area_scope")]
        [Validation(Required=false)]
        public string AuthAreaScope { get; set; }

        // 商品销售渠道
        [NameInMap("sales_channel")]
        [Validation(Required=false)]
        public string SalesChannel { get; set; }

        // 0 IP交易，1 增值服务交易
        [NameInMap("goods_type")]
        [Validation(Required=false)]
        public long? GoodsType { get; set; }

        // 增值服务交易绑定的ip授权交易订单，增值服务交易必填
        [NameInMap("related_order_id")]
        [Validation(Required=false)]
        public string RelatedOrderId { get; set; }

        // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
        [NameInMap("pay_return_url")]
        [Validation(Required=false)]
        public string PayReturnUrl { get; set; }

    }

}
