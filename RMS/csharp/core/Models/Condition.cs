// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Condition
    public class Condition : TeaModel {
        // plugin
        [NameInMap("plugin")]
        [Validation(Required=false)]
        public string Plugin { get; set; }

        // content_type
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

        // tag
        [NameInMap("tag")]
        [Validation(Required=false)]
        public string Tag { get; set; }

        // ds_id
        [NameInMap("ds_id")]
        [Validation(Required=false)]
        public string DsId { get; set; }

        // new_cp_id
        [NameInMap("new_cp_id")]
        [Validation(Required=false)]
        public string NewCpId { get; set; }

        // start
        [NameInMap("start")]
        [Validation(Required=false)]
        public long? Start { get; set; }

        // end
        [NameInMap("end")]
        [Validation(Required=false)]
        public long? End { get; set; }

        // tick_interval
        [NameInMap("tick_interval")]
        [Validation(Required=false)]
        public long? TickInterval { get; set; }

        // use_new
        [NameInMap("use_new")]
        [Validation(Required=false)]
        public bool? UseNew { get; set; }

        // groupby
        [NameInMap("groupby")]
        [Validation(Required=false)]
        public List<string> Groupby { get; set; }

        // values
        [NameInMap("values")]
        [Validation(Required=false)]
        public List<KeySet> Values { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public long? TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public long? WorkspaceId { get; set; }

        // am_old_data_struct
        [NameInMap("am_old_data_struct")]
        [Validation(Required=false)]
        public bool? AmOldDataStruct { get; set; }

        // am_is_spm
        [NameInMap("am_is_spm")]
        [Validation(Required=false)]
        public bool? AmIsSpm { get; set; }

        // old_ds_id
        [NameInMap("old_ds_id")]
        [Validation(Required=false)]
        public string OldDsId { get; set; }

    }

}
