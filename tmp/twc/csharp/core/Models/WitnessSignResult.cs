// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 见证流程签署结果数据
    public class WitnessSignResult : TeaModel {
        // 签名结果，外部用户签署返回
        [NameInMap("sign_result")]
        [Validation(Required=false)]
        public string SignResult { get; set; }

        // 签署日志id，外部用户签署返回
        [NameInMap("signlog_id")]
        [Validation(Required=false)]
        public string SignlogId { get; set; }

        // 第三方文档id
        [NameInMap("third_doc_id")]
        [Validation(Required=false)]
        public string ThirdDocId { get; set; }

    }

}
