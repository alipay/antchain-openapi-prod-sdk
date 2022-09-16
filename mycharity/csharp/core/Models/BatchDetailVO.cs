// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    // 批次详情
    public class BatchDetailVO : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 实施内容id
        [NameInMap("combination_id")]
        [Validation(Required=true)]
        public string CombinationId { get; set; }

        // 批次名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 备注
        [NameInMap("remarks")]
        [Validation(Required=true)]
        public string Remarks { get; set; }

        // 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式】
        [NameInMap("issue_way")]
        [Validation(Required=true)]
        public long? IssueWay { get; set; }

        // 确认接收人 0发前确认 1发后确认
        [NameInMap("affirmance_receivers")]
        [Validation(Required=true)]
        public long? AffirmanceReceivers { get; set; }

        // 接收方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3直接导入
        [NameInMap("receive_check_way")]
        [Validation(Required=true)]
        public long? ReceiveCheckWay { get; set; }

        // 发放数量
        [NameInMap("issue_amount")]
        [Validation(Required=true)]
        public long? IssueAmount { get; set; }

    }

}
