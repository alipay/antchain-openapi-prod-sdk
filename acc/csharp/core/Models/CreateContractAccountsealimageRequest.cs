// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateContractAccountsealimageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id
        // 
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 印章别名
        // 
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 印章数据，base64格式字符串，不包含格式前缀
        // 
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 印章高度, 个人默认95px, 机构默认159px
        // 
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
        // 
        [NameInMap("transparent_flag")]
        [Validation(Required=false)]
        public bool? TransparentFlag { get; set; }

        // 印章数据类型，BASE64：base64格式
        // 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 印章宽度, 个人默认95px, 机构默认159px
        // 
        [NameInMap("width")]
        [Validation(Required=false)]
        public long? Width { get; set; }

    }

}
