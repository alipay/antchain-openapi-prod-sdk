// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateCreditCommonsignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账户号，account_type=ACCOUNT_BANK_NO时填写外部银行卡号， account_type=ACCOUNT_CLOUD_FUND时填写云资金商户ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 账户类型，ACCOUNT_BANK_NO:外部银行卡，ACCOUNT_CLOUD_FUND:云资金商户ID
        [NameInMap("account_type")]
        [Validation(Required=true)]
        public string AccountType { get; set; }

        // 开户行联行号，当帐户类型为ACCOUNT_BANK_NO时必填
        [NameInMap("bank_cnaps")]
        [Validation(Required=false)]
        public string BankCnaps { get; set; }

        // 开户行名称，当帐户类型为ACCOUNT_BANK_NO时必填
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 签约结果回调地址
        [NameInMap("callback_url")]
        [Validation(Required=true)]
        public string CallbackUrl { get; set; }

        // 驾驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
        [NameInMap("driving_license")]
        [Validation(Required=false)]
        public string DrivingLicense { get; set; }

        // 驾驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
        [NameInMap("driving_license_file_id")]
        [Validation(Required=false)]
        public string DrivingLicenseFileId { get; set; }

        // 集团平台did
        [NameInMap("group_platform_did")]
        [Validation(Required=true)]
        public string GroupPlatformDid { get; set; }

        // 法定代表人名称，签约方sign_did类型为企业时必填
        [NameInMap("legal_name")]
        [Validation(Required=false)]
        public string LegalName { get; set; }

        // 产品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 签约方did
        [NameInMap("sign_did")]
        [Validation(Required=true)]
        public string SignDid { get; set; }

        // 行驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
        [NameInMap("vehicle_license")]
        [Validation(Required=false)]
        public string VehicleLicense { get; set; }

        // 行驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
        [NameInMap("vehicle_license_file_id")]
        [Validation(Required=false)]
        public string VehicleLicenseFileId { get; set; }

    }

}
