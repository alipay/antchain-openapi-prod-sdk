// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ListAuthTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务名称/任务id/自有id 模糊搜索
        [NameInMap("task_name")]
        [Validation(Required=false)]
        public string TaskName { get; set; }

        // 页码，默认是0开始
        [NameInMap("page_no")]
        [Validation(Required=true)]
        public long? PageNo { get; set; }

        // 每页大小，默认是6
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 操作人列表
        [NameInMap("operators")]
        [Validation(Required=false)]
        public List<string> Operators { get; set; }

    }

}
