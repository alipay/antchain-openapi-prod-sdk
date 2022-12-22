// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class QueryCodeCertResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 存证内容。
        // 在注册溯源码、溯源码关联信息等接口调用情况下，上链内容会包装加密后上链。
        // 因此返回内容不可读，需要按照指定要求解密读取。
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 链交易信息
        [NameInMap("chain_transaction_info")]
        [Validation(Required=false)]
        public BlockChainTransactionInfo ChainTransactionInfo { get; set; }

    }

}
