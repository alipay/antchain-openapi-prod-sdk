// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商户控股信息（京东商户进件）
    public class MerchantHoldingInfo : TeaModel {
        // 控股类型名称
        // 企业股东:ENTERPRISE_SHAREHOLDER
        // 个人股东:PERSONAL_SHAREHOLDER
        /// <summary>
        /// <b>Example:</b>
        /// <para>ENTERPRISE_SHAREHOLDER</para>
        /// </summary>
        [NameInMap("holding_type_name")]
        [Validation(Required=true)]
        public string HoldingTypeName { get; set; }

        // 控股公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx公司</para>
        /// </summary>
        [NameInMap("holding_company")]
        [Validation(Required=true)]
        public string HoldingCompany { get; set; }

        // 证件号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91301010101010101A</para>
        /// </summary>
        [NameInMap("certificate_number")]
        [Validation(Required=true)]
        public string CertificateNumber { get; set; }

        // 证件是否长期有效
        // 长期true，
        // 否则false
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("long_date")]
        [Validation(Required=true)]
        public bool? LongDate { get; set; }

        // 失效时间
        // 商户控股信息longdate为true 时，可为空 ，格式YYYY-MM-DD
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-10-10</para>
        /// </summary>
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

    }

}
