// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryPfFinancingqualificationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("client_no")]
        [Validation(Required=true)]
        public string ClientNo { get; set; }

        // 融资主体did
        [NameInMap("financing_subject_did")]
        [Validation(Required=true)]
        public string FinancingSubjectDid { get; set; }

        // 借款人证件类型
        [NameInMap("borrower_card_type")]
        [Validation(Required=true)]
        public string BorrowerCardType { get; set; }

        // 借款人证件号码
        // 
        // 
        [NameInMap("borrower_card_no")]
        [Validation(Required=true)]
        public string BorrowerCardNo { get; set; }

        // 申请流水号
        [NameInMap("apl_seq_no")]
        [Validation(Required=true)]
        public string AplSeqNo { get; set; }

    }

}
