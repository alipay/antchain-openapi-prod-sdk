// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // BaaS平台联盟信息
    public class BaasUnionInfo : TeaModel {
        // 联盟名称
        [NameInMap("union_name")]
        [Validation(Required=true)]
        public string UnionName { get; set; }

        // 描述
        [NameInMap("union_description")]
        [Validation(Required=true)]
        public string UnionDescription { get; set; }

        // 联系人
        [NameInMap("union_user")]
        [Validation(Required=true)]
        public string UnionUser { get; set; }

        // 联盟联系人手机号码
        [NameInMap("union_user_cell")]
        [Validation(Required=true)]
        public string UnionUserCell { get; set; }

        // 联盟联系人邮箱
        [NameInMap("union_user_mail")]
        [Validation(Required=true)]
        public string UnionUserMail { get; set; }

    }

}
