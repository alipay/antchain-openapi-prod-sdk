// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class BatchcreateTransferRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产id列表
        [NameInMap("asset_id_list")]
        [Validation(Required=true)]
        public List<string> AssetIdList { get; set; }

        // 接收人id
        [NameInMap("transferee")]
        [Validation(Required=true)]
        public string Transferee { get; set; }

        // 转让金额
        [NameInMap("monetary_amount")]
        [Validation(Required=true)]
        public string MonetaryAmount { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
