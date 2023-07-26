// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约列表响应
    public class PageRespContractListResp : TeaModel {
        // 总数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 列表数据
        [NameInMap("data_list")]
        [Validation(Required=false)]
        public List<ContractListResp> DataList { get; set; }

    }

}
