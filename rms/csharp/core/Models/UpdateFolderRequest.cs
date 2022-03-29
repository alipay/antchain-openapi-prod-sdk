// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class UpdateFolderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 文件夹id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 文件夹新名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

    }

}
