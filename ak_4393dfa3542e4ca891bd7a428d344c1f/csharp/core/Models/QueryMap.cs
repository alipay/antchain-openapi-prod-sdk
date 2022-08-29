// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4393dfa3542e4ca891bd7a428d344c1f.Models
{
    // Map<String,Object> 集合
    public class QueryMap : TeaModel {
        // 键值
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 额外用户信息
        [NameInMap("value")]
        [Validation(Required=false)]
        public List<NameValuePair> Value { get; set; }

    }

}
