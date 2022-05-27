// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CallbackArbitrationSignstatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件号
        [NameInMap("case_no")]
        [Validation(Required=true)]
        public string CaseNo { get; set; }

        // 签署文件代码 01 申请书 04 撤案申请书
        [NameInMap("doc_code")]
        [Validation(Required=true)]
        public string DocCode { get; set; }

        // 处理结果码 10000成功 其余都是签署失败
        [NameInMap("res_code")]
        [Validation(Required=true)]
        public string ResCode { get; set; }

        // 失败原因
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 发送时间 yyyy-MM-dd
        [NameInMap("send_time")]
        [Validation(Required=true)]
        public string SendTime { get; set; }

        // 签名,采用公钥验签
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
