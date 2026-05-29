// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    public class ImportTwiceThreeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 超时间
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public string Timeout { get; set; }

        // 结构体A
        [NameInMap("struct_a")]
        [Validation(Required=false)]
        public TestParamA StructA { get; set; }

        // 结构体B
        [NameInMap("struct_b")]
        [Validation(Required=false)]
        public TestParamB StructB { get; set; }

    }

}
