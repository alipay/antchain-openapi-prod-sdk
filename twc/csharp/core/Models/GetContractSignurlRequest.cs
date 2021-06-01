// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetContractSignurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签署人账号id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 存量参数，已废弃
        [NameInMap("organize_id")]
        [Validation(Required=false)]
        public string OrganizeId { get; set; }

        // 是否需要同时返回短链接，默认为false
        [NameInMap("short_url")]
        [Validation(Required=false)]
        public bool? ShortUrl { get; set; }

        // 本功能需要单独审批开放。当account_id为机构账户时，可以在执行签署时单独指定经办人账户，代为完成本次签署操作。
        [NameInMap("agent_account_id")]
        [Validation(Required=false)]
        public string AgentAccountId { get; set; }

    }

}
