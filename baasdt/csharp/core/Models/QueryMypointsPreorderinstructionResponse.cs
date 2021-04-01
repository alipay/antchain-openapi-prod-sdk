// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryMypointsPreorderinstructionResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 业务请求单号
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 商家的预算库代码
        [NameInMap("budget_code")]
        [Validation(Required=false)]
        public string BudgetCode { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=false)]
        public string ChainId { get; set; }

        // 环境标识
        [NameInMap("env")]
        [Validation(Required=false)]
        public string Env { get; set; }

        // 扩展信息
        [NameInMap("extend_info")]
        [Validation(Required=false)]
        public string ExtendInfo { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 商家在支付宝域的标识
        [NameInMap("pid")]
        [Validation(Required=false)]
        public string Pid { get; set; }

        // 集分宝产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 集分宝SKU预下单ID
        [NameInMap("pre_order_id")]
        [Validation(Required=false)]
        public string PreOrderId { get; set; }

        // 订单中剩余的可下单商品数量
        [NameInMap("remain_count")]
        [Validation(Required=false)]
        public long? RemainCount { get; set; }

        // 包含集分宝数量(个)
        [NameInMap("sku_amount")]
        [Validation(Required=false)]
        public long? SkuAmount { get; set; }

        // 集分宝SKU的ID
        [NameInMap("sku_id")]
        [Validation(Required=false)]
        public string SkuId { get; set; }

        // SKU面值
        [NameInMap("sku_value")]
        [Validation(Required=false)]
        public string SkuValue { get; set; }

        // 流水状态(0初始状态, 1采购失败可重试, 2采购失败不可重试, 3采购成功, 4预算库创建失败可重试, 5预算库创建失败不可重试, 6预算库叉棍见成功, 7预算调拨失败可重试, 8预算库调拨失败不可重试, 9预算库调拨成功)
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 商户在金融云的租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 总下单集分宝数量
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 集分宝SKU的预下单数量
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 总下单金额
        [NameInMap("total_value")]
        [Validation(Required=false)]
        public string TotalValue { get; set; }

    }

}
