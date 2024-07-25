// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateIotlinkOtamoduleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品类code
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // OTA模块名称，产品下唯一且不可修改。仅支持英文字母、数字、英文句号（.）、短划线（-）和下划线（_）。长度限制为1~64个字符。
        // 英文字母不区分大小写，例如“scanner”和“Scanner”被认为是相同的模块名称，不可重复使用
        [NameInMap("module_name")]
        [Validation(Required=true)]
        public string ModuleName { get; set; }

        // OTA模块别名。支持中文、英文字母、数字、英文句号（.）、短划线（-）和下划线（_），长度限制为1~64个字符。
        [NameInMap("alias_name")]
        [Validation(Required=false)]
        public string AliasName { get; set; }

        // OTA模块的描述信息，支持最多100个字符。
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 项目编码
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

    }

}
