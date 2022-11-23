// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateJusticeNormalcaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案由
        [NameInMap("case_reason")]
        [Validation(Required=true)]
        public string CaseReason { get; set; }

        // 业务类型
        // LEASE- 租赁
        // HB_FINANCIAL - HB金融
        [NameInMap("case_type")]
        [Validation(Required=true)]
        public string CaseType { get; set; }

        // 外部业务ID
        [NameInMap("external_biz_id")]
        [Validation(Required=true)]
        public string ExternalBizId { get; set; }

        // 业务描述,用于案件的补充描述; 没有则不填
        [NameInMap("case_desc")]
        [Validation(Required=false)]
        public string CaseDesc { get; set; }

        // 针对对应业务类型的证据要素补充.
        [NameInMap("case_biz_element_info")]
        [Validation(Required=false)]
        public string CaseBizElementInfo { get; set; }

        // 当事人(申请人)ID, 案件填充信息返回
        [NameInMap("party_id")]
        [Validation(Required=true)]
        public long? PartyId { get; set; }

        // 答辩人类型, 目前仅支持个人.
        // PERSON , 个人
        // ORG , 机构
        [NameInMap("pleader_type")]
        [Validation(Required=false)]
        public string PleaderType { get; set; }

        // 答辩人(自然人)信息, 类型为个人时必填
        [NameInMap("pleader_person_info")]
        [Validation(Required=false)]
        public JudicialPersonInfo PleaderPersonInfo { get; set; }

        // 是否使用模板
        [NameInMap("use_template")]
        [Validation(Required=false)]
        public bool? UseTemplate { get; set; }

        // 使用模板时必填，根据案件要素模板对应提供要素信息
        [NameInMap("business_info")]
        [Validation(Required=false)]
        public string BusinessInfo { get; set; }

    }

}
