// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CloseChainServiceResponse : TeaModel {
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

        // 服务关闭受理状态： UN_OPEN(0, "product.status.unopen"), INIT(1, "product.status.init"), OPEN(2, "product.status.open"), CLOSE(3, "product.status.close"), UNKNOWN(4, "product.status.unknown"), STOP(5, "product.status.stop");
        [NameInMap("result")]
        [Validation(Required=false)]
        public long? Result { get; set; }

    }

}
