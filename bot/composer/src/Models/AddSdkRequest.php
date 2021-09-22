<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AddSdkRequest extends Model
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

    // 设备SDK公钥
    /**
     * @var string
     */
    public $verifyKey;

    // SDK版本号
    /**
     * @var string
     */
    public $sdkVersionStr;

    // sdk模型，格式为json
    /**
     * @var string
     */
    public $metaModel;

    // 平台
    /**
     * @var string
     */
    public $platform;

    // 公司名称
    /**
     * @var string
     */
    public $corpName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'verifyKey'         => 'verify_key',
        'sdkVersionStr'     => 'sdk_version_str',
        'metaModel'         => 'meta_model',
        'platform'          => 'platform',
        'corpName'          => 'corp_name',
    ];

    public function validate()
    {
        Model::validateRequired('verifyKey', $this->verifyKey, true);
        Model::validateRequired('sdkVersionStr', $this->sdkVersionStr, true);
        Model::validateRequired('metaModel', $this->metaModel, true);
        Model::validateRequired('corpName', $this->corpName, true);
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
        if (null !== $this->verifyKey) {
            $res['verify_key'] = $this->verifyKey;
        }
        if (null !== $this->sdkVersionStr) {
            $res['sdk_version_str'] = $this->sdkVersionStr;
        }
        if (null !== $this->metaModel) {
            $res['meta_model'] = $this->metaModel;
        }
        if (null !== $this->platform) {
            $res['platform'] = $this->platform;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddSdkRequest
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
        if (isset($map['verify_key'])) {
            $model->verifyKey = $map['verify_key'];
        }
        if (isset($map['sdk_version_str'])) {
            $model->sdkVersionStr = $map['sdk_version_str'];
        }
        if (isset($map['meta_model'])) {
            $model->metaModel = $map['meta_model'];
        }
        if (isset($map['platform'])) {
            $model->platform = $map['platform'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }

        return $model;
    }
}
