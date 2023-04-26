// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 通行证批量创建失败列表
    public class XrTicketPoolFailList : TeaModel {
        // 券名称
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 错误信息
        [NameInMap("error_msg")]
        [Validation(Required=true)]
        public string ErrorMsg { get; set; }

        // 核销类型
        [NameInMap("xr_verification_type")]
        [Validation(Required=true)]
        public string XrVerificationType { get; set; }

    }

}
