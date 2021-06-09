// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateStandardVoucherResponse : TeaModel {
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

        // 凭证返回值_voucherResp
        [NameInMap("voucher_resp")]
        [Validation(Required=true)]
        public VoucherResp VoucherResp { get; set; }

        // 编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 凭证返回值_voucherRespList
        [NameInMap("voucher_resp_list")]
        [Validation(Required=true)]
        public List<VoucherResp> VoucherRespList { get; set; }

    }

}
