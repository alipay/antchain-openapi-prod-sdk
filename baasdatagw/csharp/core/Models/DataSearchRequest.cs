// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据实时检索搜索Request
    public class DataSearchRequest : TeaModel {
        // 所有请求字符串，支持使用 and, or 逻辑连接词和括号
        [NameInMap("query")]
        [Validation(Required=true)]
        public string Query { get; set; }

        // 分页，返回数据结果起始位置
        [NameInMap("offset")]
        [Validation(Required=false)]
        public long? Offset { get; set; }

        // 请求的结果数量，默认值 10
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

        // 是否按时间降序排列
        [NameInMap("reverse")]
        [Validation(Required=false)]
        public bool? Reverse { get; set; }

        // 检索数据的截止时间范围，Unix时间戳（秒）
        [NameInMap("to")]
        [Validation(Required=false)]
        public long? To { get; set; }

        // 检索结果的总条数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
