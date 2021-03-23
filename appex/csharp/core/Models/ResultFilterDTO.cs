// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 结果返回过滤
    public class ResultFilterDTO : TeaModel {
        // 过滤器名称
        [NameInMap("filter_name")]
        [Validation(Required=true)]
        public string FilterName { get; set; }

        // 要返回的字段路径列表
        [NameInMap("path_list")]
        [Validation(Required=true)]
        public List<string> PathList { get; set; }

    }

}
