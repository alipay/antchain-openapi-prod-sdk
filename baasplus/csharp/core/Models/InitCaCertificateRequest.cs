// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class InitCaCertificateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务唯一性uuid，用于后续的证书查询
        [NameInMap("biz_uuid")]
        [Validation(Required=true)]
        public string BizUuid { get; set; }

        // 证书请求(CSR)
        [NameInMap("command")]
        [Validation(Required=true)]
        public string Command { get; set; }

        // 8B75D2EEDF1658CC9C1B7C05AA600856  区块链-baasplus平台对外持牌证书服务场景
        // 2D25EFFD786590991542CAE2D14CB18E   区块链-baasplus平台对外非持牌证书服务场景
        [NameInMap("config_id")]
        [Validation(Required=true)]
        public string ConfigId { get; set; }

    }

}
