// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // 终端安全-Android应用加固-RuntimeProtectConfig
    public class RuntimeProtectConfig : TeaModel {
        // 重打包,签名校验,AndroidManifest防篡改,签名文件保护,0为检测到风险退出,1不处理
        [NameInMap("anti_signature")]
        [Validation(Required=true)]
        public long? AntiSignature { get; set; }

        // 防调试,0为检测到风险退出,1不处理
        [NameInMap("anti_debug")]
        [Validation(Required=true)]
        public long? AntiDebug { get; set; }

        // 防hook,0为检测到风险退出,1不处理
        [NameInMap("anti_hook")]
        [Validation(Required=true)]
        public long? AntiHook { get; set; }

        // 防注入,防内存dump,防内存数据修改,读取,0为检测到风险退出,1不处理
        [NameInMap("anti_inject")]
        [Validation(Required=true)]
        public long? AntiInject { get; set; }

        // 模拟器检查,0为检测到风险退出,1不处理
        [NameInMap("anti_emulator")]
        [Validation(Required=true)]
        public long? AntiEmulator { get; set; }

        // 防root,0为检测到风险退出,1不处理
        [NameInMap("anti_root")]
        [Validation(Required=true)]
        public long? AntiRoot { get; set; }

        // 防多开软件运行,0为检测到风险退出,1不处理
        [NameInMap("anti_multi_app")]
        [Validation(Required=true)]
        public long? AntiMultiApp { get; set; }

    }

}
