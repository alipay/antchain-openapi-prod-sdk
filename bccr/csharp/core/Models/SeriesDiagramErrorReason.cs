// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 系列图错误原因
    public class SeriesDiagramErrorReason : TeaModel {
        // 系列图单个图片所属页码
        [NameInMap("image_pdf_page_index")]
        [Validation(Required=true)]
        public long? ImagePdfPageIndex { get; set; }

        // 错误原因英文
        [NameInMap("error")]
        [Validation(Required=true)]
        public string Error { get; set; }

        // 错误原因中文
        [NameInMap("error_cn")]
        [Validation(Required=true)]
        public string ErrorCn { get; set; }

    }

}
