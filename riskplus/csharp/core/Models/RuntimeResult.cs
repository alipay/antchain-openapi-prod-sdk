// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 上传文件运行结果
    public class RuntimeResult : TeaModel {
        // 上传成功
        [NameInMap("code")]
        [Validation(Required=true)]
        public long? Code { get; set; }

        // true代表上传成功，false代表上传失败
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 上文件传成功
        [NameInMap("resultmsg")]
        [Validation(Required=true)]
        public string Resultmsg { get; set; }

        // 文件上传结果
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
