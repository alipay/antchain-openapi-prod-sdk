// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class GetMerchantInfoResponse : TeaModel {
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

        // source, 由中台为业务方分配, 标识业务来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 商户支付宝uid
        [NameInMap("merchant_user_id")]
        [Validation(Required=false)]
        public string MerchantUserId { get; set; }

        // 行业商户租户名称
        [NameInMap("merchant_tenant_name")]
        [Validation(Required=false)]
        public string MerchantTenantName { get; set; }

        // 二级商户id, smid, 进件成功才有
        [NameInMap("smid")]
        [Validation(Required=false)]
        public string Smid { get; set; }

    }

}
