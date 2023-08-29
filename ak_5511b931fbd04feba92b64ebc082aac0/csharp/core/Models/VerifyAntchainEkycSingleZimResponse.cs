// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5511b931fbd04feba92b64ebc082aac0.Models
{
    public class VerifyAntchainEkycSingleZimResponse : TeaModel {
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

        // 预留扩展结果
        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public string ExtParams { get; set; }

        // 产品返回明细码
        [NameInMap("product_ret_code")]
        [Validation(Required=false)]
        public string ProductRetCode { get; set; }

        // 验证返回明细码
        [NameInMap("validation_ret_code")]
        [Validation(Required=false)]
        public string ValidationRetCode { get; set; }

        // 明细返回码
        [NameInMap("ret_code_sub")]
        [Validation(Required=false)]
        public string RetCodeSub { get; set; }

        // 明细返回码对应的文案
        [NameInMap("ret_message_sub")]
        [Validation(Required=false)]
        public string RetMessageSub { get; set; }

    }

}
