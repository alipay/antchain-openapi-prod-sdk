// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class SyncOfferCommonbuyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id offerCode_yyyyMMddHHm0(最后一位固定为0幂等用，请求10分钟内只能触发一次)
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 需要同步的商品code
        [NameInMap("offer_code")]
        [Validation(Required=true)]
        public string OfferCode { get; set; }

        // 操作人工号
        [NameInMap("request_work_no")]
        [Validation(Required=true)]
        public string RequestWorkNo { get; set; }

        // 商品同步commonBuy的配置列表对应json
        [NameInMap("offer_common_buy_sync_info")]
        [Validation(Required=true)]
        public OfferSyncCommonBuyInfo OfferCommonBuySyncInfo { get; set; }

    }

}
