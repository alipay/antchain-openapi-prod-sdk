// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    public class UpdateAntdigitalWebtrwatradeDistributorSubuserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 二级用户账号
        [NameInMap("sub_user_account_id")]
        [Validation(Required=true)]
        public string SubUserAccountId { get; set; }

        // 用户id
        [NameInMap("sub_user_id")]
        [Validation(Required=false)]
        public string SubUserId { get; set; }

        // 二级用户钱包地址
        [NameInMap("sub_user_address")]
        [Validation(Required=false)]
        public string SubUserAddress { get; set; }

        // assetProjectId
        [NameInMap("asset_project_id")]
        [Validation(Required=true)]
        public string AssetProjectId { get; set; }

        // userTarget
        [NameInMap("user_target")]
        [Validation(Required=true)]
        public string UserTarget { get; set; }

        // 登录开关
        [NameInMap("login_account_switch")]
        [Validation(Required=false)]
        public bool? LoginAccountSwitch { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 联系方式
        [NameInMap("contact")]
        [Validation(Required=false)]
        public string Contact { get; set; }

    }

}
