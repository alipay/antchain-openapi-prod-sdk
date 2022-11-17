// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 收件人信息
    public class DeliveryInfo : TeaModel {
        // 收件人姓名
        [NameInMap("receive_name")]
        [Validation(Required=true)]
        public string ReceiveName { get; set; }

        // 联系电话
        [NameInMap("contact")]
        [Validation(Required=true)]
        public string Contact { get; set; }

        // 省（需要接收纸质文件时必填）
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

        // 市（需要接收纸质文件时必填）
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 区（需要接收纸质文件时必填）
        [NameInMap("area")]
        [Validation(Required=false)]
        public string Area { get; set; }

        // 详细地址（需要接收纸质文件时必填）
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 电子邮箱（需要接收电子文件时必填）
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

    }

}
