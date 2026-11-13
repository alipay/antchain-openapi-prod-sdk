// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class UploadMaasAssetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 幂等标识，由客户端生成
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 文件公网可访问 URL
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 资产类型
        [NameInMap("asset_type")]
        [Validation(Required=true)]
        public string AssetType { get; set; }

        // 资产名称
        [NameInMap("asset_name")]
        [Validation(Required=true)]
        public string AssetName { get; set; }

    }

}
