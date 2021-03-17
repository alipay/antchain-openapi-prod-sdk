// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class CreateRealtytradeOrgRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 公司名称的全称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 机构证件类型，默认为：CRED_ORG_USCC（统一社会信用代码），证件类型详见 https://tech.antfin.com/docs/2/155166
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 证件类型对应的证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 经办人的证件类型，默认为身份证，值为：CRED_PSN_CH_IDCARD
        [NameInMap("manager_cert_type")]
        [Validation(Required=false)]
        public string ManagerCertType { get; set; }

        // 经办人的证件号码
        // 
        // 
        [NameInMap("manager_cert_no")]
        [Validation(Required=true)]
        public string ManagerCertNo { get; set; }

        // 经办人的姓名
        // 
        // 
        [NameInMap("manager_name")]
        [Validation(Required=true)]
        public string ManagerName { get; set; }

    }

}
