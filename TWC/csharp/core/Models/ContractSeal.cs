// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 合同印章
    public class ContractSeal : TeaModel {
        // 印章别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 印章创建时间
        [NameInMap("create_date")]
        [Validation(Required=false)]
        public long? CreateDate { get; set; }

        // 默认印章标识
        [NameInMap("default_flag")]
        [Validation(Required=false)]
        public bool? DefaultFlag { get; set; }

        // 印章fileKey
        [NameInMap("file_key")]
        [Validation(Required=false)]
        public string FileKey { get; set; }

        // 印章高度
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 印章宽度
        [NameInMap("width")]
        [Validation(Required=false)]
        public long? Width { get; set; }

        // 印章id
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // 印章类型，1-机构模板章，2-个人模板章，3-自定义印章，4-手绘章
        [NameInMap("seal_type")]
        [Validation(Required=false)]
        public long? SealType { get; set; }

        // 印章下载地址, 有效时间1小时
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 印章业务类型，CANCELLATION-作废章，COMMON-其它
        [NameInMap("seal_biz_type")]
        [Validation(Required=false)]
        public string SealBizType { get; set; }

    }

}
