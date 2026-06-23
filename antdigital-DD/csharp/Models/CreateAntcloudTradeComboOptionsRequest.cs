// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class CreateAntcloudTradeComboOptionsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 套餐版本唯一版本号
        [NameInMap("combo_vid")]
        [Validation(Required=true)]
        public string ComboVid { get; set; }

        // 销售主体（如 ZL6、ZL7）
        [NameInMap("ou")]
        [Validation(Required=true)]
        public string Ou { get; set; }

        // 购买租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 用户选择的规格配置列表
        [NameInMap("selected_configs")]
        [Validation(Required=true)]
        public List<SelectedConfigItem> SelectedConfigs { get; set; }

        // 请求ID，用于幂等
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 售卖市场，由中台分配
        [NameInMap("sale_market")]
        [Validation(Required=true)]
        public string SaleMarket { get; set; }

    }

}
