// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class OpenConsumecardWalletRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 操作类型(0 开通钱包)
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public long? OperateType { get; set; }

        // 角色(1 机构, 2 个人)
        [NameInMap("role_type")]
        [Validation(Required=true)]
        public long? RoleType { get; set; }

        // 钱包类型（0:余额账户）
        [NameInMap("wallet_type")]
        [Validation(Required=true)]
        public long? WalletType { get; set; }

    }

}
