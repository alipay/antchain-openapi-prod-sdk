// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryMypointsOrderinstructionResponse : TeaModel {
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

        // 订单ID(env+chain_id+tenant_id+sku_id+biz_id)
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 预下单ID
        [NameInMap("pre_order_id")]
        [Validation(Required=false)]
        public string PreOrderId { get; set; }

        // 包含集分宝数量(个)
        [NameInMap("sku_amount")]
        [Validation(Required=false)]
        public long? SkuAmount { get; set; }

        // SKU ID
        [NameInMap("sku_id")]
        [Validation(Required=false)]
        public string SkuId { get; set; }

        // 面值
        [NameInMap("sku_value")]
        [Validation(Required=false)]
        public string SkuValue { get; set; }

        // 状态(0:初始,1:失败可重试,2:失败不可重试,3:成功)
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 商家在金融云的租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
