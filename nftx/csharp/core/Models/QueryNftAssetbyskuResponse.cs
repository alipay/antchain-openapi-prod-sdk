// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class QueryNftAssetbyskuResponse : TeaModel {
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

        // 用户资产列表信息
        [NameInMap("asset_list")]
        [Validation(Required=false)]
        public List<UserAsset> AssetList { get; set; }

        // 支付宝账户id，特殊场景返回
        [NameInMap("alipay_uid")]
        [Validation(Required=false)]
        public string AlipayUid { get; set; }

    }

}
