// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    // 内容安全查询接口返回结构
    public class ContentQueryResultModel : TeaModel {
        // 返回结果码
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 返回错误码
        [NameInMap("err_msg")]
        [Validation(Required=false)]
        public string ErrMsg { get; set; }

        // 返回结果
        [NameInMap("model")]
        [Validation(Required=false)]
        public SecurityRiskContentResultGetResponse Model { get; set; }

    }

}
