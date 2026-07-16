// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 资产包履约计划分配明细
    public class AssetPackagePlanAllocateDetail : TeaModel {
        // 订单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 商户租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>HXDRFKOF</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 类型
        // PERFORMANCE 履约
        // ASSET_PACKAGE_EXCESS 资产包超额
        /// <summary>
        /// <b>Example:</b>
        /// <para>ASSET_PACKAGE_EXCESS</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 用户还款期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 用户还款时间yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-03-16</para>
        /// </summary>
        [NameInMap("pay_day")]
        [Validation(Required=false)]
        public string PayDay { get; set; }

        // 用户还款金额，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("pay_amount")]
        [Validation(Required=false)]
        public long? PayAmount { get; set; }

        // 分账比例(不存储实时计算)，保留两位小数，比例统一类型。
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("divide_ratio")]
        [Validation(Required=false)]
        public string DivideRatio { get; set; }

        // 商户履约分账金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("divide_amount")]
        [Validation(Required=false)]
        public long? DivideAmount { get; set; }

        // 分账状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS/FAILED</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 用户还款方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>BANK_TRANSFER/ALIPAY/WECHAT</para>
        /// </summary>
        [NameInMap("repay_method")]
        [Validation(Required=false)]
        public string RepayMethod { get; set; }

        // 流水单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>AUTH123456789</para>
        /// </summary>
        [NameInMap("transaction_no")]
        [Validation(Required=false)]
        public string TransactionNo { get; set; }

        // 资金到账状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS/FAILED/PENDING</para>
        /// </summary>
        [NameInMap("repayment_status")]
        [Validation(Required=false)]
        public string RepaymentStatus { get; set; }

        // 资金到账方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>BANK_TRANSFER/ONLINE_PAYMENT</para>
        /// </summary>
        [NameInMap("repayment_method")]
        [Validation(Required=false)]
        public string RepaymentMethod { get; set; }

        // 实际到账时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd HH:mm:ss</para>
        /// </summary>
        [NameInMap("repayment_time")]
        [Validation(Required=false)]
        public string RepaymentTime { get; set; }

    }

}
