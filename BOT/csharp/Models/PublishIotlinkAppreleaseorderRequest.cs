// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PublishIotlinkAppreleaseorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用包id
        [NameInMap("apk_id")]
        [Validation(Required=true)]
        public string ApkId { get; set; }

        // 发布方式
        // DEVICE：指定设备发布
        // VERSION：指定版本发布
        [NameInMap("release_mode")]
        [Validation(Required=true)]
        public string ReleaseMode { get; set; }

        // 指定发布方式的数据列表
        // 发布方式为DEVICE，字段为设备did列表；
        // 发布方式为VERSION，字段为应用包id列表；
        [NameInMap("data_list")]
        [Validation(Required=true)]
        public List<string> DataList { get; set; }

        // 对于数据列表中的设备存在升级中的任务是否覆盖安装？否：返回升级中的设备列表；是：取消升级中的设备升级任务，使用新的任务覆盖升级
        [NameInMap("cover")]
        [Validation(Required=true)]
        public bool? Cover { get; set; }

    }

}
