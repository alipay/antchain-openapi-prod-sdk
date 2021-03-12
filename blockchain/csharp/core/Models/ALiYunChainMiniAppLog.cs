// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链小程序日志查询
    public class ALiYunChainMiniAppLog : TeaModel {
        // access_count
        [NameInMap("access_count")]
        [Validation(Required=false)]
        public long? AccessCount { get; set; }

        // access_alipay_account_count
        [NameInMap("access_alipay_account_count")]
        [Validation(Required=false)]
        public long? AccessAlipayAccountCount { get; set; }

    }

}
