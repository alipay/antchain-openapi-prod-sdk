// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class TransferIssuerSubusertradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // from二级用户地址
        [NameInMap("from_sub_user_address")]
        [Validation(Required=true)]
        public string FromSubUserAddress { get; set; }

        // from二级用户账户ID
        [NameInMap("from_sub_user_account_id")]
        [Validation(Required=true)]
        public string FromSubUserAccountId { get; set; }

        // to二级用户地址
        [NameInMap("to_sub_user_address")]
        [Validation(Required=true)]
        public string ToSubUserAddress { get; set; }

        // to二级用户账户ID
        [NameInMap("to_sub_user_account_id")]
        [Validation(Required=false)]
        public string ToSubUserAccountId { get; set; }

        // 转移数量
        [NameInMap("transfer_amount")]
        [Validation(Required=true)]
        public string TransferAmount { get; set; }

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
