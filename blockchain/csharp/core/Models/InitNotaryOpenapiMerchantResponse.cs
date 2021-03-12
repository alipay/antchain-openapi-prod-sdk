// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitNotaryOpenapiMerchantResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 本次认证的唯一标识，商户需要记录，后续的操作都需要用到
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 生成的认证地址，需要转换成二维码通过支付宝APP打开
        [NameInMap("verify_url")]
        [Validation(Required=false)]
        public string VerifyUrl { get; set; }

    }

}
