// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    public class StartTestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // TestApi入参
        [NameInMap("data")]
        [Validation(Required=true)]
        public TestStruct Data { get; set; }

        // 额外字段
        [NameInMap("extra")]
        [Validation(Required=false)]
        public string Extra { get; set; }

    }

}
