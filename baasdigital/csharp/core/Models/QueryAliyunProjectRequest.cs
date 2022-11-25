// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    public class QueryAliyunProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 蚂蚁链ID
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // 项目状态
        [NameInMap("project_status")]
        [Validation(Required=false)]
        public string ProjectStatus { get; set; }

        // 创建起始日期时间戳
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 创建结束时间戳
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 分页页码，默认0
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // 单页数量，默认10
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
