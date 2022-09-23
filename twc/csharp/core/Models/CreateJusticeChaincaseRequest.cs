// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateJusticeChaincaseRequest : TeaModel {
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
        // HB_FINANCIAL - HB金融,其他不支持
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

        // 当事人(申请人)ID, 案件填充信息返回
        [NameInMap("party_id")]
        [Validation(Required=true)]
        public long? PartyId { get; set; }

        // 全流程存证信息
        [NameInMap("notary_flow_infos")]
        [Validation(Required=true)]
        public List<NotaryFlowDetailQueryReq> NotaryFlowInfos { get; set; }

    }

}
