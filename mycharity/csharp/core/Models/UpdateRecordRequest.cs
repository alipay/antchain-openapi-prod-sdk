// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class UpdateRecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=50)]
        public string Id { get; set; }

        // 快递单号，50字符（发放方式（issue_way）为快递寄送时可修改）
        [NameInMap("express_number")]
        [Validation(Required=false, MaxLength=50)]
        public string ExpressNumber { get; set; }

        // 快递公司，50字符（发放方式（issue_way）为快递寄送时可修改）
        [NameInMap("express_company")]
        [Validation(Required=false, MaxLength=50)]
        public string ExpressCompany { get; set; }

        // 快递地址，100字符（发放方式（issue_way）为快递寄送时可修改）
        [NameInMap("express_address")]
        [Validation(Required=false, MaxLength=100)]
        public string ExpressAddress { get; set; }

        // 支付流水号，100字符（实施内容为善款类且执行记录状态为待发放（receive_status）必填）
        [NameInMap("pay_serial_number")]
        [Validation(Required=false, MaxLength=100)]
        public string PaySerialNumber { get; set; }

        // 转账方式，100字符 发放方式为善款类且执行记录状态为待发放（receive_status）必填）
        [NameInMap("transfer_method")]
        [Validation(Required=false, MaxLength=100)]
        public string TransferMethod { get; set; }

    }

}
