// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // MapKV
    public class MapEntry : TeaModel {
        // Key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 声明 value 的类型，包括 String / Double / Long / Bool / JSONObject / JSONArray
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
