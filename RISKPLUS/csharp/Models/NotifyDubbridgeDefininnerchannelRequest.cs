// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class NotifyDubbridgeDefininnerchannelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用流水
        [NameInMap("seq_no")]
        [Validation(Required=true)]
        public string SeqNo { get; set; }

        // 机构平台接口名
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // 机构编号
        [NameInMap("inst_member_code")]
        [Validation(Required=true)]
        public string InstMemberCode { get; set; }

        // 业务参数Json
        [NameInMap("biz_param")]
        [Validation(Required=true)]
        public string BizParam { get; set; }

    }

}
