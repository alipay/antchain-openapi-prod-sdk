// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateJusticeAgentcaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案由
        [NameInMap("case_reason")]
        [Validation(Required=true)]
        public string CaseReason { get; set; }

        // 业务类型，LEASE- 租赁 ，HB_FINANCIAL - HB金融， 模板创建的其他业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 二级商户租户ID，八位字母
        [NameInMap("sub_tenant_id")]
        [Validation(Required=true)]
        public string SubTenantId { get; set; }

        // 外部业务ID
        [NameInMap("external_biz_id")]
        [Validation(Required=true)]
        public string ExternalBizId { get; set; }

        // 业务描述,用于案件的补充描述; 没有则不填
        [NameInMap("case_desc")]
        [Validation(Required=false)]
        public string CaseDesc { get; set; }

        // 根据案件要素模板对应提供要素信息
        [NameInMap("business_info")]
        [Validation(Required=true)]
        public string BusinessInfo { get; set; }

        // 根据案件要素模板对应提供证据信息
        [NameInMap("evidence_info")]
        [Validation(Required=false)]
        public string EvidenceInfo { get; set; }

    }

}
