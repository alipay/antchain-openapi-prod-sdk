// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 支付信息
    public class PaymentInfo : TeaModel {
        // 收款账户名称
        [NameInMap("receiver_account_name")]
        [Validation(Required=true, MaxLength=200)]
        public string ReceiverAccountName { get; set; }

        // 收款账户，支付宝账号
        [NameInMap("receiver_account")]
        [Validation(Required=true, MaxLength=50)]
        public string ReceiverAccount { get; set; }

        // 收款账户类型 ,1-个人账号，0-公司账号
        [NameInMap("receiver_account_type")]
        [Validation(Required=true, MaxLength=2)]
        public string ReceiverAccountType { get; set; }

        // 收款人证件号码 ，账户类型为个人时，非空
        [NameInMap("receiver_certificate_no")]
        [Validation(Required=false, MaxLength=50)]
        public string ReceiverCertificateNo { get; set; }

        // 收款人证件类型，01-身份证，02-护照，03-军官证，04-港澳通行证，05-驾驶证，06-港澳回乡证或台胞证，07-临时身份证，99-其他
        [NameInMap("receiver_certificate_type")]
        [Validation(Required=true, MaxLength=2)]
        public string ReceiverCertificateType { get; set; }

    }

}
