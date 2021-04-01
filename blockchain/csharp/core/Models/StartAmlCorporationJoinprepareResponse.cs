// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAmlCorporationJoinprepareResponse : TeaModel {
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

        // 企业在反洗钱联盟中的唯一区块链标示，后续和平台的交互都要通过该标示
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // mytf的认证信息，加盟方可以验证其有效性
        [NameInMap("mytf_info")]
        [Validation(Required=false)]
        public string MytfInfo { get; set; }

        // 平台提供的各类tapp信息，入驻方需要从中选择自己使用的tapp，并记录下tapp的加密私钥和签名密钥；后续平台发给加盟放的所有信息都会携带签名；而所有发往TAPP的数据都需要使用对应加密公钥进行加密来保证数据安全
        [NameInMap("tapp_infos")]
        [Validation(Required=false)]
        public List<string> TappInfos { get; set; }

    }

}
