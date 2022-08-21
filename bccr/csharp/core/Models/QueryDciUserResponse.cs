// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDciUserResponse : TeaModel {
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

        // dci用户id
        [NameInMap("dci_user_id")]
        [Validation(Required=false)]
        public string DciUserId { get; set; }

        // dci用户状态
        [NameInMap("dci_user_status")]
        [Validation(Required=false)]
        public string DciUserStatus { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 证件类型
        [NameInMap("certificate_type")]
        [Validation(Required=false)]
        public string CertificateType { get; set; }

        // 证件号
        [NameInMap("certificate_number")]
        [Validation(Required=false)]
        public string CertificateNumber { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 证件有效期开始时间
        [NameInMap("cert_start_time")]
        [Validation(Required=false)]
        public string CertStartTime { get; set; }

        // 证件有效期结束时间
        [NameInMap("cert_end_time")]
        [Validation(Required=false)]
        public string CertEndTime { get; set; }

        // 法人名称
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

    }

}
