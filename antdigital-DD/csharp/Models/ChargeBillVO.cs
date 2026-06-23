// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计费详单VO
    public class ChargeBillVO : TeaModel {
        // 主键Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 租户Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2333</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 合约号
        /// <summary>
        /// <b>Example:</b>
        /// <para>dasd</para>
        /// </summary>
        [NameInMap("ar_no")]
        [Validation(Required=false)]
        public string ArNo { get; set; }

        // 资源名称@ProductEnum
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源名称</para>
        /// </summary>
        [NameInMap("prod_code")]
        [Validation(Required=false)]
        public string ProdCode { get; set; }

        // 云产品收费事件码
        /// <summary>
        /// <b>Example:</b>
        /// <para>adqd</para>
        /// </summary>
        [NameInMap("prod_event_code")]
        [Validation(Required=false)]
        public string ProdEventCode { get; set; }

        // 实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>eqw</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 账单计费状态@ChargeBillStatusEnum
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 账单金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=false)]
        public MultiCurrencyMoney Amount { get; set; }

        // 优惠金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("discount_fee")]
        [Validation(Required=false)]
        public MultiCurrencyMoney DiscountFee { get; set; }

        // 高精度金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("high_precision_amount")]
        [Validation(Required=false)]
        public string HighPrecisionAmount { get; set; }

        // 高精度活动金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("high_precision_discount_fee")]
        [Validation(Required=false)]
        public string HighPrecisionDiscountFee { get; set; }

        // 优惠券抵扣金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("coupon_settle_amount")]
        [Validation(Required=false)]
        public MultiCurrencyMoney CouponSettleAmount { get; set; }

        // 高精度优惠券抵扣金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("high_precision_coupon_settle_amount")]
        [Validation(Required=false)]
        public string HighPrecisionCouponSettleAmount { get; set; }

        // 优惠券id
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("coupon_id")]
        [Validation(Required=false)]
        public string CouponId { get; set; }

        // 应付金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("require_amount")]
        [Validation(Required=false)]
        public MultiCurrencyMoney RequireAmount { get; set; }

        // 高精度应付金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("high_precision_require_amount")]
        [Validation(Required=false)]
        public string HighPrecisionRequireAmount { get; set; }

        // 账单对应的使用时间区间的开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_fee_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtFeeStartTime { get; set; }

        // 账单对应的使用时间区间的结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_fee_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtFeeEndTime { get; set; }

        // This property corresponds to db column <tt>extend_info</tt>.
        /// <summary>
        /// <b>Example:</b>
        /// <para>JSON</para>
        /// </summary>
        [NameInMap("extend_info")]
        [Validation(Required=false)]
        public string ExtendInfo { get; set; }

        // 是否有流量包抵扣
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_flow_pack_deducted")]
        [Validation(Required=false)]
        public bool? IsFlowPackDeducted { get; set; }

    }

}
