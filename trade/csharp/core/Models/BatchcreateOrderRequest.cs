// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class BatchcreateOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        //  批量下单场景编码 BatchOrderSceneEnum.online_acboss.getCode()
        [NameInMap("batch_order_scene")]
        [Validation(Required=true)]
        public string BatchOrderScene { get; set; }

        //  批量下单批次号
        [NameInMap("batch_order_bsn_no")]
        [Validation(Required=true)]
        public string BatchOrderBsnNo { get; set; }

        // 销售市场 com.antgroup.actradeprod.common.service.model.order.enums.SaleMarketEnum
        [NameInMap("sale_market")]
        [Validation(Required=true)]
        public string SaleMarket { get; set; }

        // 租户Id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 租户名称
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 操作人ID，不填则默认和租户ID一致
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        // 支付选项
        [NameInMap("pay_options")]
        [Validation(Required=false)]
        public PayOptions PayOptions { get; set; }

        // 商品实例列表
        [NameInMap("commodity_instance_list")]
        [Validation(Required=true)]
        public List<CommodityInstance> CommodityInstanceList { get; set; }

        // 扩展属性，JSON字符串
        [NameInMap("extended_properties")]
        [Validation(Required=true)]
        public string ExtendedProperties { get; set; }

    }

}
