// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    public class AddItagAntitagUserTntRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 标注平台的租户ID
        [NameInMap("tntinstid")]
        [Validation(Required=true)]
        public string Tntinstid { get; set; }

        // 第三方账号
        [NameInMap("accountno")]
        [Validation(Required=true)]
        public string Accountno { get; set; }

        // 用户来源
        [NameInMap("accountsource")]
        [Validation(Required=true)]
        public string Accountsource { get; set; }

        // 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

    }

}
