// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerFundmngguaranteeinfoResponse : TeaModel {
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

        // 租户角色
        // ROLE_MERCHANT(0, "商户"),
        // ROLE_FINANCIER(1, "资金方"),
        // ROLE_MIX(2, "商户资金方"),
        // DATA_PROVIDER(3, "数据提供者"),
        // ROLE_GUARANTOR(4, "担保方"),;
        [NameInMap("tenant_role")]
        [Validation(Required=false)]
        public long? TenantRole { get; set; }

        // 担保信息
        [NameInMap("guarantee_info")]
        [Validation(Required=false)]
        public string GuaranteeInfo { get; set; }

    }

}
