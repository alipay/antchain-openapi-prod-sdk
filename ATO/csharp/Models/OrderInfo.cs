// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 主订单信息
    public class OrderInfo : TeaModel {
        // 订单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>SH20241017184159846222</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-17 18:41:59.000</para>
        /// </summary>
        [NameInMap("order_create_time")]
        [Validation(Required=false)]
        public string OrderCreateTime { get; set; }

        // 订单支付时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-17 18:41:59.000</para>
        /// </summary>
        [NameInMap("order_pay_time")]
        [Validation(Required=false)]
        public string OrderPayTime { get; set; }

        // 租金总额(分)
        /// <summary>
        /// <b>Example:</b>
        /// <para>3500</para>
        /// </summary>
        [NameInMap("total_rent_money")]
        [Validation(Required=false)]
        public long? TotalRentMoney { get; set; }

        // 租期
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("rent_term")]
        [Validation(Required=false)]
        public long? RentTerm { get; set; }

        // 租期单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>MONTH</para>
        /// </summary>
        [NameInMap("rent_unit")]
        [Validation(Required=false)]
        public string RentUnit { get; set; }

        // 订单状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>OPEN</para>
        /// </summary>
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

        // 订单子状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ORDER_FULFILLMENT</para>
        /// </summary>
        [NameInMap("order_sub_status")]
        [Validation(Required=false)]
        public string OrderSubStatus { get; set; }

        // 免押金额（分）
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("deposit_price")]
        [Validation(Required=false)]
        public long? DepositPrice { get; set; }

        // 到期买断价(分)
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("buy_out_price")]
        [Validation(Required=false)]
        public long? BuyOutPrice { get; set; }

        // 物流方案
        /// <summary>
        /// <b>Example:</b>
        /// <para>POST</para>
        /// </summary>
        [NameInMap("logistic_type")]
        [Validation(Required=false)]
        public string LogisticType { get; set; }

        // 到期形式
        // NA(0, "无意义"),
        // BUYOUT(1, "到期买断或归还"),
        // FREE_ON_RENT(2, "租满即送"),
        // RENEW_LEASE(3, "续租"),;
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("due_mode")]
        [Validation(Required=false)]
        public long? DueMode { get; set; }

        // 首付款金额(分)
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("down_payment")]
        [Validation(Required=false)]
        public long? DownPayment { get; set; }

        // 商户统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91301010101010101A</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx有限公司</para>
        /// </summary>
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 订单开始履约期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("divide_start_term_index")]
        [Validation(Required=false)]
        public long? DivideStartTermIndex { get; set; }

        // 订单关联的营销id
        /// <summary>
        /// <b>Example:</b>
        /// <para>Promoionxxxxx</para>
        /// </summary>
        [NameInMap("promotion_id")]
        [Validation(Required=false)]
        public string PromotionId { get; set; }

        // 融资类型
        // SUPPLY_CHAIN_FINANCE
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUPPLY_CHAIN_FINANCE</para>
        /// </summary>
        [NameInMap("fund_mode")]
        [Validation(Required=false)]
        public string FundMode { get; set; }

        // 订单支付渠道
        // ALIPAY
        // JDPAY
        /// <summary>
        /// <b>Example:</b>
        /// <para>ALIPAY</para>
        /// </summary>
        [NameInMap("pay_channel")]
        [Validation(Required=false)]
        public string PayChannel { get; set; }

        // 是否允许拒绝放款
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_allow_reject_loan")]
        [Validation(Required=false)]
        public bool? IsAllowRejectLoan { get; set; }

        // 是否新融资模式订单
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_new_f")]
        [Validation(Required=false)]
        public bool? IsNewF { get; set; }

    }

}
