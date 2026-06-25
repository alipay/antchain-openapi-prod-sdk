// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    // 环节明细信息
    public class StepDetailInfo : TeaModel {
        // 环节编号
        [NameInMap("step_no")]
        [Validation(Required=true)]
        public string StepNo { get; set; }

        // 存证时的原始信息明文
        [NameInMap("meta_content")]
        [Validation(Required=true)]
        public string MetaContent { get; set; }

    }

}
