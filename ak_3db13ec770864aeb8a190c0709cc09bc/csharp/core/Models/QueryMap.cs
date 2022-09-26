// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_3db13ec770864aeb8a190c0709cc09bc.Models
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
