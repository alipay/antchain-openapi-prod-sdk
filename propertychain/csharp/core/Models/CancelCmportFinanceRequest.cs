// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class CancelCmportFinanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 平台融资编号
        [NameInMap("financial_no")]
        [Validation(Required=true)]
        public string FinancialNo { get; set; }

        // 融资企业编码
        [NameInMap("company_code")]
        [Validation(Required=true)]
        public string CompanyCode { get; set; }

        // 融资企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 撤销申请日期
        [NameInMap("cancel_apply_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CancelApplyDate { get; set; }

        // 撤销申请描述
        [NameInMap("cancel_apply_desc")]
        [Validation(Required=true)]
        public string CancelApplyDesc { get; set; }

        //  融资状态:
        // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
        [NameInMap("financial_status")]
        [Validation(Required=true)]
        public long? FinancialStatus { get; set; }

        // 上链账户
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 联盟id
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public long? UnionId { get; set; }

        // Channel 名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

    }

}
