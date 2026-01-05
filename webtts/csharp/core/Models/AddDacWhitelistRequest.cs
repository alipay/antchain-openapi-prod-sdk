// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    public class AddDacWhitelistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部客户id
        [NameInMap("external_cust_id")]
        [Validation(Required=true)]
        public string ExternalCustId { get; set; }

        // 外部客户名称
        [NameInMap("external_cust_name")]
        [Validation(Required=true)]
        public string ExternalCustName { get; set; }

        // 白名单地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 区块链网络列表
        [NameInMap("blockchain_list")]
        [Validation(Required=true)]
        public List<string> BlockchainList { get; set; }

    }

}
