// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class AddSceneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景名称
        [NameInMap("scene_name")]
        [Validation(Required=true)]
        public string SceneName { get; set; }

        // 是否托管,取值范围为：NON_ESCROWED、ESCROWED
        [NameInMap("escrowed")]
        [Validation(Required=true)]
        public string Escrowed { get; set; }

        // 私钥密码
        [NameInMap("private_key_password")]
        [Validation(Required=true)]
        public string PrivateKeyPassword { get; set; }

        // 租户
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 场景类型
        [NameInMap("scene_type")]
        [Validation(Required=true)]
        public string SceneType { get; set; }

        // 是否为测试数据
        [NameInMap("mock")]
        [Validation(Required=false)]
        public bool? Mock { get; set; }

    }

}
