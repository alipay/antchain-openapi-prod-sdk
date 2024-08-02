// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 批处理结果
    public class BatchResult : TeaModel {
        // 业务号
        [NameInMap("biz_no")]
        [Validation(Required=true, MaxLength=64)]
        public string BizNo { get; set; }

        // 业务号类型
        [NameInMap("biz_no_type")]
        [Validation(Required=true, MaxLength=32)]
        public string BizNoType { get; set; }

        // 结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

    }

}
