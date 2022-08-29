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
        [Validation(Required=true)]
        public JudicialOrgInfo PartyOrganizationInfo { get; set; }

        // 案件协同工作联系人信息实体
        [NameInMap("coordinator_person_info")]
        [Validation(Required=true)]
        public JudicialPersonInfo CoordinatorPersonInfo { get; set; }

    }

}
