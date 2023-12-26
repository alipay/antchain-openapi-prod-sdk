// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约服务列表查询
    public class ContracPageReq : TeaModel {
        // 合约服务类别
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 页码
        [NameInMap("num")]
        [Validation(Required=true)]
        public long? Num { get; set; }

        // 页大小
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

    }

}
