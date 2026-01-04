// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 知识库-文档列表-分页对象
    public class LibraryDocPageResult : TeaModel {
        // 请求处理结果标识
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 业务状态码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 返回消息
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 请求链路追踪ID
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 符合查询条件的总记录数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 当前返回数据的页码
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 文档数据列表
        [NameInMap("result")]
        [Validation(Required=true)]
        public List<ContentFile> Result { get; set; }

    }

}
