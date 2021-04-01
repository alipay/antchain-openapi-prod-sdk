// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidCertificationFourmetaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 银行卡号
        // 
        [NameInMap("bank_card")]
        [Validation(Required=true)]
        public string BankCard { get; set; }

        // 身份证号码
        // 
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证书的subject did
        // 
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 手机号码
        // 
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 姓名
        // 
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
