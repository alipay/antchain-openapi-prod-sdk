// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitKnowledgeBaseinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 品牌名称
        [NameInMap("brand_name_snapshot")]
        [Validation(Required=true)]
        public string BrandNameSnapshot { get; set; }

        // 商家电话
        [NameInMap("merchant_phone_snapshot")]
        [Validation(Required=true)]
        public string MerchantPhoneSnapshot { get; set; }

        // 商家app链接
        [NameInMap("merchant_app_link_snapshot")]
        [Validation(Required=false)]
        public string MerchantAppLinkSnapshot { get; set; }

        // 是否存在logo
        [NameInMap("has_logo")]
        [Validation(Required=true)]
        public bool? HasLogo { get; set; }

        // 商家链接
        [NameInMap("file_info")]
        [Validation(Required=false)]
        public FileInfo FileInfo { get; set; }

    }

}
