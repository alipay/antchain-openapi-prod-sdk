// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_f0f16236ed254bd499e3fe0f9600e0d5.Models
{
    public class QueryMaxCopilotFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户问题
        [NameInMap("question")]
        [Validation(Required=true)]
        public string Question { get; set; }

        // 报告类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 文件id列表
        [NameInMap("file_ids")]
        [Validation(Required=false)]
        public List<string> FileIds { get; set; }

        // 网页地址列表
        [NameInMap("urls")]
        [Validation(Required=false)]
        public List<string> Urls { get; set; }

    }

}
