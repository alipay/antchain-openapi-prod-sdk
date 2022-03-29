// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class BatchdeleteUserFavoriteRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 资源类型
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 已收藏资源ID列表（文件夹，传入文件夹ID；自定义监控，传入自定义监控ID；应用，传入universal_table_id）
        [NameInMap("resource_ids")]
        [Validation(Required=true)]
        public List<string> ResourceIds { get; set; }

    }

}
