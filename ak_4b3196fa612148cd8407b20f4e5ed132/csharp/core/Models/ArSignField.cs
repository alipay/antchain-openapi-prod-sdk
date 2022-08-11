// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    // 电子签约签署区
    public class ArSignField : TeaModel {
        // 签署页
        [NameInMap("pos_page")]
        [Validation(Required=false)]
        public string PosPage { get; set; }

        // 签署区x坐标
        [NameInMap("pos_x")]
        [Validation(Required=false)]
        public string PosX { get; set; }

        // 签署区y坐标
        [NameInMap("pos_y")]
        [Validation(Required=false)]
        public string PosY { get; set; }

        // 签署日期签署页
        [NameInMap("sign_date_pos_page")]
        [Validation(Required=false)]
        public string SignDatePosPage { get; set; }

        // 签署日期的签署坐标x
        [NameInMap("sign_date_pos_x")]
        [Validation(Required=false)]
        public string SignDatePosX { get; set; }

        // 签署日期签署坐标y
        [NameInMap("sign_date_pos_y")]
        [Validation(Required=false)]
        public string SignDatePosY { get; set; }

    }

}
