// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryEnterpriseBaseinfoResponse : TeaModel {
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

        // 企业信用编码
        [NameInMap("ep_code")]
        [Validation(Required=false)]
        public string EpCode { get; set; }

        // 企业名称
        [NameInMap("ep_name")]
        [Validation(Required=false)]
        public string EpName { get; set; }

        // 企业法人名称
        [NameInMap("legal_person_name")]
        [Validation(Required=false)]
        public string LegalPersonName { get; set; }

    }

}
