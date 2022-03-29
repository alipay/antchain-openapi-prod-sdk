// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 租户
    public class Tenant : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 租户名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 展示名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // outsideTenantId
        [NameInMap("outside_tenant_id")]
        [Validation(Required=true)]
        public string OutsideTenantId { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // config
        [NameInMap("config")]
        [Validation(Required=true)]
        public string Config { get; set; }

        // stack_view
        [NameInMap("stack_view")]
        [Validation(Required=true)]
        public bool? StackView { get; set; }

    }

}
