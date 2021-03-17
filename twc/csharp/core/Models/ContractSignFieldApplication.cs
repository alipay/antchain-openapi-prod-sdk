// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 创建电子合同签署盖章区时的申请信息
    public class ContractSignFieldApplication : TeaModel {
        // 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
        [NameInMap("add_sign_time")]
        [Validation(Required=false)]
        public bool? AddSignTime { get; set; }

        // 签约主体账号标识， 将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
        [NameInMap("authorized_account_id")]
        [Validation(Required=true)]
        public string AuthorizedAccountId { get; set; }

        // 电子合同文件ID
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 签署区顺序，默认1,且不小于1，顺序越小越先处理
        [NameInMap("order")]
        [Validation(Required=false)]
        public long? Order { get; set; }

        // 页码信息
        [NameInMap("pos_page")]
        [Validation(Required=false)]
        public string PosPage { get; set; }

        // x坐标转为字符串的值，默认空，页面签章必填，骑缝签章不填写
        [NameInMap("pos_x")]
        [Validation(Required=false)]
        public string PosX { get; set; }

        // y坐标转为字符串的值
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public string PosY { get; set; }

        // 印章id ，如不传，则采用账号下的默认印章
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
        [NameInMap("third_order_no")]
        [Validation(Required=false)]
        public string ThirdOrderNo { get; set; }

        // 签署区宽，默认印章宽度	
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
        [NameInMap("sign_type")]
        [Validation(Required=false)]
        public long? SignType { get; set; }

    }

}
