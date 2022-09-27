// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_b14fc97503f943f48147eb72b47b244d.Models
{
    // 查询功能所用集合
    public class QueryMap : TeaModel {
        // 查询枚举：QueryTypeEnum
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 查询参数
        [NameInMap("value")]
        [Validation(Required=false)]
        public List<NameValuePair> Value { get; set; }

    }

}
