// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class BatchimportKmDocumentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("tree_id")]
        [Validation(Required=true)]
        public string TreeId { get; set; }

        // 挂载目标节点ID
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 任务扩展号
        [NameInMap("task_ext")]
        [Validation(Required=false)]
        public string TaskExt { get; set; }

        // 待入库文件列表(files.1.file_name点号形式)
        [NameInMap("files")]
        [Validation(Required=true)]
        public List<KbUploadFileItem> Files { get; set; }

    }

}
