// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TESTJZQ.Models
{
    public class ZzZZRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 1
        [NameInMap("qwer")]
        [Validation(Required=true)]
        public D Qwer { get; set; }

        // z
        [NameInMap("z")]
        [Validation(Required=true)]
        public string Z { get; set; }

    }

}
