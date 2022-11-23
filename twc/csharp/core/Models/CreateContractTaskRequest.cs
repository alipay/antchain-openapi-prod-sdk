// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务类型枚举值
        //   文件解密上传任务，FILE_DECRYPT_ESIGN_UPLOAD
        [NameInMap("task_type")]
        [Validation(Required=true)]
        public string TaskType { get; set; }

        // 文件内容文件解密上传任务时，为原始文件id
        [NameInMap("task_content")]
        [Validation(Required=true)]
        public string TaskContent { get; set; }

    }

}
