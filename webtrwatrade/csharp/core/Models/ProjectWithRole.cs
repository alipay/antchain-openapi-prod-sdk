// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 项目角色信息
    public class ProjectWithRole : TeaModel {
        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // 项目名称
        [NameInMap("projcet_name")]
        [Validation(Required=false)]
        public string ProjcetName { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // token名称
        [NameInMap("token_name")]
        [Validation(Required=false)]
        public string TokenName { get; set; }

        // 最大供应量
        [NameInMap("capacity")]
        [Validation(Required=false)]
        public string Capacity { get; set; }

        // 净值
        [NameInMap("net_value")]
        [Validation(Required=false)]
        public string NetValue { get; set; }

        // 价格类型
        [NameInMap("price_type")]
        [Validation(Required=false)]
        public string PriceType { get; set; }

        // 项目净值
        [NameInMap("project_net_value")]
        [Validation(Required=false)]
        public string ProjectNetValue { get; set; }

        // 最大限额
        [NameInMap("max_subscription_amount")]
        [Validation(Required=false)]
        public string MaxSubscriptionAmount { get; set; }

        // 部署类型 DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
        [NameInMap("deployment_type")]
        [Validation(Required=false)]
        public string DeploymentType { get; set; }

        // 项目所在链
        [NameInMap("chain_type")]
        [Validation(Required=false)]
        public string ChainType { get; set; }

        // 操作角色列表
        [NameInMap("user_operator_list")]
        [Validation(Required=false)]
        public List<UserOperatorInfoBO> UserOperatorList { get; set; }

        // 代销者机构集合
        [NameInMap("participant_infos")]
        [Validation(Required=false)]
        public List<ParticipantInfo> ParticipantInfos { get; set; }

    }

}
