// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    public class DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目id，项目资产ID和
        // 项目合约地址+所在链组合 二选一
        [NameInMap("asset_project_id")]
        [Validation(Required=false)]
        public string AssetProjectId { get; set; }

        // 资产项目合约地址，项目资产ID和
        // 项目合约地址+所在链组合 二选一
        [NameInMap("asset_project_address")]
        [Validation(Required=false)]
        public string AssetProjectAddress { get; set; }

        // 所在链，项目资产ID和
        // 项目合约地址+所在链组合 二选一
        [NameInMap("chain_name")]
        [Validation(Required=false)]
        public string ChainName { get; set; }

    }

}
