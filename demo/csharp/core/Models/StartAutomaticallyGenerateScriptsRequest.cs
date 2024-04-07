// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class StartAutomaticallyGenerateScriptsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 入参1
        [NameInMap("string_1")]
        [Validation(Required=true)]
        public string String1 { get; set; }

        // 1
        [NameInMap("number_1")]
        [Validation(Required=true)]
        public long? Number1 { get; set; }

        // boolean
        [NameInMap("boolean_1")]
        [Validation(Required=false)]
        public bool? Boolean1 { get; set; }

        // date
        [NameInMap("date_1")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Date1 { get; set; }

        // 1
        [NameInMap("array_1")]
        [Validation(Required=false)]
        public List<string> Array1 { get; set; }

        // struct
        [NameInMap("struct_1")]
        [Validation(Required=true)]
        public GroupAClass Struct1 { get; set; }

    }

}
