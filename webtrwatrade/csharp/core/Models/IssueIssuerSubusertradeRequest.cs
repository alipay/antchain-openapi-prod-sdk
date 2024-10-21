// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class IssueIssuerSubusertradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 二级用户地址
        [NameInMap("sub_user_address")]
        [Validation(Required=true)]
        public string SubUserAddress { get; set; }

        // 二级用户账户ID
        [NameInMap("sub_user_account_id")]
        [Validation(Required=true)]
        public string SubUserAccountId { get; set; }

        // 发行数量
        [NameInMap("issue_amount")]
        [Validation(Required=true)]
        public string IssueAmount { get; set; }

        // 资产项目ID
        [NameInMap("asset_project_id")]
        [Validation(Required=true)]
        public string AssetProjectId { get; set; }

        // 资产项目链上合约地址
        [NameInMap("asset_project_address")]
        [Validation(Required=false)]
        public string AssetProjectAddress { get; set; }

    }

}
