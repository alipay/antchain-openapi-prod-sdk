// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractMerchantindirectzftResponse : TeaModel {
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

        // 错误状态码，0表示成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 错误信息描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 额外信息，包含smid
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 支付宝的ipRoleId
        [NameInMap("ip_role_id")]
        [Validation(Required=false)]
        public List<string> IpRoleId { get; set; }

        // 申请时间
        [NameInMap("apply_id")]
        [Validation(Required=false)]
        public string ApplyId { get; set; }

        // 商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 直付通商户进件的状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 支付宝返回的错误状态码
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 支付宝返回的错误信息描述
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
