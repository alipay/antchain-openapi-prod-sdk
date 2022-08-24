// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4cf7c7d0655047bb888b168fcceafb67.Models
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
