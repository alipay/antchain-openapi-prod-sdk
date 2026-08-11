// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class QueryProjectMemberRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 操作者用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 用户名称（模糊搜索）
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 当前页，默认为 1
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 每页大小，默认为 10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 排序字段：UTC_CREATE（创建时间）、UTC_MODIFIED（更新时间），默认为 UTC_CREATE
        [NameInMap("sort_field")]
        [Validation(Required=false)]
        public string SortField { get; set; }

        // 排序方式：ASC（升序）、DESC（降序），默认为 DESC
        [NameInMap("sort_order")]
        [Validation(Required=false)]
        public string SortOrder { get; set; }

    }

}
