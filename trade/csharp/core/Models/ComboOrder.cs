// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 套餐订单结构
    public class ComboOrder : TeaModel {
        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务流水号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 套餐订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 套餐编码
        [NameInMap("combo_code")]
        [Validation(Required=true)]
        public string ComboCode { get; set; }

        // 套餐名称，下单时的套餐名称
        [NameInMap("combo_name")]
        [Validation(Required=true)]
        public string ComboName { get; set; }

        // 订单状态，CREATED：创建；CANCEL：取消；PAYING：支付中；PAID：支付完成
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 履约生产状态，INCOMPLETE:未完成、COMPLETED:完成
        [NameInMap("provision_status")]
        [Validation(Required=true)]
        public string ProvisionStatus { get; set; }

        // 订单原始金额
        [NameInMap("original_amount")]
        [Validation(Required=true)]
        public string OriginalAmount { get; set; }

        // 折扣金额
        [NameInMap("discount_amount")]
        [Validation(Required=true)]
        public string DiscountAmount { get; set; }

        // 优惠金额
        [NameInMap("coupon_amount")]
        [Validation(Required=true)]
        public string CouponAmount { get; set; }

        // 实付金额
        [NameInMap("pay_amount")]
        [Validation(Required=true)]
        public string PayAmount { get; set; }

        // 下单时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 套餐内商品订单列表
        [NameInMap("commodity_orders")]
        [Validation(Required=true)]
        public List<ComboCommodityOrder> CommodityOrders { get; set; }

        // 支付完成时间
        [NameInMap("pay_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PayTime { get; set; }

        // 支付渠道
        [NameInMap("pay_channel")]
        [Validation(Required=true)]
        public string PayChannel { get; set; }

    }

}
