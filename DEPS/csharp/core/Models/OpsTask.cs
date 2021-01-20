// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // OpsTask
    public class OpsTask : TeaModel {
        // parent_group_id
        [NameInMap("parent_group_id")]
        [Validation(Required=false)]
        public string ParentGroupId { get; set; }

        // service_id
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // arrangement_id
        [NameInMap("arrangement_id")]
        [Validation(Required=false)]
        public string ArrangementId { get; set; }

        // action_handler_code
        [NameInMap("action_handler_code")]
        [Validation(Required=false)]
        public string ActionHandlerCode { get; set; }

        // max_retry_attempts
        [NameInMap("max_retry_attempts")]
        [Validation(Required=false)]
        public long? MaxRetryAttempts { get; set; }

        // context
        [NameInMap("context")]
        [Validation(Required=false)]
        public List<Pair> Context { get; set; }

        // process_definition_id
        [NameInMap("process_definition_id")]
        [Validation(Required=false)]
        public string ProcessDefinitionId { get; set; }

        // parent_id
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // parent_entity_type
        [NameInMap("parent_entity_type")]
        [Validation(Required=false)]
        public string ParentEntityType { get; set; }

        // state
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // started_time
        [NameInMap("started_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string StartedTime { get; set; }

        // finished_time
        [NameInMap("finished_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string FinishedTime { get; set; }

        // standalone_executable
        [NameInMap("standalone_executable")]
        [Validation(Required=false)]
        public bool? StandaloneExecutable { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
