// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QQQ.Models
{
    // 初始
    public class InitPack : TeaModel {
        // 请求时间
        [NameInMap("time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Time { get; set; }

        // 请求人
        [NameInMap("operate")]
        [Validation(Required=true)]
        public string Operate { get; set; }

        // 编号
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
