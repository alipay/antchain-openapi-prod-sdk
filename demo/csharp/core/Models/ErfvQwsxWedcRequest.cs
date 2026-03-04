// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class ErfvQwsxWedcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // string_param
        [NameInMap("string_param")]
        [Validation(Required=true)]
        public string StringParam { get; set; }

        // struct_param
        [NameInMap("struct_param")]
        [Validation(Required=false)]
        public TestClass StructParam { get; set; }

    }

}
