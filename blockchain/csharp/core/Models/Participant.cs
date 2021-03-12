// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 授权服务参与方结构体
    public class Participant : TeaModel {
        // 业务系统唯一标示
        [NameInMap("biz_uid")]
        [Validation(Required=false, MaxLength=64)]
        public string BizUid { get; set; }

        // 区块链ID
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 信用代码
        [NameInMap("credit_number")]
        [Validation(Required=false)]
        public string CreditNumber { get; set; }

        // 扩展信息，标准JSON格式
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 参与方名字
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=64)]
        public string Name { get; set; }

        // 回调通知服务地址
        [NameInMap("notification_service")]
        [Validation(Required=false)]
        public string NotificationService { get; set; }

        // 参与方ID
        [NameInMap("participant_id")]
        [Validation(Required=true, MaxLength=100)]
        public string ParticipantId { get; set; }

        // DID  doc中的公开信息
        [NameInMap("public_info")]
        [Validation(Required=false)]
        public string PublicInfo { get; set; }

        // 参与方角色列表
        [NameInMap("role")]
        [Validation(Required=true)]
        public List<string> Role { get; set; }

        // 空间ID
        [NameInMap("space_id")]
        [Validation(Required=false)]
        public string SpaceId { get; set; }

        // 参与方状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

        // 账户名称
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

    }

}
