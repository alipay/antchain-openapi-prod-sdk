// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class SaveProductTopRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务号
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 租户 ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 实例 ID，兼容老模型的 tntInstId
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 产品编码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 模块唯一标识
        [NameInMap("module_key")]
        [Validation(Required=false)]
        public string ModuleKey { get; set; }

        // 操作类型
        [NameInMap("operate")]
        [Validation(Required=false)]
        public string Operate { get; set; }

        // 操作来源渠道
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

    }

}
