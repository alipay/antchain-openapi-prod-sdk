// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // OneStepSignField
    public class OneStepSignField : TeaModel {
        // accountId
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // file_id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // order
        [NameInMap("order")]
        [Validation(Required=false)]
        public long? Order { get; set; }

        // posPage
        [NameInMap("pos_page")]
        [Validation(Required=true)]
        public string PosPage { get; set; }

        // posX
        [NameInMap("pos_x")]
        [Validation(Required=true)]
        public string PosX { get; set; }

        // posY
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public string PosY { get; set; }

        // sealId
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // sign_date_bean_type
        [NameInMap("sign_date_bean_type")]
        [Validation(Required=false)]
        public long? SignDateBeanType { get; set; }

        // sign_date_font_size
        [NameInMap("sign_date_font_size")]
        [Validation(Required=false)]
        public long? SignDateFontSize { get; set; }

        // sign_date_format
        [NameInMap("sign_date_format")]
        [Validation(Required=false)]
        public string SignDateFormat { get; set; }

        // sign_date_pos_page
        [NameInMap("sign_date_pos_page")]
        [Validation(Required=false)]
        public long? SignDatePosPage { get; set; }

        // sign_date_pos_x
        [NameInMap("sign_date_pos_x")]
        [Validation(Required=false)]
        public string SignDatePosX { get; set; }

        //  
        [NameInMap("sign_date_pos_y")]
        [Validation(Required=false)]
        public string SignDatePosY { get; set; }

        // signType
        [NameInMap("sign_type")]
        [Validation(Required=false)]
        public long? SignType { get; set; }

        // third_order_no
        [NameInMap("third_order_no")]
        [Validation(Required=false)]
        public string ThirdOrderNo { get; set; }

        // width
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // auto_execute
        [NameInMap("auto_execute")]
        [Validation(Required=false)]
        public bool? AutoExecute { get; set; }

    }

}
