// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 合同流程签名人
    public class ContractFlowSigner : TeaModel {
        // 签署人账号id
        // 
        [NameInMap("signer_account_id")]
        [Validation(Required=true)]
        public string SignerAccountId { get; set; }

        // 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
        // 
        [NameInMap("signer_authorized_account_id")]
        [Validation(Required=true)]
        public string SignerAuthorizedAccountId { get; set; }

        // 签约主体名称
        // 
        [NameInMap("signer_authorized_account_name")]
        [Validation(Required=true)]
        public string SignerAuthorizedAccountName { get; set; }

        // 签署主体是否已实名
        // 
        [NameInMap("signer_authorized_account_real_name")]
        [Validation(Required=true)]
        public bool? SignerAuthorizedAccountRealName { get; set; }

        // 签署主体类型, 0-个人, 1-机构
        // 
        [NameInMap("signer_authorized_account_type")]
        [Validation(Required=true)]
        public long? SignerAuthorizedAccountType { get; set; }

        // 签署人名称
        // 
        [NameInMap("signer_name")]
        [Validation(Required=true)]
        public string SignerName { get; set; }

        // 签署人是否已实名
        // 
        [NameInMap("signer_real_name")]
        [Validation(Required=true)]
        public bool? SignerRealName { get; set; }

        // 签署顺序
        // 
        [NameInMap("sign_order")]
        [Validation(Required=true)]
        public long? SignOrder { get; set; }

        // 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
        // 
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public long? SignStatus { get; set; }

        // 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
        // 
        [NameInMap("third_order_no")]
        [Validation(Required=true)]
        public string ThirdOrderNo { get; set; }

    }

}
