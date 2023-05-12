// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 异库模式应用事务信息
    public class AsynDbTxInfo : TeaModel {
        // action_mode
        [NameInMap("action_mode")]
        [Validation(Required=false)]
        public long? ActionMode { get; set; }

        // activity_mode
        [NameInMap("activity_mode")]
        [Validation(Required=true)]
        public long? ActivityMode { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // biz_type
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // desc
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // role
        [NameInMap("role")]
        [Validation(Required=true)]
        public long? Role { get; set; }

        // split_rule
        [NameInMap("split_rule")]
        [Validation(Required=false)]
        public SplitRule SplitRule { get; set; }

    }

}
