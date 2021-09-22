// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 场景码信息
    public class SceneModel : TeaModel {
        // 主键id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 场景名
        [NameInMap("scene_name")]
        [Validation(Required=true)]
        public string SceneName { get; set; }

        // 是否托管
        [NameInMap("escrowed")]
        [Validation(Required=false)]
        public string Escrowed { get; set; }

        // 私钥密码
        [NameInMap("private_key_password")]
        [Validation(Required=false)]
        public string PrivateKeyPassword { get; set; }

        // 租户
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 场景类型
        [NameInMap("scene_type")]
        [Validation(Required=false)]
        public string SceneType { get; set; }

    }

}
