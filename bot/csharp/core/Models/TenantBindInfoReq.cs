// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 租户关联信息请求结构体
    public class TenantBindInfoReq : TeaModel {
        // 租户关联扩展信息
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 业务类型，默认空
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 组织机构代码，可为中文
        [NameInMap("tenant_uid")]
        [Validation(Required=true)]
        public string TenantUid { get; set; }

        // 组织结构名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
