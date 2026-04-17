// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 线索状态信息
    public class LeadInfo : TeaModel {
        // 线索信息
        [NameInMap("lead_id")]
        [Validation(Required=true)]
        public string LeadId { get; set; }

        // 状态值
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
