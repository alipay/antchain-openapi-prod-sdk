// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class InitCjtestAcopmResRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 111
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public long? Timeout { get; set; }

        // 11111
        [NameInMap("msg")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Msg { get; set; }

        // 111
        [NameInMap("timeout111")]
        [Validation(Required=true)]
        public List<string> Timeout111 { get; set; }

        // 34134
        [NameInMap("msg1111")]
        [Validation(Required=true)]
        public AutoCodeModel Msg1111 { get; set; }

    }

}
