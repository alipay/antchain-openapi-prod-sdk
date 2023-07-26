// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 应用授权列表查询
    public class PageRespApplicationListResp : TeaModel {
        // 总数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 列表数据
        [NameInMap("data_list")]
        [Validation(Required=false)]
        public List<ApplicationListResp> DataList { get; set; }

    }

}
