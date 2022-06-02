// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class ExecApiAuthtemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 树的模版id
        [NameInMap("tree_template_id")]
        [Validation(Required=true)]
        public string TreeTemplateId { get; set; }

        // 模版对应的版本号
        [NameInMap("tree_version")]
        [Validation(Required=true)]
        public string TreeVersion { get; set; }

        // 对应节点ID
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 当前卡片所有需要填充元素key
        // 和value值
        [NameInMap("pairs")]
        [Validation(Required=true)]
        public Pair Pairs { get; set; }

    }

}
