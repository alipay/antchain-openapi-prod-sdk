// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_IOT.Models
{
    // 收集数据返回的上链结果
    public class SendCollectorResult : TeaModel {
        // 数据内容content的上链交易哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
