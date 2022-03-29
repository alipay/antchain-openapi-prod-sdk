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
        [Validation(Required=true)]
        public string Creater { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // update_time
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

        // status_desc
        [NameInMap("status_desc")]
        [Validation(Required=true)]
        public string StatusDesc { get; set; }

        // compute_close
        [NameInMap("compute_close")]
        [Validation(Required=true)]
        public bool? ComputeClose { get; set; }

        // degrade_reason
        [NameInMap("degrade_reason")]
        [Validation(Required=true)]
        public string DegradeReason { get; set; }

        // degrade_operator
        [NameInMap("degrade_operator")]
        [Validation(Required=true)]
        public string DegradeOperator { get; set; }

        // degrade_time
        [NameInMap("degrade_time")]
        [Validation(Required=true)]
        public string DegradeTime { get; set; }

        // degrade_time_v2
        [NameInMap("degrade_time_v2")]
        [Validation(Required=true)]
        public long? DegradeTimeV2 { get; set; }

    }

}
