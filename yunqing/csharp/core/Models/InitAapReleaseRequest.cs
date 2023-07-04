// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class InitAapReleaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要升级的产品实例
        [NameInMap("product_deploy_init_option_request")]
        [Validation(Required=true)]
        public ProductDeployInitOptionRequest ProductDeployInitOptionRequest { get; set; }

        // 站点code
        [NameInMap("site_code")]
        [Validation(Required=false)]
        public string SiteCode { get; set; }

    }

}
