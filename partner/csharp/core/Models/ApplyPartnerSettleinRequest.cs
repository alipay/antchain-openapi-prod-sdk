// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    public class ApplyPartnerSettleinRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户来源-用于租户隔离
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 入驻的一级伙伴类型
        [NameInMap("l1_partner_type")]
        [Validation(Required=true)]
        public string L1PartnerType { get; set; }

        // 入驻的二级合作类型
        [NameInMap("l2_partner_type")]
        [Validation(Required=true)]
        public string L2PartnerType { get; set; }

        // 入驻申请业务单据号-幂等使用
        [NameInMap("business_no")]
        [Validation(Required=true)]
        public string BusinessNo { get; set; }

        // 合作方信息
        [NameInMap("partner_information")]
        [Validation(Required=true)]
        public PartnerInformation PartnerInformation { get; set; }

        // 参与人列表
        [NameInMap("participants")]
        [Validation(Required=true)]
        public List<Participant> Participants { get; set; }

        // 签约请求
        [NameInMap("sign_request")]
        [Validation(Required=true)]
        public SignRequest SignRequest { get; set; }

        // 入驻申请扩展信息
        [NameInMap("extend_info")]
        [Validation(Required=false)]
        public string ExtendInfo { get; set; }

        // 入驻申请时间
        [NameInMap("apply_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ApplyTime { get; set; }

        // 入驻申请类型：新签、改签、续签
        [NameInMap("apply_operate_type")]
        [Validation(Required=true)]
        public string ApplyOperateType { get; set; }

    }

}
