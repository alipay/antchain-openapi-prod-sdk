// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFININSTCHANNEL.Models
{
    // 业务返回
    public class BizResult : TeaModel {
        // 是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // 是否重试
        [NameInMap("need_retry")]
        [Validation(Required=true)]
        public bool? NeedRetry { get; set; }

        // 错误描述
        [NameInMap("error_msg")]
        [Validation(Required=true)]
        public string ErrorMsg { get; set; }

        // 错误描述
        [NameInMap("error_view_msg")]
        [Validation(Required=true)]
        public string ErrorViewMsg { get; set; }

        // 成功返回信息
        [NameInMap("encoded_result_obj")]
        [Validation(Required=true)]
        public string EncodedResultObj { get; set; }

    }

}
