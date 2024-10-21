// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    // API变更结构
    public class ApiChange : TeaModel {
        // 变更类型，ADD-新增，DELETE-删除
        [NameInMap("change_type")]
        [Validation(Required=true)]
        public string ChangeType { get; set; }

        // API名称列表
        [NameInMap("api_names")]
        [Validation(Required=true)]
        public List<string> ApiNames { get; set; }

    }

}
