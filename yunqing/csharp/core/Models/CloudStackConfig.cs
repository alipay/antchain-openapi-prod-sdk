// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 底座配置
    public class CloudStackConfig : TeaModel {
        // 阿里云accessKey获取
        [NameInMap("access_key")]
        [Validation(Required=true)]
        public string AccessKey { get; set; }

        // 云游加密后的accessKeySecret
        [NameInMap("encrypted_access_key_secret")]
        [Validation(Required=true)]
        public string EncryptedAccessKeySecret { get; set; }

        // 底座所在的region
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 底座可用区
        [NameInMap("zone")]
        [Validation(Required=true)]
        public string Zone { get; set; }

        // 底座类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
