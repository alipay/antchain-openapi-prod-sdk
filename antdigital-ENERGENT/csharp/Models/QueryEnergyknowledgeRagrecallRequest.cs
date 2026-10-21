// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class QueryEnergyknowledgeRagrecallRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // rag检索问题
        [NameInMap("query")]
        [Validation(Required=true)]
        public string Query { get; set; }

        // 召回的知识库id
        [NameInMap("knowledgebaseids")]
        [Validation(Required=false)]
        public List<string> Knowledgebaseids { get; set; }

        // 是否包含召回文件名，默认true
        [NameInMap("includereferences")]
        [Validation(Required=false)]
        public bool? Includereferences { get; set; }

        // 召回条数，默认5
        [NameInMap("topk")]
        [Validation(Required=false)]
        public long? Topk { get; set; }

    }

}
