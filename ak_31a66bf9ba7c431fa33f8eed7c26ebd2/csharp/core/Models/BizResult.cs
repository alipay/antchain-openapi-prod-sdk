// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_31a66bf9ba7c431fa33f8eed7c26ebd2.Models
{
    // 通用业务返回
    public class BizResult : TeaModel {
        // 是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 是否重试
        [NameInMap("need_retry")]
        [Validation(Required=true)]
        public bool? NeedRetry { get; set; }

        // 失败错误信息
        [NameInMap("error_view_msg")]
        [Validation(Required=false)]
        public string ErrorViewMsg { get; set; }

        // 成功返回信息，与function相匹配
        [NameInMap("encoded_result_obj")]
        [Validation(Required=false)]
        public string EncodedResultObj { get; set; }

    }

}
