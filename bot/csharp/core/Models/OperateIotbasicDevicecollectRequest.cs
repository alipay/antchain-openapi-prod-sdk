// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicDevicecollectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 资产ID
        [NameInMap("asset_id")]
        [Validation(Required=false)]
        public string AssetId { get; set; }

        // 数据资产类型
        [NameInMap("data_scene")]
        [Validation(Required=true)]
        public string DataScene { get; set; }

        // 所属业务
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 资产数据内容，业务要上链的数据JSON格式
        [NameInMap("asset_data")]
        [Validation(Required=true)]
        public string AssetData { get; set; }

    }

}
