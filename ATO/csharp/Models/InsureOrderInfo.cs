// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 保单信息
    public class InsureOrderInfo : TeaModel {
        // 商家订单ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>F20240531174508229522</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 投保编号（承保id）
        /// <summary>
        /// <b>Example:</b>
        /// <para>T20240531174508229522</para>
        /// </summary>
        [NameInMap("insure_id")]
        [Validation(Required=false)]
        public string InsureId { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>华为meta60</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 保险开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-09-24 20:04:35</para>
        /// </summary>
        [NameInMap("insure_start_time")]
        [Validation(Required=false)]
        public string InsureStartTime { get; set; }

        // 保险终止时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-09-24 20:04:35</para>
        /// </summary>
        [NameInMap("insure_end_time")]
        [Validation(Required=false)]
        public string InsureEndTime { get; set; }

        // 投保金额（保额），单位分 100代表1元
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("insure_amount")]
        [Validation(Required=false)]
        public long? InsureAmount { get; set; }

        // 投保费用（保费），单位分 100代表1元
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("insure_premium")]
        [Validation(Required=false)]
        public long? InsurePremium { get; set; }

        // 投保状态枚举
        /// <summary>
        /// <b>Example:</b>
        /// <para>INSURE_SUCC</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 电子保单下载链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://test-open.pingan.com.cn/Gateway/xxxxx/printGPForDMZ?ciphertext=$%7Bciphertext%7D&sign=$%7Bsign%7D">https://test-open.pingan.com.cn/Gateway/xxxxx/printGPForDMZ?ciphertext=${ciphertext}&amp;sign=${sign}</a></para>
        /// </summary>
        [NameInMap("policy_url")]
        [Validation(Required=false)]
        public string PolicyUrl { get; set; }

        // 验真码
        /// <summary>
        /// <b>Example:</b>
        /// <para>9u649pfJ76crNdRRVD</para>
        /// </summary>
        [NameInMap("validate_code")]
        [Validation(Required=false)]
        public string ValidateCode { get; set; }

    }

}
