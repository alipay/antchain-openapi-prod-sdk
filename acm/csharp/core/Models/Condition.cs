// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    // 授权条件
    public class Condition : TeaModel {
        //  
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        //  
        [NameInMap("value")]
        [Validation(Required=false)]
        public List<string> Value { get; set; }

    }

}
