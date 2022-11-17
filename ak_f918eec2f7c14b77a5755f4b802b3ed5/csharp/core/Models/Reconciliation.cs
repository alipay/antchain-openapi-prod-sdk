// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_f918eec2f7c14b77a5755f4b802b3ed5.Models
{
    // 对账单
    public class Reconciliation : TeaModel {
        // 供应商
        [NameInMap("sup_code")]
        [Validation(Required=true)]
        public string SupCode { get; set; }

        // 供应商名称
        [NameInMap("sup_name")]
        [Validation(Required=true)]
        public string SupName { get; set; }

        // 结算金额(单位分)
        [NameInMap("settlement_amount")]
        [Validation(Required=true)]
        public long? SettlementAmount { get; set; }

        // 长城确认时间
        [NameInMap("confirm_date_gw")]
        [Validation(Required=true)]
        public string ConfirmDateGw { get; set; }

        // 长城方确认人
        [NameInMap("confirmer_gw")]
        [Validation(Required=true)]
        public string ConfirmerGw { get; set; }

        // 长城确认状态
        [NameInMap("confirm_state_gw")]
        [Validation(Required=true)]
        public string ConfirmStateGw { get; set; }

        // 服务方确认时间
        [NameInMap("confirm_date_sup")]
        [Validation(Required=true)]
        public string ConfirmDateSup { get; set; }

        // 服务方确认人
        [NameInMap("confirmer_sup")]
        [Validation(Required=true)]
        public string ConfirmerSup { get; set; }

        // 服务方确认状态
        [NameInMap("confirm_state_sup")]
        [Validation(Required=true)]
        public string ConfirmStateSup { get; set; }

        // 计算时间
        [NameInMap("socre_date")]
        [Validation(Required=true)]
        public string SocreDate { get; set; }

    }

}
