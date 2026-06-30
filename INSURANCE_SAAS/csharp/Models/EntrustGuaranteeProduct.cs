// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    // 委托险种信息
    public class EntrustGuaranteeProduct : TeaModel {
        // 保障失效时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1733711492119</para>
        /// </summary>
        [NameInMap("guarantee_expiry_date")]
        [Validation(Required=true)]
        public long? GuaranteeExpiryDate { get; set; }

        // 保障生效时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1733711492119</para>
        /// </summary>
        [NameInMap("guarantee_effective_date")]
        [Validation(Required=true)]
        public long? GuaranteeEffectiveDate { get; set; }

        // 保险等待期结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1733711492119</para>
        /// </summary>
        [NameInMap("waiting_period_dead_line")]
        [Validation(Required=false)]
        public long? WaitingPeriodDeadLine { get; set; }

        // 保单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 平台定义产品码值
        /// <summary>
        /// <b>Example:</b>
        /// <para>平台定义产品码值</para>
        /// </summary>
        [NameInMap("guarantee_product_code")]
        [Validation(Required=false)]
        public string GuaranteeProductCode { get; set; }

        // 保险公司的产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>保险公司的产品code</para>
        /// </summary>
        [NameInMap("insurance_product_code")]
        [Validation(Required=false)]
        public string InsuranceProductCode { get; set; }

        // 保险公司的产品描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>保险公司的产品描述</para>
        /// </summary>
        [NameInMap("insurance_product_name")]
        [Validation(Required=false)]
        public string InsuranceProductName { get; set; }

    }

}
