// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 密钥详情
    public class KeyVO : TeaModel {
        // 密钥id
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

        // 密钥名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 创建类型
        // KEY_FILE：上传密钥文件
        // CREATE_NEW_KEY：系统创建密钥
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 钱包地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 关联项目数量
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public string Quantity { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreated { get; set; }

        // 是否支持删除
        [NameInMap("delete_enable")]
        [Validation(Required=true)]
        public bool? DeleteEnable { get; set; }

        // 资产项目信息
        [NameInMap("asset_project_info")]
        [Validation(Required=true)]
        public KeyProjectInfo AssetProjectInfo { get; set; }

    }

}
