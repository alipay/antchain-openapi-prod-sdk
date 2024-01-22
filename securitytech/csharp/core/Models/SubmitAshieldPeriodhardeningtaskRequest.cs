// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class SubmitAshieldPeriodhardeningtaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // APK,ABB 上传后的地址
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 开启so加固
        [NameInMap("so_protect")]
        [Validation(Required=false)]
        public string SoProtect { get; set; }

        // 开启so加固后,设置的so加固配置文件,默认对apk中libs目录下所有so进行加固,以逗号分隔
        [NameInMap("so_protect_config")]
        [Validation(Required=false)]
        public string SoProtectConfig { get; set; }

        // 开启对assets下的资源文件进行加固
        [NameInMap("assets_protect")]
        [Validation(Required=false)]
        public string AssetsProtect { get; set; }

        // 开启assets加固后,指定要对apk中assets目录下的哪些文件做加固,默认对assets下所有的文件进行保护,以逗号分隔
        [NameInMap("assets_protect_confing")]
        [Validation(Required=false)]
        public string AssetsProtectConfing { get; set; }

        // 开启运行时保护,需要填写的参数,具体参数见下方,json格式
        [NameInMap("runtime_protect_config")]
        [Validation(Required=false)]
        public RuntimeProtectConfig RuntimeProtectConfig { get; set; }

        // 对生命周期函数进行java2jni保护
        [NameInMap("enable_life_func")]
        [Validation(Required=false)]
        public string EnableLifeFunc { get; set; }

        // java2jni配置文件
        [NameInMap("javatoc_jni_config")]
        [Validation(Required=false)]
        public List<ClassMethodConfig> JavatocJniConfig { get; set; }

        // 扩展信息,json字符串,暂不使用
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
