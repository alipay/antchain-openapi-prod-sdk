// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 电子提单批次下提单明细
    public class EblDetail : TeaModel {
        // 电子提单copy文件hash
        [NameInMap("ebl_copy_pdf_file_hash")]
        [Validation(Required=true)]
        public string EblCopyPdfFileHash { get; set; }

        // 电子提单copy文件id
        [NameInMap("ebl_copy_pdf_file_id")]
        [Validation(Required=true)]
        public string EblCopyPdfFileId { get; set; }

        // 电子提单编号
        [NameInMap("ebl_no")]
        [Validation(Required=true)]
        public string EblNo { get; set; }

    }

}
