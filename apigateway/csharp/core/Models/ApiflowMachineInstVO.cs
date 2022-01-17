// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiflowMachineInstVO
    public class ApiflowMachineInstVO : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // machine_id
        [NameInMap("machine_id")]
        [Validation(Required=false)]
        public string MachineId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // parent_id
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // gmt_started
        [NameInMap("gmt_started")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtStarted { get; set; }

        // business_key
        [NameInMap("business_key")]
        [Validation(Required=false)]
        public string BusinessKey { get; set; }

        // start_params
        [NameInMap("start_params")]
        [Validation(Required=false)]
        public string StartParams { get; set; }

        // gmt_end
        [NameInMap("gmt_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtEnd { get; set; }

        // excep
        [NameInMap("excep")]
        [Validation(Required=false)]
        public string Excep { get; set; }

        // end_params
        [NameInMap("end_params")]
        [Validation(Required=false)]
        public string EndParams { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // compensation_status
        [NameInMap("compensation_status")]
        [Validation(Required=false)]
        public string CompensationStatus { get; set; }

        // is_running
        [NameInMap("is_running")]
        [Validation(Required=false)]
        public bool? IsRunning { get; set; }

        // gmt_updated
        [NameInMap("gmt_updated")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtUpdated { get; set; }

    }

}
