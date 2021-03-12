// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 账户映射情况
    public class AccountMappingInfo : TeaModel {
        // 链上账户id
        [NameInMap("bc_account")]
        [Validation(Required=true)]
        public string BcAccount { get; set; }

        // 账户绑定状态，1为未绑定，2为绑定成功
        [NameInMap("binding_status")]
        [Validation(Required=true)]
        public long? BindingStatus { get; set; }

        // 1是激活状态，2是冻结状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 账户唯一标示
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

    }

}
