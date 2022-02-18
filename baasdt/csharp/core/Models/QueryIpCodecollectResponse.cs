// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpCodecollectResponse : TeaModel {
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

        // 数字凭证商品信息配置列表,包含产品名和出品方
        [NameInMap("goods_info_list")]
        [Validation(Required=false)]
        public List<IPCodeGoodsInfo> GoodsInfoList { get; set; }

        // 数字凭证流转信息
        [NameInMap("code_flow_list")]
        [Validation(Required=false)]
        public List<IPCodeFlowInfo> CodeFlowList { get; set; }

        // 数字凭证生命周期
        [NameInMap("code_life_circle")]
        [Validation(Required=false)]
        public IPCodeConfigTimeInfo CodeLifeCircle { get; set; }

        // 区块链信息
        [NameInMap("chain_info")]
        [Validation(Required=false)]
        public IPCodeChainInfo ChainInfo { get; set; }

        // 版权信息
        [NameInMap("ipowner_info")]
        [Validation(Required=false)]
        public IPCodeIpOwnerInfo IpownerInfo { get; set; }

    }

}
