// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 授权信息
    public class Authorization : TeaModel {
        // 授权内容的类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 要获取的授权字段
        [NameInMap("fields")]
        [Validation(Required=true)]
        public List<string> Fields { get; set; }

        // 签名时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
