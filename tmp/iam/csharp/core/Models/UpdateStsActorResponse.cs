// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class UpdateStsActorResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 虚拟身份受信关系集合，通常只包含一个
        [NameInMap("bindings")]
        [Validation(Required=false)]
        public List<StsActorBinding> Bindings { get; set; }

        // 针对虚拟身份的描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 虚拟身份ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 虚拟身份名称，租户内唯一
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 虚拟身份所在租户
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

    }

}
