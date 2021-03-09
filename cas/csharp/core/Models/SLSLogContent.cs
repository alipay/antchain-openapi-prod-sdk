// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 阿里云日志服务(SLS) - 日志内容，是一个键值对
    public class SLSLogContent : TeaModel {
        // 键名
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 键值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
