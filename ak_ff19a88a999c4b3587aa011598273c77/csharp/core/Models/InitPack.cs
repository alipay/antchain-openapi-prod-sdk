// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ff19a88a999c4b3587aa011598273c77.Models
{
    // init接口响应结果，map类型
    public class InitPack : TeaModel {
        // 返回接收到请求的当前时间
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 请求编号
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
