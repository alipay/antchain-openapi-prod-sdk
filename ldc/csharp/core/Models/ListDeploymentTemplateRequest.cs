// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ListDeploymentTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 模板编码或名称模糊搜索
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 当前页码，从1开始，默认为1
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 分页大小，默认为10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 查询方式，默认FUZZY，模糊查询
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

    }

}
