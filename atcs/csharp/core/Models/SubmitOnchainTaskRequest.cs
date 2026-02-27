// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATCS.Models
{
    public class SubmitOnchainTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体标识
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 凭证标识,如delegate_id
        [NameInMap("credential_id")]
        [Validation(Required=true)]
        public string CredentialId { get; set; }

        // 上链内容，json形式
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

    }

}
