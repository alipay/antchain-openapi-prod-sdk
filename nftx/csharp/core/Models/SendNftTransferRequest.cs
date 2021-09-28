// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class SendNftTransferRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // NFT租户下唯一的项目编号
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 支付宝2088开头账号
        [NameInMap("told_no")]
        [Validation(Required=true)]
        public string ToldNo { get; set; }

        // 账号类型，当前只支持支付宝账号
        [NameInMap("told_type")]
        [Validation(Required=true)]
        public string ToldType { get; set; }

        // 购买NFT的金额，单位分
        [NameInMap("price_cent")]
        [Validation(Required=true)]
        public long? PriceCent { get; set; }

        // 交易NFT时租户的唯一订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 用户购买订单时间
        [NameInMap("order_time")]
        [Validation(Required=true)]
        public string OrderTime { get; set; }

    }

}
