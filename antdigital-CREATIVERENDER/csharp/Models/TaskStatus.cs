// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // A container for the status of a task
    public class TaskStatus : TeaModel {
        // The current state of this task.
        /// <summary>
        /// <b>Example:</b>
        /// <para>TASK_STATE_COMPLETED</para>
        /// </summary>
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // A message associated with the status.
        [NameInMap("message")]
        [Validation(Required=true)]
        public Message Message { get; set; }

    }

}
