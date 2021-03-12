// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAmlCorporationJoincommitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 入驻准备阶段得到的数字标识
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 选择采用的TAPP ID编号，如果不填，系统将选择默认的kyc tapp进行执行
        [NameInMap("tapp_id")]
        [Validation(Required=false)]
        public string TappId { get; set; }

        // 对应tapp的版本号。默认选择最新版本
        [NameInMap("tapp_version")]
        [Validation(Required=false)]
        public long? TappVersion { get; set; }

    }

}
