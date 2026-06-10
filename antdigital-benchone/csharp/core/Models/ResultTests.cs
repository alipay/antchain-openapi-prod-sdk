// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BENCHONE.Models
{
    // 返回结果测试类
    public class ResultTests : TeaModel {
        // 姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 年龄
        [NameInMap("age")]
        [Validation(Required=true)]
        public string Age { get; set; }

    }

}
