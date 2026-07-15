// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryKmRagRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用户问题
        [NameInMap("query")]
        [Validation(Required=true)]
        public string Query { get; set; }

        // 子范围标识（目录树），用于缩小召回范围；不传则不限范围
        [NameInMap("knowledge_base_ids")]
        [Validation(Required=false)]
        public List<string> KnowledgeBaseIds { get; set; }

        // 召回条数
        [NameInMap("topk")]
        [Validation(Required=false)]
        public long? Topk { get; set; }

        // 是否包含引用来源
        [NameInMap("include_references")]
        [Validation(Required=false)]
        public bool? IncludeReferences { get; set; }

    }

}
