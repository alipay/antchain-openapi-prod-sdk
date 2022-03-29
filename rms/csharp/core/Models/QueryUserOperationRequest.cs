// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUserOperationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 开始时间
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // 结束时间
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // 表名
        [NameInMap("table_name")]
        [Validation(Required=true)]
        public string TableName { get; set; }

        // 表实体对应ID
        [NameInMap("table_entity_id")]
        [Validation(Required=true)]
        public long? TableEntityId { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

    }

}
