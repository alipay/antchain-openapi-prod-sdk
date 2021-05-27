// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class CreateLeagueApplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟描述
        [NameInMap("league_desc")]
        [Validation(Required=false)]
        public string LeagueDesc { get; set; }

        // 联盟名称
        [NameInMap("league_name")]
        [Validation(Required=true)]
        public string LeagueName { get; set; }

        // 费率
        [NameInMap("rate")]
        [Validation(Required=false)]
        public long? Rate { get; set; }

        // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        [NameInMap("role_type")]
        [Validation(Required=true)]
        public string RoleType { get; set; }

    }

}
