// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    public class QuerySaasInstRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // json请求参数
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

        // 版本号
        [NameInMap("service_version")]
        [Validation(Required=true)]
        public string ServiceVersion { get; set; }

    }

}
