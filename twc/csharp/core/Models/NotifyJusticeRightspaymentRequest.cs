// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class NotifyJusticeRightspaymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件维权记录编号
        [NameInMap("record_id")]
        [Validation(Required=true)]
        public long? RecordId { get; set; }

        // 缴费金额(支持两位小数)
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 费用类型(枚举)
        // ARBITRATION: 仲裁案件受理费
        [NameInMap("payment_type")]
        [Validation(Required=true)]
        public string PaymentType { get; set; }

        // 缴费状态(枚举)
        // WAIT_FEE: 待缴费
        // SUCCESS: 成功
        // FAIL: 失败
        [NameInMap("payment_status")]
        [Validation(Required=true)]
        public string PaymentStatus { get; set; }

        // 缴费失败的描述(不是缴费完成时,必填)
        // 不超过500字符
        [NameInMap("payment_remark")]
        [Validation(Required=false)]
        public string PaymentRemark { get; set; }

        // 相关的文件信息列表,示例查看对接文档
        [NameInMap("payment_file_infos")]
        [Validation(Required=false)]
        public List<FileInfo> PaymentFileInfos { get; set; }

        // 缴费账户信息(待缴费时必填),示例查看对接文档
        [NameInMap("payment_info")]
        [Validation(Required=false)]
        public PaymentInfo PaymentInfo { get; set; }

    }

}
