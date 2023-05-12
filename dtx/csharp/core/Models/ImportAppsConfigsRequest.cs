// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class ImportAppsConfigsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 上传文件名
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // initiator|participator
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 导入的内容，严格的json
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

    }

}
