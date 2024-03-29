// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class CreateActivitychainrecordResponse : TeaModel {
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

        // 上链成功后返回，链上hash值
        [NameInMap("chain_hash")]
        [Validation(Required=false)]
        public string ChainHash { get; set; }

        // true表示颁发了徽章，false表示未颁发徽章
        [NameInMap("award_badge_flag")]
        [Validation(Required=false)]
        public bool? AwardBadgeFlag { get; set; }

    }

}
