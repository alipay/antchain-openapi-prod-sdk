// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 链路搜索页面的tags配置项
    public class TraceSpanSearchTagConfig : TeaModel {
        // 字段的key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 中文标签
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 是否支持多选
        [NameInMap("multiple")]
        [Validation(Required=false)]
        public bool? Multiple { get; set; }

        // 如果该数组非空, 那么表明用户只能从数组给定的值中进行选择, 否则意味着用户可以随意填写.
        [NameInMap("values")]
        [Validation(Required=false)]
        public List<string> Values { get; set; }

    }

}
