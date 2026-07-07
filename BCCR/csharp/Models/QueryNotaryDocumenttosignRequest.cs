// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryNotaryDocumenttosignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请人信息
        [NameInMap("applicant_list")]
        [Validation(Required=true)]
        public List<NotaryUser> ApplicantList { get; set; }

        // 经办人信息
        [NameInMap("agent")]
        [Validation(Required=true)]
        public NotaryUser Agent { get; set; }

        // 送达信息
        [NameInMap("receive_info")]
        [Validation(Required=true)]
        public ReceiveInfo ReceiveInfo { get; set; }

        // 保全内容
        [NameInMap("preservation")]
        [Validation(Required=true)]
        public string Preservation { get; set; }

        // 公证处id
        [NameInMap("org_id")]
        [Validation(Required=true)]
        public string OrgId { get; set; }

    }

}
