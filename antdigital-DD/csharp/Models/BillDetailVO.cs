// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 详单VO
    public class BillDetailVO : TeaModel {
        // 主键Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 账单Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>aa</para>
        /// </summary>
        [NameInMap("charge_bill_id")]
        [Validation(Required=false)]
        public string ChargeBillId { get; set; }

        // 合约号
        /// <summary>
        /// <b>Example:</b>
        /// <para>aa</para>
        /// </summary>
        [NameInMap("ar_no")]
        [Validation(Required=false)]
        public string ArNo { get; set; }

        // 资源名称@ResourceNameEnum 
        /// <summary>
        /// <b>Example:</b>
        /// <para>名称</para>
        /// </summary>
        [NameInMap("prod_code")]
        [Validation(Required=false)]
        public string ProdCode { get; set; }

        // 云产品收费事件码
        /// <summary>
        /// <b>Example:</b>
        /// <para>aa</para>
        /// </summary>
        [NameInMap("prod_event_code")]
        [Validation(Required=false)]
        public string ProdEventCode { get; set; }

        // 实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>aa</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 账单金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=false)]
        public MultiCurrencyMoney Amount { get; set; }

        // 高精度金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("high_precision_amount")]
        [Validation(Required=false)]
        public string HighPrecisionAmount { get; set; }

        // 优惠金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("discount_fee")]
        [Validation(Required=false)]
        public MultiCurrencyMoney DiscountFee { get; set; }

        // 高精度优惠金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("high_precision_discount_fee")]
        [Validation(Required=false)]
        public string HighPrecisionDiscountFee { get; set; }

        // 流量包抵扣量
        [NameInMap("flow_pack_deducted")]
        [Validation(Required=false)]
        public long? FlowPackDeducted { get; set; }

        // 流量包抵扣详情
        [NameInMap("flow_pack_deduct_detail")]
        [Validation(Required=false)]
        public List<ResourcePackageDeductDetailVO> FlowPackDeductDetail { get; set; }

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

        // 计费项
        [NameInMap("fee_items")]
        [Validation(Required=false)]
        public List<ChargeItemVO> FeeItems { get; set; }

        // 约束项
        [NameInMap("constraint_items")]
        [Validation(Required=false)]
        public List<ChargeItemVO> ConstraintItems { get; set; }

        // This property corresponds to db column <tt>extend_info</tt>.
        /// <summary>
        /// <b>Example:</b>
        /// <para>JSON</para>
        /// </summary>
        [NameInMap("extend_info")]
        [Validation(Required=false)]
        public string ExtendInfo { get; set; }

    }

}
