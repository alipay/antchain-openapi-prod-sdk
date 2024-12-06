// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_f9cb6523d99f4d089e97d549f141e6e4.Models
{
    // 返回详情
    public class ReturnDetail : TeaModel {
        // 结果对象内容
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

        // 返回形式
        [NameInMap("return_type")]
        [Validation(Required=true)]
        public string ReturnType { get; set; }

        // 文件列表
        [NameInMap("file_urls")]
        [Validation(Required=true)]
        public List<string> FileUrls { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 加密模式
        [NameInMap("encrypt_model")]
        [Validation(Required=true)]
        public string EncryptModel { get; set; }

        // 密钥信封
        [NameInMap("secret_envelope")]
        [Validation(Required=true)]
        public string SecretEnvelope { get; set; }

    }

}
