// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 实例维度月账单
    public class InstanceMonthlyBillVO : TeaModel {
        // 金融云租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088101118131245</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 产品类别@ProductServiceEnum
        /// <summary>
        /// <b>Example:</b>
        /// <para>MONITOR</para>
        /// </summary>
        [NameInMap("product_category")]
        [Validation(Required=true)]
        public string ProductCategory { get; set; }

        // 产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 付费类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>AFTER_PAY</para>
        /// </summary>
        [NameInMap("charge_type")]
        [Validation(Required=true)]
        public string ChargeType { get; set; }

        // 实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ASXASDAZAZ</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 账单月份
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyyMM(202201)</para>
        /// </summary>
        [NameInMap("bill_month")]
        [Validation(Required=true)]
        public string BillMonth { get; set; }

        // 应收金额(不包含优惠券和折扣)
        [NameInMap("bill_amount")]
        [Validation(Required=false)]
        public MultiCurrencyMoney BillAmount { get; set; }

        // 优惠券抵扣金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>100.10</para>
        /// </summary>
        [NameInMap("coupon_amount")]
        [Validation(Required=true)]
        public MultiCurrencyMoney CouponAmount { get; set; }

        // 高精度优惠券金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.01</para>
        /// </summary>
        [NameInMap("high_precision_coupon_amount")]
        [Validation(Required=true)]
        public string HighPrecisionCouponAmount { get; set; }

        // 折扣金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11.01</para>
        /// </summary>
        [NameInMap("discount_amount")]
        [Validation(Required=true)]
        public MultiCurrencyMoney DiscountAmount { get; set; }

        // 高精度折扣金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.01</para>
        /// </summary>
        [NameInMap("high_precision_discount_amount")]
        [Validation(Required=true)]
        public string HighPrecisionDiscountAmount { get; set; }

        // 调账金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.01</para>
        /// </summary>
        [NameInMap("adjust_amount")]
        [Validation(Required=true)]
        public MultiCurrencyMoney AdjustAmount { get; set; }

        // 已收金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.01</para>
        /// </summary>
        [NameInMap("received_amount")]
        [Validation(Required=true)]
        public MultiCurrencyMoney ReceivedAmount { get; set; }

        // 账单应收日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("account_receivable_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AccountReceivableDate { get; set; }

        // 月账单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("instance_monthly_bill_id")]
        [Validation(Required=true)]
        public string InstanceMonthlyBillId { get; set; }

        // 支付渠道
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("pay_channel")]
        [Validation(Required=true)]
        public string PayChannel { get; set; }

        // 合同ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("contract_id")]
        [Validation(Required=true)]
        public string ContractId { get; set; }

        // map的json串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;test&quot;:&quot;tets&quot;}</para>
        /// </summary>
        [NameInMap("extend_info")]
        [Validation(Required=true)]
        public string ExtendInfo { get; set; }

        // 未结清金额
        [NameInMap("unsettled_amount")]
        [Validation(Required=true)]
        public MultiCurrencyMoney UnsettledAmount { get; set; }

        // 优惠金额
        [NameInMap("total_discount_amount")]
        [Validation(Required=true)]
        public MultiCurrencyMoney TotalDiscountAmount { get; set; }

    }

}
