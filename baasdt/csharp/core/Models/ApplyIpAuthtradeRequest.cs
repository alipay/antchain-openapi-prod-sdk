// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ApplyIpAuthtradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 采购者的链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // IP授权交易时传入IP ID；增值服务交易时传入服务ID
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // 收费模式：0 销售抽佣, 1 按量付费
        [NameInMap("charge_type")]
        [Validation(Required=false)]
        public long? ChargeType { get; set; }

        // 授权计费比例
        [NameInMap("auth_rate")]
        [Validation(Required=false)]
        public string AuthRate { get; set; }

        // 按量付费的收费单价（按量付费模式必填）
        [NameInMap("auth_price")]
        [Validation(Required=false)]
        public string AuthPrice { get; set; }

        // 授权合作开始期限（毫秒时间戳）
        [NameInMap("auth_begin_time")]
        [Validation(Required=true)]
        public long? AuthBeginTime { get; set; }

        // 授权合作结束期限（毫秒时间戳）
        [NameInMap("auth_end_time")]
        [Validation(Required=true)]
        public long? AuthEndTime { get; set; }

        // 合同（文件URL）
        [NameInMap("contract")]
        [Validation(Required=false)]
        public string Contract { get; set; }

        // 设计稿（文件URL）
        [NameInMap("design_draft")]
        [Validation(Required=false)]
        public string DesignDraft { get; set; }

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

        // 备注消息(不超过256个字符)
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 附加条款
        [NameInMap("additional_clause")]
        [Validation(Required=false)]
        public string AdditionalClause { get; set; }

        // 是否有保底金
        [NameInMap("guaranteed")]
        [Validation(Required=true)]
        public bool? Guaranteed { get; set; }

        // 支付的保底金金额
        [NameInMap("guaranteed_fund")]
        [Validation(Required=false)]
        public string GuaranteedFund { get; set; }

        // 保底商品个数（按量付费），订单销售数量超过保底部分需按量付费
        [NameInMap("guaranteed_goods_amount")]
        [Validation(Required=false)]
        public long? GuaranteedGoodsAmount { get; set; }

        // 保底商品销售金额（销售抽佣），订单销售额超过保底部分需按比例抽拥
        [NameInMap("guaranteed_sales")]
        [Validation(Required=false)]
        public string GuaranteedSales { get; set; }

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

        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=false)]
        public string AuthType { get; set; }

    }

}
