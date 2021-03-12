// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDataauthorizationParticipantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账户名称
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // 业务系统唯一标示
        [NameInMap("biz_uid")]
        [Validation(Required=true, MaxLength=64)]
        public string BizUid { get; set; }

        // 区块链ID
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 信用编号
        [NameInMap("credit_number")]
        [Validation(Required=false)]
        public string CreditNumber { get; set; }

        // 扩展参数，标准JSON格式
        [NameInMap("extension_info")]
        [Validation(Required=false, MaxLength=2000)]
        public string ExtensionInfo { get; set; }

        // 用户名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=64)]
        public string Name { get; set; }

        // 回调通知服务地址
        [NameInMap("notification_service")]
        [Validation(Required=false)]
        public string NotificationService { get; set; }

        // did doc中的公开信息
        [NameInMap("public_info")]
        [Validation(Required=false)]
        public string PublicInfo { get; set; }

        // 用户角色列表
        [NameInMap("role")]
        [Validation(Required=true)]
        public List<string> Role { get; set; }

        // 空间ID
        [NameInMap("space_id")]
        [Validation(Required=false)]
        public string SpaceId { get; set; }

    }

}
