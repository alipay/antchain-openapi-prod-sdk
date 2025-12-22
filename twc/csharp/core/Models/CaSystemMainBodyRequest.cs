// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 正文章信息
    public class CaSystemMainBodyRequest : TeaModel {
        // 正文章模式坐标ABSOLUTE_POSITION, 关键字KEY_WORD
        [NameInMap("main_body_model")]
        [Validation(Required=true)]
        public string MainBodyModel { get; set; }

        // 签署页码
        [NameInMap("pos_page")]
        [Validation(Required=true)]
        public long? PosPage { get; set; }

        // 签署区位置横坐标;mainBodyModel为ABSOLUTE_POSITION时必填
        [NameInMap("pos_x")]
        [Validation(Required=false)]
        public long? PosX { get; set; }

        // 签署区位置纵坐标;mainBodyModel为ABSOLUTE_POSITION时必填
        [NameInMap("pos_y")]
        [Validation(Required=false)]
        public long? PosY { get; set; }

        // 关键字：mainBodyModel为KEY_WORD时必填
        [NameInMap("key_word")]
        [Validation(Required=false)]
        public string KeyWord { get; set; }

        // mainBodyModel为KEY_WORD时必填
        [NameInMap("key_word_type")]
        [Validation(Required=false)]
        public long? KeyWordType { get; set; }

        // 第几个关键字;mainBodyModel为KEY_WORD时必填
        [NameInMap("kw_index")]
        [Validation(Required=false)]
        public long? KwIndex { get; set; }

        // x偏移量
        [NameInMap("kw_shift_x")]
        [Validation(Required=false)]
        public long? KwShiftX { get; set; }

        // y偏移量
        [NameInMap("kw_shift_y")]
        [Validation(Required=false)]
        public long? KwShiftY { get; set; }

    }

}
