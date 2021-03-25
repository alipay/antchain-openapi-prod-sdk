// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UploadIpAuthtradesalesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 上传记录的用户的链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // true 只上链不走真实支付，false 上链并链下真实支付账单
        [NameInMap("only_call_blockchain")]
        [Validation(Required=true)]
        public bool? OnlyCallBlockchain { get; set; }

        // 授权佣金比例
        [NameInMap("auth_rate")]
        [Validation(Required=true)]
        public string AuthRate { get; set; }

        // 本次结算周期开始时间
        [NameInMap("settlement_begin_time")]
        [Validation(Required=true)]
        public long? SettlementBeginTime { get; set; }

        // 本次结算周期结束时间
        [NameInMap("settlement_end_time")]
        [Validation(Required=true)]
        public long? SettlementEndTime { get; set; }

        // 终端商品销售数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 销售金额
        [NameInMap("sales")]
        [Validation(Required=true)]
        public string Sales { get; set; }

        // 实付金额
        [NameInMap("payment")]
        [Validation(Required=true)]
        public string Payment { get; set; }

        // 商品信息
        [NameInMap("goods_info")]
        [Validation(Required=true)]
        public string GoodsInfo { get; set; }

        // 数据上传操作者
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

    }

}
