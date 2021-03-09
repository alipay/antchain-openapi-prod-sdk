// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    // 访问IaaS层的身份
    public class Accessor : TeaModel {
        // Accessor关联的AccessKey
        [NameInMap("access_key")]
        [Validation(Required=false)]
        public string AccessKey { get; set; }

        // Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
        [NameInMap("access_secret")]
        [Validation(Required=false)]
        public string AccessSecret { get; set; }

        // AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // AccessKey创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // Accessor唯一标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // Accessor类型(RAM/ACCOUNT)
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
