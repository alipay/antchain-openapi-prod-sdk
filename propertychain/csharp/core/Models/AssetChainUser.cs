// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 用户
    public class AssetChainUser : TeaModel {
        // 申请Id
        [NameInMap("apply_id")]
        [Validation(Required=false)]
        public string ApplyId { get; set; }

        // 联盟申请类型【NONE,JOIN,CREATE,ALL】
        [NameInMap("apply_type")]
        [Validation(Required=false)]
        public string ApplyType { get; set; }

        // 当前联盟信息
        [NameInMap("current_league_info")]
        [Validation(Required=false)]
        public LeagueInfo CurrentLeagueInfo { get; set; }

        // 企业名称
        [NameInMap("firm_name")]
        [Validation(Required=false)]
        public string FirmName { get; set; }

        // 申请流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
        [NameInMap("league_apply_status")]
        [Validation(Required=false)]
        public string LeagueApplyStatus { get; set; }

        // 是否是盟主
        [NameInMap("league_leader")]
        [Validation(Required=false)]
        public bool? LeagueLeader { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 蚂蚁金融科技租户ID
        [NameInMap("open_tenant")]
        [Validation(Required=false)]
        public string OpenTenant { get; set; }

        // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        [NameInMap("role_type")]
        [Validation(Required=false)]
        public string RoleType { get; set; }

    }

}
