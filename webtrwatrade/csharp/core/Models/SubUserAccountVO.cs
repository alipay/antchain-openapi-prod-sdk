// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 二级用户
    public class SubUserAccountVO : TeaModel {
        // 用户账户id
        [NameInMap("user_account_id")]
        [Validation(Required=true)]
        public string UserAccountId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户地址
        [NameInMap("user_address")]
        [Validation(Required=true)]
        public string UserAddress { get; set; }

        // 用户资产配额
        [NameInMap("user_target")]
        [Validation(Required=true)]
        public string UserTarget { get; set; }

        // 用户资产
        [NameInMap("user_balance")]
        [Validation(Required=true)]
        public string UserBalance { get; set; }

        // 项目id
        [NameInMap("asset_project_id")]
        [Validation(Required=true)]
        public string AssetProjectId { get; set; }

        // 项目名称
        [NameInMap("asset_project_name")]
        [Validation(Required=true)]
        public string AssetProjectName { get; set; }

        // 用户所属机构id
        [NameInMap("institution_id")]
        [Validation(Required=true)]
        public string InstitutionId { get; set; }

        // 用户所属机构名称
        [NameInMap("institution_name")]
        [Validation(Required=true)]
        public string InstitutionName { get; set; }

    }

}
