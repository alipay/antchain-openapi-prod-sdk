// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ConfirmVcVcrepoVctransmitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求发起者did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // vc_transmit_cnf
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // VC传输确认请求参数
        [NameInMap("payload")]
        [Validation(Required=true)]
        public List<VcTransmitCnf> Payload { get; set; }

        // 签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
