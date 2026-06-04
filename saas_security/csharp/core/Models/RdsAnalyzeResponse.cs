// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS_SECURITY.Models
{
    // 大安全接口返回值
    public class RdsAnalyzeResponse : TeaModel {
        // 请求是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 返回信息
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 返回数据
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
