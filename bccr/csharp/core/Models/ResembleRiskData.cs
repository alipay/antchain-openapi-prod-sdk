// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 作品相似识别结果
    public class ResembleRiskData : TeaModel {
        // 重复作品ID
        [NameInMap("work_id")]
        [Validation(Required=true)]
        public string WorkId { get; set; }

        // 相似作品的名称
        [NameInMap("work_name")]
        [Validation(Required=false)]
        public string WorkName { get; set; }

        // 相似作品的类型
        [NameInMap("work_type")]
        [Validation(Required=false)]
        public string WorkType { get; set; }

        // 相似值
        [NameInMap("score")]
        [Validation(Required=false)]
        public string Score { get; set; }

        // 相似作品下载凭证
        [NameInMap("work_file_id")]
        [Validation(Required=false)]
        public string WorkFileId { get; set; }

        // 相似明细
        [NameInMap("resemble_details")]
        [Validation(Required=false)]
        public List<ResembleDetail> ResembleDetails { get; set; }

    }

}
