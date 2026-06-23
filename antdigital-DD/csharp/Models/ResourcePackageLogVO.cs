// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 资源包日志VO
    public class ResourcePackageLogVO : TeaModel {
        // 流水号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 资源包实例
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("resource_package_instance_id")]
        [Validation(Required=false)]
        public string ResourcePackageInstanceId { get; set; }

        // 资源包展示名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("resource_package_display_name")]
        [Validation(Required=false)]
        public string ResourcePackageDisplayName { get; set; }

        // 抵扣前容量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("capacity_before_deduct")]
        [Validation(Required=false)]
        public string CapacityBeforeDeduct { get; set; }

        // 抵扣前容量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("capacity_before_deduct_unit")]
        [Validation(Required=false)]
        public string CapacityBeforeDeductUnit { get; set; }

        // 抵扣后容量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("capacity_after_deduct")]
        [Validation(Required=false)]
        public string CapacityAfterDeduct { get; set; }

        // 抵扣后容量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("capacity_after_deduct_unit")]
        [Validation(Required=false)]
        public string CapacityAfterDeductUnit { get; set; }

        // 本次抵扣量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("deducted_amount")]
        [Validation(Required=false)]
        public string DeductedAmount { get; set; }

        // 本次抵扣量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("deducted_amount_unit")]
        [Validation(Required=false)]
        public string DeductedAmountUnit { get; set; }

        // 账单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("charge_bill_id")]
        [Validation(Required=false)]
        public string ChargeBillId { get; set; }

        // 详单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("bill_detail_id")]
        [Validation(Required=false)]
        public string BillDetailId { get; set; }

        // 被抵扣的产品名
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("deducted_product_name")]
        [Validation(Required=false)]
        public string DeductedProductName { get; set; }

        // 被抵扣实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("deducted_instance_id")]
        [Validation(Required=false)]
        public string DeductedInstanceId { get; set; }

        // 抵扣的字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("oms_field")]
        [Validation(Required=false)]
        public string OmsField { get; set; }

        // 抵扣发生时间
        [NameInMap("deduct_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeductTime { get; set; }

        // 类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 抵扣资金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("deducted_fund")]
        [Validation(Required=false)]
        public string DeductedFund { get; set; }

        // 剩余资金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("remain_fund")]
        [Validation(Required=false)]
        public string RemainFund { get; set; }

        // 抵扣发生时间
        [NameInMap("oms_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OmsStartTime { get; set; }

        // 抵扣发生时间
        [NameInMap("oms_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OmsEndTime { get; set; }

        // extendInfo
        /// <summary>
        /// <b>Example:</b>
        /// <para>JSON</para>
        /// </summary>
        [NameInMap("extend_info")]
        [Validation(Required=false)]
        public string ExtendInfo { get; set; }

    }

}
