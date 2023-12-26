// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 应用授权列表查询
    public class ApplicationPageResp : TeaModel {
        // 应用授权列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ApplicationPageListResp> List { get; set; }

        // 总数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
