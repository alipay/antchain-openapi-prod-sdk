// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 联盟申请信息
    public class LeagueApplyInfo : TeaModel {
        // 申请账号
        [NameInMap("apply_account")]
        [Validation(Required=false)]
        public string ApplyAccount { get; set; }

        // 申请企业
        [NameInMap("apply_corp")]
        [Validation(Required=false)]
        public string ApplyCorp { get; set; }

        // 申请Id
        [NameInMap("apply_id")]
        [Validation(Required=false)]
        public string ApplyId { get; set; }

        // 申请人手机
        [NameInMap("apply_mobile_num")]
        [Validation(Required=false)]
        public string ApplyMobileNum { get; set; }

        // 申请时间
        [NameInMap("apply_time")]
        [Validation(Required=false)]
        public string ApplyTime { get; set; }

        // 申请类型【NONE,JOIN,CREATE,ALL】
        [NameInMap("apply_type")]
        [Validation(Required=false)]
        public string ApplyType { get; set; }

        // 当前流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
        [NameInMap("current_status")]
        [Validation(Required=false)]
        public string CurrentStatus { get; set; }

        // 流程历史
        [NameInMap("flow_history")]
        [Validation(Required=false)]
        public List<FlowInfo> FlowHistory { get; set; }

        // 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        [NameInMap("role_type")]
        [Validation(Required=false)]
        public string RoleType { get; set; }

    }

}
