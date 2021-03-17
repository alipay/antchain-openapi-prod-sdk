// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 不动产中心
    public class RealtyCenter : TeaModel {
        // 不动产中心地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 不动产中心名称 
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 外部不动产中心编号(不动产中心提供)
        [NameInMap("out_rtc_no")]
        [Validation(Required=false)]
        public string OutRtcNo { get; set; }

        // 蚂蚁链身份id
        [NameInMap("pdn_did")]
        [Validation(Required=false)]
        public string PdnDid { get; set; }

        // 公钥
        [NameInMap("pub_key")]
        [Validation(Required=false)]
        public string PubKey { get; set; }

        // 不动产中心编号
        [NameInMap("rtc_no")]
        [Validation(Required=false)]
        public string RtcNo { get; set; }

    }

}
