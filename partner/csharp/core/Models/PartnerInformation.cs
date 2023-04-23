// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 合作方（伙伴、商家）信息
    public class PartnerInformation : TeaModel {
        // 合作方（商家、伙伴）用户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 合作方（商家、伙伴）基本信息
        [NameInMap("basic_information")]
        [Validation(Required=true)]
        public PartnerBasicInformation BasicInformation { get; set; }

        // 联系信息
        [NameInMap("contact_information")]
        [Validation(Required=true)]
        public PartnerContactInformation ContactInformation { get; set; }

        // 除约定属性外的，其余商家主要信息
        [NameInMap("extend_info")]
        [Validation(Required=false)]
        public string ExtendInfo { get; set; }

    }

}
