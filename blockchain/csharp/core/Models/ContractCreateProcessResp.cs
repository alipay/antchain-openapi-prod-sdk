// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 实例进度
    public class ContractCreateProcessResp : TeaModel {
        // 当前进度信息
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 合约部署进度
        [NameInMap("progress_info_list")]
        [Validation(Required=false)]
        public List<InstanceProgressInfo> ProgressInfoList { get; set; }

    }

}
