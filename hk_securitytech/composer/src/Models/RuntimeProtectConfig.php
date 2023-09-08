<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RuntimeProtectConfig extends Model
{
    // 重打包,签名校验,AndroidManifest防篡改,签名文件保护,0为检测到风险退出,1不处理
    /**
     * @example .
     *
     * @var int
     */
    public $antiSignature;

    // 防调试,0为检测到风险退出,1不处理
    /**
     * @example .
     *
     * @var int
     */
    public $antiDebug;

    // 防hook,0为检测到风险退出,1不处理
    /**
     * @example .
     *
     * @var int
     */
    public $antiHook;

    // 防注入,防内存dump,防内存数据修改,读取,0为检测到风险退出,1不处理
    /**
     * @example .
     *
     * @var int
     */
    public $antiInject;

    // 模拟器检查,0为检测到风险退出,1不处理
    /**
     * @example .
     *
     * @var int
     */
    public $antiEmulator;

    // 防root,0为检测到风险退出,1不处理
    /**
     * @example .
     *
     * @var int
     */
    public $antiRoot;

    // 防多开软件运行,0为检测到风险退出,1不处理
    /**
     * @example .
     *
     * @var int
     */
    public $antiMultiApp;
    protected $_name = [
        'antiSignature' => 'anti_signature',
        'antiDebug'     => 'anti_debug',
        'antiHook'      => 'anti_hook',
        'antiInject'    => 'anti_inject',
        'antiEmulator'  => 'anti_emulator',
        'antiRoot'      => 'anti_root',
        'antiMultiApp'  => 'anti_multi_app',
    ];

    public function validate()
    {
        Model::validateRequired('antiSignature', $this->antiSignature, true);
        Model::validateRequired('antiDebug', $this->antiDebug, true);
        Model::validateRequired('antiHook', $this->antiHook, true);
        Model::validateRequired('antiInject', $this->antiInject, true);
        Model::validateRequired('antiEmulator', $this->antiEmulator, true);
        Model::validateRequired('antiRoot', $this->antiRoot, true);
        Model::validateRequired('antiMultiApp', $this->antiMultiApp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antiSignature) {
            $res['anti_signature'] = $this->antiSignature;
        }
        if (null !== $this->antiDebug) {
            $res['anti_debug'] = $this->antiDebug;
        }
        if (null !== $this->antiHook) {
            $res['anti_hook'] = $this->antiHook;
        }
        if (null !== $this->antiInject) {
            $res['anti_inject'] = $this->antiInject;
        }
        if (null !== $this->antiEmulator) {
            $res['anti_emulator'] = $this->antiEmulator;
        }
        if (null !== $this->antiRoot) {
            $res['anti_root'] = $this->antiRoot;
        }
        if (null !== $this->antiMultiApp) {
            $res['anti_multi_app'] = $this->antiMultiApp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RuntimeProtectConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['anti_signature'])) {
            $model->antiSignature = $map['anti_signature'];
        }
        if (isset($map['anti_debug'])) {
            $model->antiDebug = $map['anti_debug'];
        }
        if (isset($map['anti_hook'])) {
            $model->antiHook = $map['anti_hook'];
        }
        if (isset($map['anti_inject'])) {
            $model->antiInject = $map['anti_inject'];
        }
        if (isset($map['anti_emulator'])) {
            $model->antiEmulator = $map['anti_emulator'];
        }
        if (isset($map['anti_root'])) {
            $model->antiRoot = $map['anti_root'];
        }
        if (isset($map['anti_multi_app'])) {
            $model->antiMultiApp = $map['anti_multi_app'];
        }

        return $model;
    }
}
