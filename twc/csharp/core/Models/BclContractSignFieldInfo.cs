// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 返回的bcl订单签署区信息
    public class BclContractSignFieldInfo : TeaModel {
        // 签署流程id
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

        // 文件id
        [NameInMap("contract_file_id")]
        [Validation(Required=false)]
        public string ContractFileId { get; set; }

        // 签署人id
        [NameInMap("contract_user_id")]
        [Validation(Required=false)]
        public string ContractUserId { get; set; }

        // 签署页码
        [NameInMap("pos_page")]
        [Validation(Required=false)]
        public string PosPage { get; set; }

        // x坐标
        [NameInMap("pos_x")]
        [Validation(Required=false)]
        public string PosX { get; set; }

        // y坐标
        [NameInMap("pos_y")]
        [Validation(Required=false)]
        public string PosY { get; set; }

        // 签署类型，AUTO-自动，HAND-手动
        [NameInMap("sign_type")]
        [Validation(Required=false)]
        public string SignType { get; set; }

        // 签署区类型， 
        // 单页签署: SINGLE_PAGE， 
        // 骑缝签署: RIDE_SEAM， 
        // 默认 SINGLE_PAGE
        [NameInMap("sign_field_type")]
        [Validation(Required=false)]
        public string SignFieldType { get; set; }

        // 是否添加签署时间
        // 不添加: false 添加: true ， 默认false, 商家不支持指定日期坐标
        [NameInMap("add_sign_date")]
        [Validation(Required=false)]
        public bool? AddSignDate { get; set; }

        // 签章日期字体大小,默认12 商家签署区不支持
        [NameInMap("sign_date_font_size")]
        [Validation(Required=false)]
        public long? SignDateFontSize { get; set; }

        // 签章日期格式，yyyy年MM月dd日 商家签署区不支持
        [NameInMap("sign_date_format")]
        [Validation(Required=false)]
        public string SignDateFormat { get; set; }

        // 签章日期页码信息
        [NameInMap("sign_date_pos_page")]
        [Validation(Required=false)]
        public long? SignDatePosPage { get; set; }

        // 签章日期x坐标
        [NameInMap("sign_date_pos_x")]
        [Validation(Required=false)]
        public string SignDatePosX { get; set; }

        // 签章日期y坐标
        [NameInMap("sign_date_pos_y")]
        [Validation(Required=false)]
        public string SignDatePosY { get; set; }

    }

}
