// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryOperationlogTimelineRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // customer_id
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // gmt_from
        [NameInMap("gmt_from")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtFrom { get; set; }

        // gmt_to
        [NameInMap("gmt_to")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtTo { get; set; }

        // module
        [NameInMap("module")]
        [Validation(Required=false)]
        public string Module { get; set; }

        // operation_status
        [NameInMap("operation_status")]
        [Validation(Required=false)]
        public string OperationStatus { get; set; }

        // operation_target
        [NameInMap("operation_target")]
        [Validation(Required=false)]
        public string OperationTarget { get; set; }

        // operation_type
        [NameInMap("operation_type")]
        [Validation(Required=false)]
        public string OperationType { get; set; }

        // operator_id
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        // page_no
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
