// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class UpdateDssScheduleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        [NameInMap("cronexp")]
        [Validation(Required=true)]
        public string Cronexp { get; set; }

        [NameInMap("divide_count")]
        [Validation(Required=true)]
        public int? DivideCount { get; set; }

        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        [NameInMap("max_load")]
        [Validation(Required=true)]
        public int? MaxLoad { get; set; }

        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("priority")]
        [Validation(Required=true)]
        public string Priority { get; set; }

        [NameInMap("strategy_name")]
        [Validation(Required=true)]
        public string StrategyName { get; set; }

        [NameInMap("task_idcs")]
        [Validation(Required=true)]
        public string TaskIdcs { get; set; }

        [NameInMap("task_state")]
        [Validation(Required=true)]
        public string TaskState { get; set; }

        [NameInMap("task_type")]
        [Validation(Required=true)]
        public string TaskType { get; set; }

    }

}
