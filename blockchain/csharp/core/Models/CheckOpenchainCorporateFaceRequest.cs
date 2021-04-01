// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CheckOpenchainCorporateFaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业名称
        [NameInMap("ep_cert_name")]
        [Validation(Required=true)]
        public string EpCertName { get; set; }

        // 企业证件
        [NameInMap("ep_cert_no")]
        [Validation(Required=true)]
        public string EpCertNo { get; set; }

        // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
        [NameInMap("ep_cert_type")]
        [Validation(Required=true)]
        public string EpCertType { get; set; }

        // 企业法人名称
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=true)]
        public string LegalPersonCertName { get; set; }

        // 法人身份证号
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=true)]
        public string LegalPersonCertNo { get; set; }

        // 商户code
        [NameInMap("merchant_code")]
        [Validation(Required=true)]
        public string MerchantCode { get; set; }

        // 店铺描述
        [NameInMap("shop_desc")]
        [Validation(Required=false)]
        public string ShopDesc { get; set; }

        // 店铺图片地址
        [NameInMap("shop_sit_image")]
        [Validation(Required=false)]
        public string ShopSitImage { get; set; }

        // 店铺url地址
        [NameInMap("shop_web_url")]
        [Validation(Required=false)]
        public string ShopWebUrl { get; set; }

        // 租户code
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 网站id，为网站产品唯一标识
        [NameInMap("web_sit_id")]
        [Validation(Required=true)]
        public string WebSitId { get; set; }

        // 网站域名
        [NameInMap("web_sit_url")]
        [Validation(Required=true)]
        public string WebSitUrl { get; set; }

    }

}
