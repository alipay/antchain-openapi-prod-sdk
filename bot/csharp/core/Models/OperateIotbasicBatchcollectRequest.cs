// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicBatchcollectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 所属业务
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 上链数据列表
        [NameInMap("collect_info_list")]
        [Validation(Required=true)]
        public List<CollectInfo> CollectInfoList { get; set; }

    }

}
