// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 还款回调结果数据
    public class RepayCallBackResData : TeaModel {
        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public bool? Status { get; set; }

    }

}
