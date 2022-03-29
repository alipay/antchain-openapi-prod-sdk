// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // WorkspaceDTO
    public class WorkspaceDTO : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // display_name
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // outside_ws_id
        [NameInMap("outside_ws_id")]
        [Validation(Required=true)]
        public string OutsideWsId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // outside_tenant_id
        [NameInMap("outside_tenant_id")]
        [Validation(Required=true)]
        public string OutsideTenantId { get; set; }

        // stack_view
        [NameInMap("stack_view")]
        [Validation(Required=true)]
        public bool? StackView { get; set; }

    }

}
