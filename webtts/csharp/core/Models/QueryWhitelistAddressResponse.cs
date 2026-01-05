// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    // 查询白名单详细信息响应体
    public class QueryWhitelistAddressResponse : TeaModel {
        // 白名单地址
        [NameInMap("whitelist_address")]
        [Validation(Required=true)]
        public string WhitelistAddress { get; set; }

        // 区块链列表信息
        [NameInMap("blockchain_list")]
        [Validation(Required=true)]
        public List<QueryBlockchainResponse> BlockchainList { get; set; }

    }

}
