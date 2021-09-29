// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 签署区列表数据
    public class ContractPlatformSignFieldApplication : TeaModel {
        // 文件file id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 签署顺序，默认1,且不小于1，顺序越小越先处理
        [NameInMap("order")]
        [Validation(Required=false)]
        public long? Order { get; set; }

        // 印章id， 仅限企业公章，暂不支持指定企业法定代表人印章 ，如不传，则采用账号下的默认印章
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
        [NameInMap("third_order_no")]
        [Validation(Required=false)]
        public string ThirdOrderNo { get; set; }

        // 页码信息，当签署区signType为2时, 页码可以_-_分割, 其他情况只能是数字
        [NameInMap("pos_page")]
        [Validation(Required=true)]
        public string PosPage { get; set; }

        // x坐标，默认空
        [NameInMap("pos_x")]
        [Validation(Required=false)]
        public string PosX { get; set; }

        // y坐标
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public string PosY { get; set; }

        // 签署区宽，默认印章宽度
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // 是否添加签署时间戳， 默认不添加，默认格式 yyyy-MM-dd HH : mm : ss
        [NameInMap("add_sign_time")]
        [Validation(Required=false)]
        public bool? AddSignTime { get; set; }

        // 签署类型， 1-单页签署，2-骑缝签署，默认1
        [NameInMap("sign_type")]
        [Validation(Required=false)]
        public long? SignType { get; set; }

    }

}
