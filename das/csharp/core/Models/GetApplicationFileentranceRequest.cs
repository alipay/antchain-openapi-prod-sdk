// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class GetApplicationFileentranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据集ID
        [NameInMap("dataset_id")]
        [Validation(Required=true)]
        public string DatasetId { get; set; }

        // 用户是否授权
        [NameInMap("user_authed")]
        [Validation(Required=false)]
        public bool? UserAuthed { get; set; }

        // 授权文件ID
        [NameInMap("file_index")]
        [Validation(Required=false)]
        public string FileIndex { get; set; }

    }

}
