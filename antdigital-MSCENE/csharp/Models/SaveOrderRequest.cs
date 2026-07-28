// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MSCENE.Models
{
    public class SaveOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用ID
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 工作空间ID
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 小游戏ID
        [NameInMap("mini_program_id")]
        [Validation(Required=true)]
        public string MiniProgramId { get; set; }

        // 平台ID
        [NameInMap("platform_id")]
        [Validation(Required=true)]
        public string PlatformId { get; set; }

        // 客户订单号
        [NameInMap("custom_id")]
        [Validation(Required=true)]
        public string CustomId { get; set; }

        // 平台业务订单号
        [NameInMap("biz_order_id")]
        [Validation(Required=true)]
        public string BizOrderId { get; set; }

        // 金额，单位分
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 业务订单状态：
        // 1 - 订单已创建
        // 2 - 支付成功
        // 3 - 支付失败
        [NameInMap("biz_order_status")]
        [Validation(Required=true)]
        public long? BizOrderStatus { get; set; }

        // 开放用户ID
        [NameInMap("open_uid")]
        [Validation(Required=true)]
        public string OpenUid { get; set; }

        // 商品id
        [NameInMap("item_id")]
        [Validation(Required=false)]
        public string ItemId { get; set; }

        // 商品名称
        [NameInMap("item_title")]
        [Validation(Required=false)]
        public string ItemTitle { get; set; }

        // 客户端类型：IOS、ANDROID
        [NameInMap("client_type")]
        [Validation(Required=false)]
        public string ClientType { get; set; }

        // 小游戏客户端透传参数
        [NameInMap("cp_extra")]
        [Validation(Required=false)]
        public string CpExtra { get; set; }

    }

}
