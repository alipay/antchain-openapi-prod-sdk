// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class QueryProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 父亲项目的id: 负数表示不限
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public long? ParentId { get; set; }

        // uid
        [NameInMap("uid")]
        [Validation(Required=false)]
        public string Uid { get; set; }

        // 排序字段名称，如gmt_create
        [NameInMap("order_by")]
        [Validation(Required=false)]
        public string OrderBy { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 指定ID
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<long?> Ids { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // 所在项目组ID
        [NameInMap("project_group_id")]
        [Validation(Required=false)]
        public long? ProjectGroupId { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 排序方式：DESC降序，ASC升序
        [NameInMap("sort_type")]
        [Validation(Required=false)]
        public string SortType { get; set; }

    }

}
