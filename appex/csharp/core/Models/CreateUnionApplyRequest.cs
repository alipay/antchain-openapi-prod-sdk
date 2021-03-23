// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class CreateUnionApplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 协作联盟名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 联盟描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

    }

}
