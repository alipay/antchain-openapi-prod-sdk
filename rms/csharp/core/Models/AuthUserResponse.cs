// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class AuthUserResponse : TeaModel {
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

        // powers
        [NameInMap("powers")]
        [Validation(Required=false)]
        public List<LongListKeySet> Powers { get; set; }

        // bd_powers
        [NameInMap("bd_powers")]
        [Validation(Required=false)]
        public List<LongListKeySet> BdPowers { get; set; }

        // w_powers
        [NameInMap("w_powers")]
        [Validation(Required=false)]
        public List<LongListKeySet> WPowers { get; set; }

        // t_powers
        [NameInMap("t_powers")]
        [Validation(Required=false)]
        public List<LongListKeySet> TPowers { get; set; }

        // super_admin
        [NameInMap("super_admin")]
        [Validation(Required=false)]
        public bool? SuperAdmin { get; set; }

        // super_view
        [NameInMap("super_view")]
        [Validation(Required=false)]
        public bool? SuperView { get; set; }

        // biz_domains
        [NameInMap("biz_domains")]
        [Validation(Required=false)]
        public List<BizDomain> BizDomains { get; set; }

        // auth_url
        [NameInMap("auth_url")]
        [Validation(Required=false)]
        public string AuthUrl { get; set; }

    }

}
