// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class QueryEnergyknowledgeRagRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户问题
        [NameInMap("query")]
        [Validation(Required=true)]
        public string Query { get; set; }

        // 指定查询的知识库id
        [NameInMap("knowledge_base_ids")]
        [Validation(Required=false)]
        public List<string> KnowledgeBaseIds { get; set; }

        // 召回数量
        [NameInMap("topk")]
        [Validation(Required=false)]
        public long? Topk { get; set; }

        // 是否返回引用docid
        [NameInMap("include_references")]
        [Validation(Required=false)]
        public bool? IncludeReferences { get; set; }

    }

}
