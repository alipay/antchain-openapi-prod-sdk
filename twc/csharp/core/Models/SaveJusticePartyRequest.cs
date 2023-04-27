// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SaveJusticePartyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 委托申请方配置ID
        [NameInMap("party_id")]
        [Validation(Required=false)]
        public long? PartyId { get; set; }

        // 委托申请方类型,目前仅支持企业.
        // 个人: PERSON
        // 企业:ORG
        [NameInMap("party_type")]
        [Validation(Required=true)]
        public string PartyType { get; set; }

        // 企业信息实体;
        // 当申请方类型为企业时,该字段必填;
        [NameInMap("party_organization_info")]
        [Validation(Required=false)]
        public JudicialOrgInfo PartyOrganizationInfo { get; set; }

        // 案件协同工作联系人信息实体
        [NameInMap("coordinator_person_info")]
        [Validation(Required=false)]
        public JudicialPersonInfo CoordinatorPersonInfo { get; set; }

        // 案件协同人银行账户信息
        [NameInMap("coordinator_bank_info")]
        [Validation(Required=false)]
        public JudicialBankInfo CoordinatorBankInfo { get; set; }

        // adsada
        [NameInMap("sub_tenant_id")]
        [Validation(Required=false)]
        public string SubTenantId { get; set; }

        // 默认为空,true表示为二级商户创建或者修改申请人,sub_tenant_id不能为空,
        // false表示为当前商户创建或者修改申请人,sub_tenant_id为空
        [NameInMap("agent_create_party")]
        [Validation(Required=false)]
        public bool? AgentCreateParty { get; set; }

    }

}
