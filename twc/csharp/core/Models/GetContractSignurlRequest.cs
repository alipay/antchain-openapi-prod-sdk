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

        // 集群ID
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

        // 默认为空，返回的任务链接仅包含签署人本人需要签署的任务； 传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务； 传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务
        [NameInMap("organize_id")]
        [Validation(Required=false)]
        public string OrganizeId { get; set; }

        // 是否需要同时返回短链接，默认为false
        [NameInMap("short_url")]
        [Validation(Required=false)]
        public bool? ShortUrl { get; set; }

    }

}
