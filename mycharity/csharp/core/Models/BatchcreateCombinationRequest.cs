// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class BatchcreateCombinationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 分期id
        [NameInMap("stages_id")]
        [Validation(Required=true)]
        public string StagesId { get; set; }

        // 实施内容信息集合
        [NameInMap("combination_message_list")]
        [Validation(Required=true)]
        public List<SubjectCombinationMessage> CombinationMessageList { get; set; }

    }

}
