// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 数据校验失败返回体
    public class DataVerifyFailureData : TeaModel {
        // 主键id 
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // Alipay-0101
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备ID 
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 发行设备ID 
        [NameInMap("dis_device_id")]
        [Validation(Required=false)]
        public string DisDeviceId { get; set; }

        // 类型：0:数据上报;1:数据完整性校验
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // c89b65a2e3afd604977c0....
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

        // 验签类型：0(RAW_DATA)；1(公钥格式为PEM)；2(公钥格式为DER)
        [NameInMap("format_type")]
        [Validation(Required=false)]
        public long? FormatType { get; set; }

        // 验证内容hash
        [NameInMap("content_id")]
        [Validation(Required=false)]
        public string ContentId { get; set; }

        // 验证内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 签名
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 错误信息
        [NameInMap("fail_message")]
        [Validation(Required=false)]
        public string FailMessage { get; set; }

        // 补充数据
        [NameInMap("extra_data")]
        [Validation(Required=false)]
        public string ExtraData { get; set; }

        // 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
        [NameInMap("source")]
        [Validation(Required=false)]
        public long? Source { get; set; }

    }

}
