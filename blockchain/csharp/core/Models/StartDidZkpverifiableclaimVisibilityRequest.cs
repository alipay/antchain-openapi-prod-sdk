// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidZkpverifiableclaimVisibilityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // vc颁发者
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public string Issuer { get; set; }

        // 哪些字段将被展示。
        // 如果父路径和子路径都被包含，那么将以最上级路径为准，展示上级路径对应的内容
        [NameInMap("path")]
        [Validation(Required=true)]
        public List<string> Path { get; set; }

        // vc完整原文
        [NameInMap("vc")]
        [Validation(Required=true)]
        public string Vc { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
