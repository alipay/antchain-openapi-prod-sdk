// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class SetAapImagesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用镜像，默认使用amd64
        [NameInMap("images")]
        [Validation(Required=true)]
        public ApplicationImage Images { get; set; }

        // namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // siteCode
        [NameInMap("site_code")]
        [Validation(Required=true)]
        public string SiteCode { get; set; }

        // 产品code
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 产品实例名称
        [NameInMap("product_instance_name")]
        [Validation(Required=true)]
        public string ProductInstanceName { get; set; }

        // 应用code
        [NameInMap("app_code")]
        [Validation(Required=true)]
        public string AppCode { get; set; }

    }

}
