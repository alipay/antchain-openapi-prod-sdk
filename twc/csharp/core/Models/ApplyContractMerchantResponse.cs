// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyContractMerchantResponse : TeaModel {
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

        // 是否进件成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 进件子结果码，0 成功，1 代理商户已进件，2 商户已进件，请走挂接接口进行代理商挂接，3 商户进件中
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public long? SubCode { get; set; }

        // 进件失败原因
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

        // 已进件商户信息（当cert_no对应的商户已经进件过，会返回完整的已进件的商户信息）
        [NameInMap("merchant_info")]
        [Validation(Required=false)]
        public string MerchantInfo { get; set; }

        // 已进件成功的商户ID（当cert_no表示的商户已经进件过，会返回进件生成的商户ID）
        [NameInMap("smid")]
        [Validation(Required=false)]
        public string Smid { get; set; }

        // 订单ID
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

    }

}
