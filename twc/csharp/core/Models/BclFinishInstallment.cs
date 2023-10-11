// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 完结的分期信息
    public class BclFinishInstallment : TeaModel {
        // 期次号
        [NameInMap("term_no")]
        [Validation(Required=true)]
        public long? TermNo { get; set; }

    }

}
