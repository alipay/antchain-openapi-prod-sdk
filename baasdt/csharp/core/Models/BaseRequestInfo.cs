// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP授权服务基础请求信息
    public class BaseRequestInfo : TeaModel {
        // 业务幂等Id,防止同一笔交易重复发送(长度不超过256个字符)
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 支持多链多合约,该参数为指明需要操作哪个智能合约环境(长度不超过50个字符)
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 场景码(入驻时申请)(长度不超过50个字符)
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

    }

}
