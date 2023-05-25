// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 仓库
    public class Repository : TeaModel {
        // 仓库ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 仓库名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 仓库Tag数
        [NameInMap("tags_count")]
        [Validation(Required=true)]
        public string TagsCount { get; set; }

    }

}
