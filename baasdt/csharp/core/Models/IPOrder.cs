// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP授权交易的订单信息
    public class IPOrder : TeaModel {
        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // 卖方
        [NameInMap("seller_id")]
        [Validation(Required=true)]
        public string SellerId { get; set; }

        // 卖家名称
        [NameInMap("seller_name")]
        [Validation(Required=true)]
        public string SellerName { get; set; }

        // 买方
        [NameInMap("buyer_id")]
        [Validation(Required=true)]
        public string BuyerId { get; set; }

        // 买家名称
        [NameInMap("buyer_name")]
        [Validation(Required=true)]
        public string BuyerName { get; set; }

        // 订单交易类型：0套餐交易，1授权交易
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // ip id
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // IP名称
        [NameInMap("ip_name")]
        [Validation(Required=true)]
        public string IpName { get; set; }

        // 渠道信息
        [NameInMap("channel_id")]
        [Validation(Required=true)]
        public string ChannelId { get; set; }

        // 套餐总量
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 套餐已使用数量
        [NameInMap("used_amount")]
        [Validation(Required=true)]
        public long? UsedAmount { get; set; }

        // 终端商品价格范围
        [NameInMap("price_range")]
        [Validation(Required=true)]
        public string PriceRange { get; set; }

        // 套餐交易总费用
        [NameInMap("total_price")]
        [Validation(Required=true)]
        public string TotalPrice { get; set; }

        // 授权佣金比例
        [NameInMap("auth_rate")]
        [Validation(Required=true)]
        public string AuthRate { get; set; }

        // 授权合作开始时间（毫秒时间戳）
        [NameInMap("auth_start_time")]
        [Validation(Required=true)]
        public long? AuthStartTime { get; set; }

        // 授权合作结束时间
        [NameInMap("auth_end_time")]
        [Validation(Required=true)]
        public long? AuthEndTime { get; set; }

        // 合同信息
        [NameInMap("contract")]
        [Validation(Required=true)]
        public string Contract { get; set; }

        // 设计稿信息
        [NameInMap("design_draft")]
        [Validation(Required=true)]
        public string DesignDraft { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 操作者名称
        [NameInMap("operator_name")]
        [Validation(Required=true)]
        public string OperatorName { get; set; }

        // 订单状态。TODO 补充枚举信息
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 订单创建时间，时间戳（毫秒）
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 订单最近更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

        // 收费模式：0 销售抽佣, 1 按量付费
        [NameInMap("charge_type")]
        [Validation(Required=true)]
        public long? ChargeType { get; set; }

        // 按量付费的收费单价（按量付费模式必填）
        [NameInMap("auth_price")]
        [Validation(Required=true)]
        public string AuthPrice { get; set; }

        // 是否有保底金
        [NameInMap("guaranteed")]
        [Validation(Required=true)]
        public bool? Guaranteed { get; set; }

        // 保底金金额
        [NameInMap("guaranteed_fund")]
        [Validation(Required=true)]
        public string GuaranteedFund { get; set; }

        // 保底商品个数（按量付费）
        [NameInMap("guaranteed_goods_amount")]
        [Validation(Required=true)]
        public long? GuaranteedGoodsAmount { get; set; }

        // 已使用的保底商品个数（按量付费），订单销售数量超过保底部分需按量付费
        [NameInMap("used_guaranteed_goods_amount")]
        [Validation(Required=true)]
        public long? UsedGuaranteedGoodsAmount { get; set; }

        // 保底商品销售金额（销售抽佣）
        [NameInMap("guaranteed_sales")]
        [Validation(Required=true)]
        public string GuaranteedSales { get; set; }

        // 已使用的保底商品销售金额（销售抽佣），订单销售额超过保底部分需按比例抽拥
        // 
        [NameInMap("used_guaranteed_sales")]
        [Validation(Required=true)]
        public string UsedGuaranteedSales { get; set; }

        // 授权产品范围
        [NameInMap("auth_product_scope")]
        [Validation(Required=true)]
        public string AuthProductScope { get; set; }

        // 授权地域范围
        [NameInMap("auth_area_scope")]
        [Validation(Required=true)]
        public string AuthAreaScope { get; set; }

        // 商品销售渠道
        [NameInMap("sales_channel")]
        [Validation(Required=true)]
        public string SalesChannel { get; set; }

        // 0 IP交易，1 增值服务交易
        [NameInMap("goods_type")]
        [Validation(Required=true)]
        public long? GoodsType { get; set; }

        // 增值服务交易绑定的ip授权交易订单
        [NameInMap("related_order_id")]
        [Validation(Required=true)]
        public string RelatedOrderId { get; set; }

        // 是否已监修报审
        [NameInMap("supervise_approve")]
        [Validation(Required=true)]
        public bool? SuperviseApprove { get; set; }

        // 订单图库信息，未确认则为空
        [NameInMap("ip_gallery_url")]
        [Validation(Required=false)]
        public string IpGalleryUrl { get; set; }

        // 图库版本
        [NameInMap("ip_gallery_version")]
        [Validation(Required=false)]
        public long? IpGalleryVersion { get; set; }

        // 商家是否已下载过本订单的图库
        [NameInMap("download_ip_gallery")]
        [Validation(Required=false)]
        public bool? DownloadIpGallery { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 附加条款
        [NameInMap("additional_clause")]
        [Validation(Required=false)]
        public string AdditionalClause { get; set; }

        // 合同文件列表
        [NameInMap("contract_files")]
        [Validation(Required=false)]
        public List<string> ContractFiles { get; set; }

    }

}
