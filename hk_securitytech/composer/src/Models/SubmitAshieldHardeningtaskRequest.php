<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SubmitAshieldHardeningtaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // APK,ABB 上传后的地址
    /**
     * @var string
     */
    public $fileUrl;

    // 开启so加固
    /**
     * @var string
     */
    public $soProtect;

    // 开启so加固后,设置的so加固配置文件,默认对apk中libs目录下所有so进行加固,以逗号分隔
    /**
     * @var string
     */
    public $soProtectConfig;

    // 开启对assets下的资源文件进行加固
    /**
     * @var string
     */
    public $assetsProtect;

    // 开启assets加固后,指定要对apk中assets目录下的哪些文件做加固,默认对assets下所有的文件进行保护,以逗号分隔
    /**
     * @var string
     */
    public $assetsProtectConfing;

    // 开启运行时保护,需要填写的参数,具体参数见下方,json格式
    /**
     * @var RuntimeProtectConfig
     */
    public $runtimeProtectConfig;

    // 对生命周期函数进行java2jni保护
    /**
     * @var string
     */
    public $enableLifeFunc;

    // java2jni配置文件
    /**
     * @var ClassMethodConfig[]
     */
    public $javatocJniConfig;

    // 扩展信息,json字符串,暂不使用
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'fileUrl'              => 'file_url',
        'soProtect'            => 'so_protect',
        'soProtectConfig'      => 'so_protect_config',
        'assetsProtect'        => 'assets_protect',
        'assetsProtectConfing' => 'assets_protect_confing',
        'runtimeProtectConfig' => 'runtime_protect_config',
        'enableLifeFunc'       => 'enable_life_func',
        'javatocJniConfig'     => 'javatoc_jni_config',
        'extInfo'              => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('fileUrl', $this->fileUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->soProtect) {
            $res['so_protect'] = $this->soProtect;
        }
        if (null !== $this->soProtectConfig) {
            $res['so_protect_config'] = $this->soProtectConfig;
        }
        if (null !== $this->assetsProtect) {
            $res['assets_protect'] = $this->assetsProtect;
        }
        if (null !== $this->assetsProtectConfing) {
            $res['assets_protect_confing'] = $this->assetsProtectConfing;
        }
        if (null !== $this->runtimeProtectConfig) {
            $res['runtime_protect_config'] = null !== $this->runtimeProtectConfig ? $this->runtimeProtectConfig->toMap() : null;
        }
        if (null !== $this->enableLifeFunc) {
            $res['enable_life_func'] = $this->enableLifeFunc;
        }
        if (null !== $this->javatocJniConfig) {
            $res['javatoc_jni_config'] = [];
            if (null !== $this->javatocJniConfig && \is_array($this->javatocJniConfig)) {
                $n = 0;
                foreach ($this->javatocJniConfig as $item) {
                    $res['javatoc_jni_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAshieldHardeningtaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['so_protect'])) {
            $model->soProtect = $map['so_protect'];
        }
        if (isset($map['so_protect_config'])) {
            $model->soProtectConfig = $map['so_protect_config'];
        }
        if (isset($map['assets_protect'])) {
            $model->assetsProtect = $map['assets_protect'];
        }
        if (isset($map['assets_protect_confing'])) {
            $model->assetsProtectConfing = $map['assets_protect_confing'];
        }
        if (isset($map['runtime_protect_config'])) {
            $model->runtimeProtectConfig = RuntimeProtectConfig::fromMap($map['runtime_protect_config']);
        }
        if (isset($map['enable_life_func'])) {
            $model->enableLifeFunc = $map['enable_life_func'];
        }
        if (isset($map['javatoc_jni_config'])) {
            if (!empty($map['javatoc_jni_config'])) {
                $model->javatocJniConfig = [];
                $n                       = 0;
                foreach ($map['javatoc_jni_config'] as $item) {
                    $model->javatocJniConfig[$n++] = null !== $item ? ClassMethodConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
