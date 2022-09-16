// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class CreateBatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 分期ID
        [NameInMap("stages_id")]
        [Validation(Required=true)]
        public string StagesId { get; set; }

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

        // 接收验证方式（0扫脸验证、2扫二维码验证, 3快递签收验证，4登录确认）
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

        // 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
        [NameInMap("issue_amount")]
        [Validation(Required=true)]
        public long? IssueAmount { get; set; }

    }

}
