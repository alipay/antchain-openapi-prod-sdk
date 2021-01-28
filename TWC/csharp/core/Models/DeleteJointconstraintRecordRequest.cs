// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class DeleteJointconstraintRecordRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合同编号
        // 
        // 
        [NameInMap("contract_code")]
        [Validation(Required=true)]
        public string ContractCode { get; set; }

        // 合同履行记录标签
        // 
        // 
        [NameInMap("contract_fulfillment_code")]
        [Validation(Required=true)]
        public string ContractFulfillmentCode { get; set; }

        // 应付方证件号码
        // 
        // 
        [NameInMap("payer_cert_number")]
        [Validation(Required=true)]
        public string PayerCertNumber { get; set; }

        // 应付方证件类型
        // 
        // 0：统一社会信用代码
        // 
        // 1：身份证号码
        [NameInMap("payer_cert_type")]
        [Validation(Required=true)]
        public long? PayerCertType { get; set; }

        // 应付方类型
        // 
        // 0：企业
        // 
        // 1：个人
        [NameInMap("payer_type")]
        [Validation(Required=true)]
        public long? PayerType { get; set; }

    }

}
