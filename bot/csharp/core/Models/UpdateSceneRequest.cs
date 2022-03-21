// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateSceneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主键Id 
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 是否跳过中台数据校验处理
        [NameInMap("skip_pegasus")]
        [Validation(Required=true)]
        public bool? SkipPegasus { get; set; }

        // 场景名称
        // 
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

        // 租户
        // 
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 场景类型
        // 
        [NameInMap("scene_type")]
        [Validation(Required=false)]
        public string SceneType { get; set; }

        // 定制数据处理类 , 使用用逗号分隔
        [NameInMap("customer_processor")]
        [Validation(Required=false)]
        public string CustomerProcessor { get; set; }

        // 是否为测试数据
        [NameInMap("mock")]
        [Validation(Required=false)]
        public bool? Mock { get; set; }

    }

}
