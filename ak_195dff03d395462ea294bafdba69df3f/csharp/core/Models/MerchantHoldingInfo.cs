// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 商户控股信息（京东商户进件）
    public class MerchantHoldingInfo : TeaModel {
        // 控股类型名称
        // 企业股东:ENTERPRISE_SHAREHOLDER
        // 个人股东:PERSONAL_SHAREHOLDER
        [NameInMap("holding_type_name")]
        [Validation(Required=true)]
        public string HoldingTypeName { get; set; }

        // 控股公司名称
        [NameInMap("holding_company")]
        [Validation(Required=true)]
        public string HoldingCompany { get; set; }

        // 证件号码
        [NameInMap("certificate_number")]
        [Validation(Required=true)]
        public string CertificateNumber { get; set; }

        // 证件是否长期有效
        // 长期true，
        // 否则false
        [NameInMap("long_date")]
        [Validation(Required=true)]
        public bool? LongDate { get; set; }

        // 失效时间
        // 商户控股信息longdate为true 时，可为空 ，格式YYYY-MM-DD
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

    }

}
