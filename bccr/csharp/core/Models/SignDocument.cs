// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 公证出证需要用户签署的文件
    public class SignDocument : TeaModel {
        // 签署文件
        [NameInMap("sign_file")]
        [Validation(Required=true)]
        public string SignFile { get; set; }

        // 到期时间戳
        [NameInMap("expire_time")]
        [Validation(Required=true)]
        public long? ExpireTime { get; set; }

        // 签署文件名
        [NameInMap("sign_file_name")]
        [Validation(Required=true)]
        public string SignFileName { get; set; }

        // 签署文件描述
        [NameInMap("sign_file_desc")]
        [Validation(Required=true)]
        public string SignFileDesc { get; set; }

        // 签署文件哈希
        [NameInMap("sign_file_hash")]
        [Validation(Required=true)]
        public string SignFileHash { get; set; }

        // 签署文件类型
        [NameInMap("sign_file_type")]
        [Validation(Required=true)]
        public string SignFileType { get; set; }

    }

}
