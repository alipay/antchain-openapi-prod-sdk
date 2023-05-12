// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class UpdateRecoveryParticipatorsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // actions
        [NameInMap("actions")]
        [Validation(Required=true)]
        public List<Participator> Actions { get; set; }

        // biz_type
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 默认1：TCC
        [NameInMap("action_mode")]
        [Validation(Required=true)]
        public long? ActionMode { get; set; }

    }

}
