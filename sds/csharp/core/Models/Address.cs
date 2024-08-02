// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 地址，包含省、市、区(县)
    public class Address : TeaModel {
        // 市级
        [NameInMap("city")]
        [Validation(Required=true, MaxLength=6)]
        public string City { get; set; }

        // 区、县级
        [NameInMap("district")]
        [Validation(Required=false, MaxLength=6)]
        public string District { get; set; }

    }

}
