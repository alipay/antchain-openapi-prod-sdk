// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 数字资产管理平台账户映射结构
    public class ExchangeAccountMap : TeaModel {
        // 用户联系方式
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 用户账户
        [NameInMap("user_account")]
        [Validation(Required=true)]
        public string UserAccount { get; set; }

        // 用户名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
