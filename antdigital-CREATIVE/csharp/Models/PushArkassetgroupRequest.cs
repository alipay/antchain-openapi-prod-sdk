// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class PushArkassetgroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // {"Name":"demo-portrait-group","Description":"虚拟人像素材组示例","GroupType":"AIGC","ProjectName":"default"}
        [NameInMap("request_body")]
        [Validation(Required=true)]
        public string RequestBody { get; set; }

    }

}
