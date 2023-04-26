// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // xr用户通行证分页结果信息
    public class XrUserTicketPageInfo : TeaModel {
        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户通行证编码
        [NameInMap("xr_ticket_code")]
        [Validation(Required=true)]
        public string XrTicketCode { get; set; }

        // xr通行证资源池名称
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 资源名称
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 用户通行证状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 有效期
        [NameInMap("valid_time")]
        [Validation(Required=true)]
        public string ValidTime { get; set; }

        // 所属业务
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 核销类型
        [NameInMap("xr_verification_type")]
        [Validation(Required=true)]
        public string XrVerificationType { get; set; }

    }

}
