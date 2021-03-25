// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 回滚信息
    public class RollbackInfo : TeaModel {
        // group_amount
        [NameInMap("group_amount")]
        [Validation(Required=false)]
        public long? GroupAmount { get; set; }

        // group_strategy
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

        // reason
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // sub_entities
        [NameInMap("sub_entities")]
        [Validation(Required=false)]
        public List<string> SubEntities { get; set; }

        // target_id
        [NameInMap("target_id")]
        [Validation(Required=false)]
        public string TargetId { get; set; }

        // target_version
        [NameInMap("target_version")]
        [Validation(Required=false)]
        public string TargetVersion { get; set; }

        // need_beta_group
        [NameInMap("need_beta_group")]
        [Validation(Required=false)]
        public bool? NeedBetaGroup { get; set; }

        // env_config
        [NameInMap("env_config")]
        [Validation(Required=false)]
        public List<Pair> EnvConfig { get; set; }

        // confirm_succeeded_rollback
        [NameInMap("confirm_succeeded_rollback")]
        [Validation(Required=false)]
        public bool? ConfirmSucceededRollback { get; set; }

        // retry_rollbacked
        [NameInMap("retry_rollbacked")]
        [Validation(Required=false)]
        public bool? RetryRollbacked { get; set; }

    }

}
