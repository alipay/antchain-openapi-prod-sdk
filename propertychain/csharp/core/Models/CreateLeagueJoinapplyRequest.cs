// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class CreateLeagueJoinapplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 备注
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 联盟Id
        [NameInMap("league_id")]
        [Validation(Required=true)]
        public string LeagueId { get; set; }

        // 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        [NameInMap("role_type")]
        [Validation(Required=true)]
        public string RoleType { get; set; }

    }

}
