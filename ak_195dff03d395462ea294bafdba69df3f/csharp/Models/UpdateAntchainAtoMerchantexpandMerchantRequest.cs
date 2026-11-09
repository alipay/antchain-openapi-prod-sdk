// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class UpdateAntchainAtoMerchantexpandMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 公司信息
        [NameInMap("company_info")]
        [Validation(Required=true)]
        public CompanyInfoUpdate CompanyInfo { get; set; }

        // 法人信息
        [NameInMap("legal_info")]
        [Validation(Required=true)]
        public LegalInfoUpdate LegalInfo { get; set; }

        // 应用信息
        [NameInMap("application_info")]
        [Validation(Required=true)]
        public ApplicationInfoUpdate ApplicationInfo { get; set; }

        // 进件流水号
        [NameInMap("pay_expand_id")]
        [Validation(Required=true)]
        public string PayExpandId { get; set; }

        // 社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

    }

}
