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

    // APK/ABB 上传后的地址
    /**
     * @var string
     */
    public $fileUrl;

    // java2jni配置文件
    /**
     * @var ClassMethodConfig[]
     */
    public $javatocJniConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileUrl'           => 'file_url',
        'javatocJniConfig'  => 'javatoc_jni_config',
    ];

    public function validate()
    {
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('javatocJniConfig', $this->javatocJniConfig, true);
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
        if (null !== $this->javatocJniConfig) {
            $res['javatoc_jni_config'] = [];
            if (null !== $this->javatocJniConfig && \is_array($this->javatocJniConfig)) {
                $n = 0;
                foreach ($this->javatocJniConfig as $item) {
                    $res['javatoc_jni_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (isset($map['javatoc_jni_config'])) {
            if (!empty($map['javatoc_jni_config'])) {
                $model->javatocJniConfig = [];
                $n                       = 0;
                foreach ($map['javatoc_jni_config'] as $item) {
                    $model->javatocJniConfig[$n++] = null !== $item ? ClassMethodConfig::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
