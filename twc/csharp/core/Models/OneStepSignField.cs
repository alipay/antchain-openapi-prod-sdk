// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 一步创建签署流程的签署区信息
    public class OneStepSignField : TeaModel {
        // 签署操作人个人账号标识，即操作本次签署的个人
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 电子合同文件ID
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 签署区顺序，默认1,且不小于1，顺序越小越先处理
        [NameInMap("order")]
        [Validation(Required=false)]
        public long? Order { get; set; }

        // 页码信息，当签署区signType为2时, 页码可以_-_分割, 其他情况只能是数字
        [NameInMap("pos_page")]
        [Validation(Required=true)]
        public string PosPage { get; set; }

        // x坐标
        [NameInMap("pos_x")]
        [Validation(Required=true)]
        public string PosX { get; set; }

        // y坐标
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public string PosY { get; set; }

        // 印章id
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // 是否需要添加签署日期，0-禁止 1-必须 2-不限制，默认0
        [NameInMap("sign_date_bean_type")]
        [Validation(Required=false)]
        public long? SignDateBeanType { get; set; }

        // 签章日期字体大小,默认12
        [NameInMap("sign_date_font_size")]
        [Validation(Required=false)]
        public long? SignDateFontSize { get; set; }

        // 签章日期格式，yyyy年MM月dd日
        [NameInMap("sign_date_format")]
        [Validation(Required=false)]
        public string SignDateFormat { get; set; }

        // 页码信息，当signDateBeanType为1时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可。
        [NameInMap("sign_date_pos_page")]
        [Validation(Required=false)]
        public long? SignDatePosPage { get; set; }

        // 签章日期x坐标，默认0
        [NameInMap("sign_date_pos_x")]
        [Validation(Required=false)]
        public string SignDatePosX { get; set; }

        // 签章日期y坐标，默认0
        [NameInMap("sign_date_pos_y")]
        [Validation(Required=false)]
        public string SignDatePosY { get; set; }

        // 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
        [NameInMap("sign_type")]
        [Validation(Required=false)]
        public long? SignType { get; set; }

        // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
        [NameInMap("third_order_no")]
        [Validation(Required=false)]
        public string ThirdOrderNo { get; set; }

        // 签署区宽，默认印章宽度
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // 是否自动执行签署，默认false，false-手动签署，true-自动签署
        [NameInMap("auto_execute")]
        [Validation(Required=false)]
        public bool? AutoExecute { get; set; }

    }

}
