// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadCreditIssuebatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批次id
        [NameInMap("batch_id")]
        [Validation(Required=true)]
        public string BatchId { get; set; }

        // 回调地址
        [NameInMap("callback_url")]
        [Validation(Required=true)]
        public string CallbackUrl { get; set; }

        // 凭证发行方did
        [NameInMap("create_did")]
        [Validation(Required=true)]
        public string CreateDid { get; set; }

        // 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
        [NameInMap("easy_finance")]
        [Validation(Required=false)]
        public bool? EasyFinance { get; set; }

        // 凭证到期时间
        [NameInMap("expire_date")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

        // 支付单运费总额，运费最多精确到小数点后2位
        [NameInMap("freight")]
        [Validation(Required=true)]
        public string Freight { get; set; }

        // 集团平台did
        [NameInMap("group_platform_did")]
        [Validation(Required=true)]
        public string GroupPlatformDid { get; set; }

        // 全局业务唯一编号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 支付订单号
        [NameInMap("pay_order")]
        [Validation(Required=true)]
        public string PayOrder { get; set; }

        // 产品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 凭证接收方did
        [NameInMap("receive_did")]
        [Validation(Required=true)]
        public string ReceiveDid { get; set; }

        // 运单合并列表
        [NameInMap("waybill_ids")]
        [Validation(Required=true)]
        public List<string> WaybillIds { get; set; }

    }

}
