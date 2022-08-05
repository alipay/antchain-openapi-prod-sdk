// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class QueryEnterpriseBusinessinfoResponse : TeaModel {
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

        // 签名之后的结果
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 国民经济行业代码
        [NameInMap("industry_code")]
        [Validation(Required=false)]
        public string IndustryCode { get; set; }

        // 国民经济行业名称
        [NameInMap("industry_name")]
        [Validation(Required=false)]
        public string IndustryName { get; set; }

        // 行业门类代码
        [NameInMap("industry_phy_code")]
        [Validation(Required=false)]
        public string IndustryPhyCode { get; set; }

        // 行业门类名称
        [NameInMap("industry_phy_name")]
        [Validation(Required=false)]
        public string IndustryPhyName { get; set; }

    }

}
