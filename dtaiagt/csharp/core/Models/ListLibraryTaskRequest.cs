// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    public class ListLibraryTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("library_id")]
        [Validation(Required=true)]
        public long? LibraryId { get; set; }

        // 任务类型列表
        [NameInMap("task_type")]
        [Validation(Required=false)]
        public List<string> TaskType { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public long? TaskId { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public string PageNum { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public string PageSize { get; set; }

    }

}
