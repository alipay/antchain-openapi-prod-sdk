// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class RegisterCdsqTireinsuranceRequest : TeaModel {
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

        // 方案名称
        // 代步车+置换、轮
        // 胎险+置换、代步
        // 车、四轮轮胎险、
        // 置换、二轮轮胎险
        [NameInMap("scheme_name")]
        [Validation(Required=true)]
        public string SchemeName { get; set; }

        // 购买时间
        [NameInMap("buytime")]
        [Validation(Required=false)]
        public string Buytime { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
