// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 营销场景
    public class PromotionScene : TeaModel {
        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // 场景名称
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

        // 场景备注
        [NameInMap("scene_remark")]
        [Validation(Required=false)]
        public string SceneRemark { get; set; }

        // 场景商品数量
        [NameInMap("scene_product_amount")]
        [Validation(Required=false)]
        public long? SceneProductAmount { get; set; }

    }

}
