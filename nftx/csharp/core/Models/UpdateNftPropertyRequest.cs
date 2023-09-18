// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class UpdateNftPropertyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id标识
        [NameInMap("id_no")]
        [Validation(Required=true)]
        public string IdNo { get; set; }

        // 用户id类型
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 资产标识
        [NameInMap("nft_id")]
        [Validation(Required=true)]
        public string NftId { get; set; }

        // 更新的来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // Json字符串：通过解析该字段，根据提前约定的key进行取值操作
        [NameInMap("update_info")]
        [Validation(Required=true)]
        public string UpdateInfo { get; set; }

    }

}
