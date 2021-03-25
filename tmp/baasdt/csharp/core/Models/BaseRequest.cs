// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 消费卡服务基础请求信息
    public class BaseRequest : TeaModel {
        // 用户的链上账户Id(长度不超过256个字符)
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 业务幂等Id,防止同一笔交易重复发送(长度不超过256个字符)
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 支持多链多合约,该参数为指明需要操作哪个智能合约环境(长度不超过50个字符)
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 备注信息(不要超过500个字符)。
        // 部分接口要求memo必填，以接口返回信息为准。
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 场景码(入驻时申请)(长度不超过50个字符)
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

    }

}
