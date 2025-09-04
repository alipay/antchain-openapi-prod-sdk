// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class ListDistributorCrossaccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产项目ID
        [NameInMap("asset_project_id")]
        [Validation(Required=false)]
        public string AssetProjectId { get; set; }

        // 资产项目合约地址
        [NameInMap("asset_project_address")]
        [Validation(Required=false)]
        public string AssetProjectAddress { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 本侧链用户地址
        [NameInMap("user_address")]
        [Validation(Required=false)]
        public string UserAddress { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 登录名类型(EMAIL)
        [NameInMap("login_account_type")]
        [Validation(Required=false)]
        public string LoginAccountType { get; set; }

        // 对侧链用户地址
        [NameInMap("cross_chain_user_address")]
        [Validation(Required=false)]
        public string CrossChainUserAddress { get; set; }

        // 开始时间 (时间戳)
        [NameInMap("start_time_mills")]
        [Validation(Required=true)]
        public long? StartTimeMills { get; set; }

        // 结束时间 (时间戳)
        [NameInMap("end_time_mills")]
        [Validation(Required=true)]
        public long? EndTimeMills { get; set; }

    }

}
