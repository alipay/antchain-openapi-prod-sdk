// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    public class CreateExpenditureProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户来源-用于租户间功能和数据隔离
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 合作计划id
        [NameInMap("cooperation_plan_id")]
        [Validation(Required=true)]
        public long? CooperationPlanId { get; set; }

        // 业务单据号-用于幂等
        [NameInMap("business_no")]
        [Validation(Required=true)]
        public string BusinessNo { get; set; }

        // 合作方-用户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 参与人列表
        [NameInMap("participants")]
        [Validation(Required=true)]
        public List<Participant> Participants { get; set; }

        // 支出配置单请求信息
        [NameInMap("expenditure_quotation_request")]
        [Validation(Required=true)]
        public ExpenditureQuotationRequest ExpenditureQuotationRequest { get; set; }

        // 签约请求
        [NameInMap("sign_request")]
        [Validation(Required=true)]
        public SignRequest SignRequest { get; set; }

        // 结算请求
        [NameInMap("settlement_request")]
        [Validation(Required=true)]
        public SettlementRequest SettlementRequest { get; set; }

        // 生效时间
        [NameInMap("valid_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ValidTime { get; set; }

        // 失效时间
        [NameInMap("invalid_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InvalidTime { get; set; }

        // 扩展信息
        [NameInMap("extend_info")]
        [Validation(Required=true)]
        public string ExtendInfo { get; set; }

    }

}
