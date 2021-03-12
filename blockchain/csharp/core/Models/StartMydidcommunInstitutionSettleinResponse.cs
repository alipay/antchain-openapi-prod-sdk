// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunInstitutionSettleinResponse : TeaModel {
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

        // 机构入驻后，会为其分配唯一的区块链数字身份，这里是数字身份的ID，后续接口都需要用这个id作为参数
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 是对数字身份did的描述，主要包括通讯公钥，和恢复公钥，以及会调url
        [NameInMap("doc")]
        [Validation(Required=false)]
        public string Doc { get; set; }

    }

}
