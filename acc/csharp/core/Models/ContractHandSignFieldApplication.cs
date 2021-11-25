// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // ContractHandSignFieldApplication
    public class ContractHandSignFieldApplication : TeaModel {
        // account_id
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

        // pos_page
        [NameInMap("pos_page")]
        [Validation(Required=false)]
        public string PosPage { get; set; }

        // posX
        [NameInMap("pos_x")]
        [Validation(Required=false)]
        public string PosX { get; set; }

        // posY
        [NameInMap("pos_y")]
        [Validation(Required=false)]
        public string PosY { get; set; }

        // sealId
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // signDateBeanType
        [NameInMap("sign_date_bean_type")]
        [Validation(Required=true)]
        public long? SignDateBeanType { get; set; }

        // signDateFontSize
        [NameInMap("sign_date_font_size")]
        [Validation(Required=true)]
        public long? SignDateFontSize { get; set; }

        // sign_date_format
        [NameInMap("sign_date_format")]
        [Validation(Required=false)]
        public string SignDateFormat { get; set; }

        // signDatePosPage
        [NameInMap("sign_date_pos_page")]
        [Validation(Required=false)]
        public long? SignDatePosPage { get; set; }

        // signDatePosX
        [NameInMap("sign_date_pos_x")]
        [Validation(Required=false)]
        public string SignDatePosX { get; set; }

        // sign_date_pos_y
        [NameInMap("sign_date_pos_y")]
        [Validation(Required=false)]
        public string SignDatePosY { get; set; }

        // sign_type
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

        // seal_ids
        [NameInMap("seal_ids")]
        [Validation(Required=false)]
        public List<string> SealIds { get; set; }

        // 签名字段type
        [NameInMap("sign_field_type")]
        [Validation(Required=false)]
        public long? SignFieldType { get; set; }

    }

}
