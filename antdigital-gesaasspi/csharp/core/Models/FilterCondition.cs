// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    // 过滤条件
    public class FilterCondition : TeaModel {
        // 过滤列
        [NameInMap("filter_column")]
        [Validation(Required=true)]
        public string FilterColumn { get; set; }

        // 过滤方式
        [NameInMap("filter_type")]
        [Validation(Required=false)]
        public string FilterType { get; set; }

        // 值列表
        [NameInMap("value_list")]
        [Validation(Required=true)]
        public List<string> ValueList { get; set; }

    }

}
