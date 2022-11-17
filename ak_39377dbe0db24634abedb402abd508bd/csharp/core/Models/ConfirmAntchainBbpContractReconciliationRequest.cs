// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_39377dbe0db24634abedb402abd508bd.Models
{
    public class ConfirmAntchainBbpContractReconciliationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 服务商
        [NameInMap("sup_code")]
        [Validation(Required=true)]
        public string SupCode { get; set; }

        // 确认时间
        [NameInMap("socre_date")]
        [Validation(Required=true)]
        public string SocreDate { get; set; }

        // 确认类型：1、长城  2、服务方
        [NameInMap("confirm_type")]
        [Validation(Required=true)]
        public string ConfirmType { get; set; }

        // 确认者
        [NameInMap("confirmer")]
        [Validation(Required=true)]
        public string Confirmer { get; set; }

        // 认证状态
        [NameInMap("confirm_status")]
        [Validation(Required=true)]
        public string ConfirmStatus { get; set; }

    }

}
