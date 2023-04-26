// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // xr通行证批量创建成功列表
    public class XrTicketPoolSuccessList : TeaModel {
        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 有效期
        [NameInMap("valid_time")]
        [Validation(Required=true)]
        public string ValidTime { get; set; }

        // 体验时长
        [NameInMap("test_time")]
        [Validation(Required=true)]
        public long? TestTime { get; set; }

        // vr设备集合
        [NameInMap("xr_apps")]
        [Validation(Required=false)]
        public string XrApps { get; set; }

        // 券池最大数
        [NameInMap("max_pool_count")]
        [Validation(Required=true)]
        public long? MaxPoolCount { get; set; }

        // 券池名称
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 核销类型
        [NameInMap("xr_verification_type")]
        [Validation(Required=true)]
        public string XrVerificationType { get; set; }

    }

}
