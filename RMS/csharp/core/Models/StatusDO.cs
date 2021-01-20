// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // StatusDO
    public class StatusDO : TeaModel {
        // creater
        [NameInMap("creater")]
        [Validation(Required=false)]
        public string Creater { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // update_time
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

        // status_desc
        [NameInMap("status_desc")]
        [Validation(Required=false)]
        public string StatusDesc { get; set; }

        // compute_close
        [NameInMap("compute_close")]
        [Validation(Required=false)]
        public bool? ComputeClose { get; set; }

        // degrade_reason
        [NameInMap("degrade_reason")]
        [Validation(Required=false)]
        public string DegradeReason { get; set; }

        // degrade_operator
        [NameInMap("degrade_operator")]
        [Validation(Required=false)]
        public string DegradeOperator { get; set; }

        // degrade_time
        [NameInMap("degrade_time")]
        [Validation(Required=false)]
        public string DegradeTime { get; set; }

        // degrade_time_v2
        [NameInMap("degrade_time_v2")]
        [Validation(Required=false)]
        public long? DegradeTimeV2 { get; set; }

    }

}
