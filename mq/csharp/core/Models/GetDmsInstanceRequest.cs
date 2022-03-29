// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class GetDmsInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ddd
        [NameInMap("curr_tenant")]
        [Validation(Required=true)]
        public string CurrTenant { get; set; }

        // ss
        [NameInMap("curr_workspace")]
        [Validation(Required=true)]
        public string CurrWorkspace { get; set; }

    }

}
