// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class ListKgCompileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        // 文档名称关键词
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

        // 任务标签
        [NameInMap("task_tag")]
        [Validation(Required=false)]
        public string TaskTag { get; set; }

        // 页码(1起)
        [NameInMap("page")]
        [Validation(Required=false)]
        public long? Page { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
