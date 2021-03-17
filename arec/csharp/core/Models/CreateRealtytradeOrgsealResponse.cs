// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class CreateRealtytradeOrgsealResponse : TeaModel {
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

        // 企业印章 ID
        [NameInMap("org_seal_id")]
        [Validation(Required=false)]
        public string OrgSealId { get; set; }

        // 印章图片下载URL地址，1个小时内有效
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
