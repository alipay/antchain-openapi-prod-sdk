// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 批量查询商户下已映射的账户信息接口，返回的对象
    public class QueryMappingBatchResult : TeaModel {
        // 本次查询获取的账户信息
        [NameInMap("accounts")]
        [Validation(Required=true)]
        public List<AccountMappingInfo> Accounts { get; set; }

        // 该商户下总共映射账户的数量
        [NameInMap("total_num")]
        [Validation(Required=true)]
        public long? TotalNum { get; set; }

        // 该商户下账户信息的总页数
        [NameInMap("total_page")]
        [Validation(Required=true)]
        public long? TotalPage { get; set; }

    }

}
