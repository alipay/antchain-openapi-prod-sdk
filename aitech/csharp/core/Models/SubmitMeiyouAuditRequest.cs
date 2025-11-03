// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class SubmitMeiyouAuditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据Id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 模态
        [NameInMap("modal")]
        [Validation(Required=true)]
        public string Modal { get; set; }

        // 场景
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 美柚审核记录信息
        [NameInMap("audit_info")]
        [Validation(Required=true)]
        public string AuditInfo { get; set; }

        // 回调函数
        [NameInMap("callback")]
        [Validation(Required=true)]
        public string Callback { get; set; }

        // 租户
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

    }

}
