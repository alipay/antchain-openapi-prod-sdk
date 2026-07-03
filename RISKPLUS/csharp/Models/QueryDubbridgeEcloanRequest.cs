// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeEcloanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 交易流水号
        [NameInMap("transaction_no")]
        [Validation(Required=true)]
        public string TransactionNo { get; set; }

        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 申请单号
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 页码
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public string PageNo { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public string PageSize { get; set; }

        // 申请人身份证号码
        [NameInMap("applicant_id_no")]
        [Validation(Required=false)]
        public string ApplicantIdNo { get; set; }

        // 企业证件号码 当申请人身份证号码为空时,企业证件号码不允许为空
        [NameInMap("ent_id_no")]
        [Validation(Required=false)]
        public string EntIdNo { get; set; }

    }

}
