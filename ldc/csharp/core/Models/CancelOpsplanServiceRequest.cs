// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CancelOpsplanServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 发布单下应用服务对应的发布id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 取消原因
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

        // 操作人账号，lks1.23.0才支持
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // [huanyu场景使用]huanyu变更单唯一id
        [NameInMap("huanyu_exec_no")]
        [Validation(Required=false)]
        public string HuanyuExecNo { get; set; }

    }

}
