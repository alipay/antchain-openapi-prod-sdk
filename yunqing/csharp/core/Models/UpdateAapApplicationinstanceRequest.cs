// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class UpdateAapApplicationinstanceRequest : TeaModel {
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

        // 应用实例
        [NameInMap("application_instance")]
        [Validation(Required=true)]
        public ApplicationInstance ApplicationInstance { get; set; }

    }

}
