// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RuntimeProtectConfig extends TeaModel {
    // 重打包,签名校验,AndroidManifest防篡改,签名文件保护,0为检测到风险退出,1不处理
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("anti_signature")
    @Validation(required = true)
    public Long antiSignature;

    // 防调试,0为检测到风险退出,1不处理
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("anti_debug")
    @Validation(required = true)
    public Long antiDebug;

    // 防hook,0为检测到风险退出,1不处理
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("anti_hook")
    @Validation(required = true)
    public Long antiHook;

    // 防注入,防内存dump,防内存数据修改,读取,0为检测到风险退出,1不处理
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("anti_inject")
    @Validation(required = true)
    public Long antiInject;

    // 模拟器检查,0为检测到风险退出,1不处理
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("anti_emulator")
    @Validation(required = true)
    public Long antiEmulator;

    // 防root,0为检测到风险退出,1不处理
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("anti_root")
    @Validation(required = true)
    public Long antiRoot;

    // 防多开软件运行,0为检测到风险退出,1不处理
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("anti_multi_app")
    @Validation(required = true)
    public Long antiMultiApp;

    public static RuntimeProtectConfig build(java.util.Map<String, ?> map) throws Exception {
        RuntimeProtectConfig self = new RuntimeProtectConfig();
        return TeaModel.build(map, self);
    }

    public RuntimeProtectConfig setAntiSignature(Long antiSignature) {
        this.antiSignature = antiSignature;
        return this;
    }
    public Long getAntiSignature() {
        return this.antiSignature;
    }

    public RuntimeProtectConfig setAntiDebug(Long antiDebug) {
        this.antiDebug = antiDebug;
        return this;
    }
    public Long getAntiDebug() {
        return this.antiDebug;
    }

    public RuntimeProtectConfig setAntiHook(Long antiHook) {
        this.antiHook = antiHook;
        return this;
    }
    public Long getAntiHook() {
        return this.antiHook;
    }

    public RuntimeProtectConfig setAntiInject(Long antiInject) {
        this.antiInject = antiInject;
        return this;
    }
    public Long getAntiInject() {
        return this.antiInject;
    }

    public RuntimeProtectConfig setAntiEmulator(Long antiEmulator) {
        this.antiEmulator = antiEmulator;
        return this;
    }
    public Long getAntiEmulator() {
        return this.antiEmulator;
    }

    public RuntimeProtectConfig setAntiRoot(Long antiRoot) {
        this.antiRoot = antiRoot;
        return this;
    }
    public Long getAntiRoot() {
        return this.antiRoot;
    }

    public RuntimeProtectConfig setAntiMultiApp(Long antiMultiApp) {
        this.antiMultiApp = antiMultiApp;
        return this;
    }
    public Long getAntiMultiApp() {
        return this.antiMultiApp;
    }

}
