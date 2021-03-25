// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 见证流程签署数据
    public class WitnessSignData : TeaModel {
        // 印章图片fileKey列表
        [NameInMap("seal_file_keys")]
        [Validation(Required=false)]
        public List<string> SealFileKeys { get; set; }

        // 印章id列表
        [NameInMap("seal_ids")]
        [Validation(Required=false)]
        public List<string> SealIds { get; set; }

        // 待签署文档摘要值，批量签时必传
        [NameInMap("sign_hash")]
        [Validation(Required=false)]
        public string SignHash { get; set; }

        // 签署位置信息
        [NameInMap("sign_pos_data")]
        [Validation(Required=false)]
        public string SignPosData { get; set; }

        // 第三方文档id，批量签时必传
        [NameInMap("third_doc_id")]
        [Validation(Required=false)]
        public string ThirdDocId { get; set; }

    }

}
