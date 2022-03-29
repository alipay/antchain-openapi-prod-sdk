// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api
    public class ApiPair : TeaModel {
        // api名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // api版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
