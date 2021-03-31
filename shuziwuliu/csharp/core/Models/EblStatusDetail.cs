// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 电子提单变更状态明细
    public class EblStatusDetail : TeaModel {
        // 当前提单状态
        [NameInMap("current_ebl_status")]
        [Validation(Required=true)]
        public string CurrentEblStatus { get; set; }

        // 电子提单编号
        [NameInMap("ebl_no")]
        [Validation(Required=true)]
        public string EblNo { get; set; }

        // 下一个提单状态
        [NameInMap("next_ebl_status")]
        [Validation(Required=true)]
        public string NextEblStatus { get; set; }

    }

}
