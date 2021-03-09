// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 云服务器规格族
    public class ComputerTypeFamily : TeaModel {
        // computer type family id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 实例规格族所属代数。
        [NameInMap("generation")]
        [Validation(Required=true)]
        public string Generation { get; set; }

    }

}
