// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class ApplyNftTransferbyprojectwithchanneltenantRequest : TeaModel {
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
        [NameInMap("to_id_no")]
        [Validation(Required=true)]
        public string ToIdNo { get; set; }

        // 账号类型，当前只支持支付宝账号
        [NameInMap("to_id_type")]
        [Validation(Required=true)]
        public string ToIdType { get; set; }

        // 交易NFT时租户的唯一订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 购买NFT的金额，单位分
        [NameInMap("price_cent")]
        [Validation(Required=false)]
        public long? PriceCent { get; set; }

        // 渠道租户
        [NameInMap("channel_tenant")]
        [Validation(Required=true)]
        public string ChannelTenant { get; set; }

    }

}
