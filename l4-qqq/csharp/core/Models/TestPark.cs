// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QQQ.Models
{
    // 测试使用
    public class TestPark : TeaModel {
        // 请求时间
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 请求人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 请求编号
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
