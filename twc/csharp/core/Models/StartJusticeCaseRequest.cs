// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class StartJusticeCaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件Id,创建案件返回的id
        [NameInMap("case_id")]
        [Validation(Required=true)]
        public long? CaseId { get; set; }

        // 处置端租户ID
        [NameInMap("isv_tenant_id")]
        [Validation(Required=true)]
        public string IsvTenantId { get; set; }

        // 处置方式
        // JUDICIAL_MEDIATION-司法调解
        [NameInMap("judicial_biz_type")]
        [Validation(Required=true)]
        public string JudicialBizType { get; set; }

        // 司法调解基础参数, 当处置方式为5, 必填.
        [NameInMap("judicial_mediation_param")]
        [Validation(Required=false)]
        public JudicialMediationBaseParamInfo JudicialMediationParam { get; set; }

        // 调解沟通联系人(如果不传则使用租户维度的配置信息)
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public ContactInfo ContactInfo { get; set; }

        // 调解回款银行账户(如果不传则使用租户维度的配置信息)
        [NameInMap("bank_account_info")]
        [Validation(Required=false)]
        public BankAccountInfo BankAccountInfo { get; set; }

    }

}
