// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // ContractSignFieldApplication
    public class ContractSignFieldApplication : TeaModel {
        // add_sign_time
        [NameInMap("add_sign_time")]
        [Validation(Required=false)]
        public bool? AddSignTime { get; set; }

        // authorized_account_id
        [NameInMap("authorized_account_id")]
        [Validation(Required=true)]
        public string AuthorizedAccountId { get; set; }

        // file_id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // order
        [NameInMap("order")]
        [Validation(Required=false)]
        public string Order { get; set; }

        // pos_page
        [NameInMap("pos_page")]
        [Validation(Required=true)]
        public string PosPage { get; set; }

        // pos_x
        [NameInMap("pos_x")]
        [Validation(Required=true)]
        public string PosX { get; set; }

        // seal_id
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // third_order_no
        [NameInMap("third_order_no")]
        [Validation(Required=false)]
        public string ThirdOrderNo { get; set; }

        // pos_y
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public string PosY { get; set; }

        // width
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // signType
        [NameInMap("sign_type")]
        [Validation(Required=false)]
        public long? SignType { get; set; }

    }

}
