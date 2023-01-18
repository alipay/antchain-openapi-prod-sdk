// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class QueryMiniCodeResponse : TeaModel {
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

        // 首次扫描信息
        [NameInMap("scan_info")]
        [Validation(Required=false)]
        public ScanHeadInfo ScanInfo { get; set; }

        // 商品信息
        [NameInMap("product_info")]
        [Validation(Required=false)]
        public ProudctInfo ProductInfo { get; set; }

        // 溯源环节信息列表
        [NameInMap("phase_infos")]
        [Validation(Required=false)]
        public List<PhaseInfo> PhaseInfos { get; set; }

    }

}
