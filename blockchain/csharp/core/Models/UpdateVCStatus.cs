// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 更新VC状态数据结构
    public class UpdateVCStatus : TeaModel {
        // valid or invalid
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 可验证声明id
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

    }

}
