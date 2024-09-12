// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNITYCS.Models
{
    public class VerifyDataResponse : TeaModel {
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

        // 核验结果
        [NameInMap("result")]
        [Validation(Required=false)]
        public bool? Result { get; set; }

        // 数据标识
        [NameInMap("attr_identify")]
        [Validation(Required=false)]
        public string AttrIdentify { get; set; }

        // 区块高度
        [NameInMap("block_count")]
        [Validation(Required=false)]
        public long? BlockCount { get; set; }

        // 核验属性集合
        [NameInMap("attrs")]
        [Validation(Required=false)]
        public List<MetaDataAttr> Attrs { get; set; }

    }

}
