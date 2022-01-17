// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiflowInstVO
    public class ApiflowInstVO : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // machine_inst_id
        [NameInMap("machine_inst_id")]
        [Validation(Required=false)]
        public string MachineInstId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // service_name
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // service_method
        [NameInMap("service_method")]
        [Validation(Required=false)]
        public string ServiceMethod { get; set; }

        // service_type
        [NameInMap("service_type")]
        [Validation(Required=false)]
        public string ServiceType { get; set; }

        // business_key
        [NameInMap("business_key")]
        [Validation(Required=false)]
        public string BusinessKey { get; set; }

        // state_id_compensated_for
        [NameInMap("state_id_compensated_for")]
        [Validation(Required=false)]
        public string StateIdCompensatedFor { get; set; }

        // state_id_retried_for
        [NameInMap("state_id_retried_for")]
        [Validation(Required=false)]
        public string StateIdRetriedFor { get; set; }

        // gmt_started
        [NameInMap("gmt_started")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtStarted { get; set; }

        // is_for_update
        [NameInMap("is_for_update")]
        [Validation(Required=false)]
        public bool? IsForUpdate { get; set; }

        // input_params
        [NameInMap("input_params")]
        [Validation(Required=false)]
        public string InputParams { get; set; }

        // output_params
        [NameInMap("output_params")]
        [Validation(Required=false)]
        public string OutputParams { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // excep
        [NameInMap("excep")]
        [Validation(Required=false)]
        public string Excep { get; set; }

        // gmt_updated
        [NameInMap("gmt_updated")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtUpdated { get; set; }

        // gmt_end
        [NameInMap("gmt_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtEnd { get; set; }

    }

}
