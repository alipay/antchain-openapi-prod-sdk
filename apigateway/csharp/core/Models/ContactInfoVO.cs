// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 联系方式
    public class ContactInfoVO : TeaModel {
        // 授权App标识
        [NameInMap("auth_app_info_id")]
        [Validation(Required=false)]
        public string AuthAppInfoId { get; set; }

        // 公司名称
        [NameInMap("company")]
        [Validation(Required=false)]
        public string Company { get; set; }

        // 联系方式标识
        [NameInMap("contact_id")]
        [Validation(Required=false)]
        public string ContactId { get; set; }

        // 电子邮箱
        [NameInMap("mail")]
        [Validation(Required=false)]
        public string Mail { get; set; }

        // 联系人姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 电话号码
        [NameInMap("tel")]
        [Validation(Required=false)]
        public string Tel { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
