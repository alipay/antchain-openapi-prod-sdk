// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ff57c3b0e36d40419ee97697bacb6c79.Models
{
    // 属性
    public class AuthProperty : TeaModel {
        // 地区
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // {"山西","广东"}
        [NameInMap("value")]
        [Validation(Required=true)]
        public List<string> Value { get; set; }

    }

}
