// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class RegisterCdsqScratchesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 平台名称
        [NameInMap("partner_code")]
        [Validation(Required=true)]
        public string PartnerCode { get; set; }

        // 交易流水号
        [NameInMap("transaction_no")]
        [Validation(Required=true)]
        public string TransactionNo { get; set; }

        // 用户ID
        [NameInMap("userid")]
        [Validation(Required=false)]
        public string Userid { get; set; }

        // 购买时间
        [NameInMap("buytime")]
        [Validation(Required=false)]
        public string Buytime { get; set; }

        // 车牌号
        [NameInMap("car_no")]
        [Validation(Required=true)]
        public string CarNo { get; set; }

        // 停车地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
