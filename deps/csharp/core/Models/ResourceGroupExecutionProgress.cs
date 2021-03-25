// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // ResourceGroupExecutionProgress
    public class ResourceGroupExecutionProgress : TeaModel {
        // finished_time
        [NameInMap("finished_time")]
        [Validation(Required=false)]
        public bool? FinishedTime { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // paas_id
        [NameInMap("paas_id")]
        [Validation(Required=false)]
        public string PaasId { get; set; }

        // resource_count
        [NameInMap("resource_count")]
        [Validation(Required=false)]
        public long? ResourceCount { get; set; }

        // resource_states
        [NameInMap("resource_states")]
        [Validation(Required=false)]
        public List<Pair> ResourceStates { get; set; }

        // standalone_executable
        [NameInMap("standalone_executable")]
        [Validation(Required=false)]
        public bool? StandaloneExecutable { get; set; }

        // started_time
        [NameInMap("started_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string StartedTime { get; set; }

        // state
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // refer_key
        [NameInMap("refer_key")]
        [Validation(Required=false)]
        public string ReferKey { get; set; }

    }

}
