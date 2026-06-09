// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIGC.Models
{
    public class UploadAssetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产类型
        [NameInMap("asset_type")]
        [Validation(Required=true)]
        public string AssetType { get; set; }

        // 文件公网可访问 URL
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 测试
        [NameInMap("asset_name")]
        [Validation(Required=true)]
        public string AssetName { get; set; }

        // 资产分组 ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

    }

}
