// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // AccessKey
    public class AccessKey : TeaModel {
        // AccessKey创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // AccessKey唯一标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
        [NameInMap("secret")]
        [Validation(Required=false)]
        public string Secret { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // AccessKey最近一次修改时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
