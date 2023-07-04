// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class DeployAapProductinstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 站点code
        [NameInMap("site_code")]
        [Validation(Required=true)]
        public string SiteCode { get; set; }

        // 产品部署参数
        [NameInMap("product_deploy_init_options")]
        [Validation(Required=true)]
        public List<ProductDeployInitOption> ProductDeployInitOptions { get; set; }

    }

}
