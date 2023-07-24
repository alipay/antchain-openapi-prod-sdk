// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 签署信息
    public class BclSignField : TeaModel {
        // 页码信息：当签署区sign_type为RIDE_SEAM时, 页码可以_-_分割, 例如1到15页，填"1-15"； 其他情况只能是数字； 
        [NameInMap("pos_page")]
        [Validation(Required=true, MaxLength=8)]
        public string PosPage { get; set; }

        // 非负数,小数位最多两位,x坐标，sign_type为SINGLE_PAGE时必填，sign_type为RIDE_SEAM时不填写
        [NameInMap("pos_x")]
        [Validation(Required=false, MaxLength=8)]
        public string PosX { get; set; }

        // 非负数,小数位最多两位,y坐标
        [NameInMap("pos_y")]
        [Validation(Required=true, MaxLength=8)]
        public string PosY { get; set; }

        // 签署类型，
        // 单页签署: SINGLE_PAGE，
        // 骑缝签署: RIDE_SEAM，
        // 默认 SINGLE_PAGE
        [NameInMap("sign_field_type")]
        [Validation(Required=true, MaxLength=16)]
        public string SignFieldType { get; set; }

        // 是否添加签署时间
        // 不添加: false 添加: true ， 默认false, 商家不支持指定日期坐标
        [NameInMap("add_sign_date")]
        [Validation(Required=false)]
        public bool? AddSignDate { get; set; }

        // 签章日期字体大小,默认12
        // 商家签署区不支持
        [NameInMap("sign_date_font_size")]
        [Validation(Required=false)]
        public long? SignDateFontSize { get; set; }

        // 签章日期格式，
        // yyyy年MM月dd日（默认值）
        // yyyy-MM-dd
        // yyyy/MM/dd
        // yyyy-MM-dd HH:mm:ss
        // 商家签署区不支持
        [NameInMap("sign_date_format")]
        [Validation(Required=false, MaxLength=32)]
        public string SignDateFormat { get; set; }

        // 页码信息，当add_sign_date为true时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可。
        // 商家签署区不支持
        [NameInMap("sign_date_pos_page")]
        [Validation(Required=false)]
        public long? SignDatePosPage { get; set; }

        // 非负数,小数位最多两位,签章日期x坐标，默认0
        // 商家签署区不支持
        [NameInMap("sign_date_pos_x")]
        [Validation(Required=false, MaxLength=8)]
        public string SignDatePosX { get; set; }

        // 非负数,小数位最多两位,签章日期y坐标，默认0
        // 商家签署区不支持
        [NameInMap("sign_date_pos_y")]
        [Validation(Required=false, MaxLength=8)]
        public string SignDatePosY { get; set; }

    }

}
