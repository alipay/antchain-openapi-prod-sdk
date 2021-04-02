<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class LoadTsmResourcefileRequest extends Model
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

    // BOT
    /**
     * @var string
     */
    public $deviceCode;

    // H0
    /**
     * @var string
     */
    public $deviceModel;

    // SE
    /**
     * @var string
     */
    public $deviceModule;

    // version
    /**
     * @var string
     */
    public $fileVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceCode'        => 'device_code',
        'deviceModel'       => 'device_model',
        'deviceModule'      => 'device_module',
        'fileVersion'       => 'file_version',
    ];

    public function validate()
    {
        Model::validateRequired('deviceCode', $this->deviceCode, true);
        Model::validateRequired('deviceModel', $this->deviceModel, true);
        Model::validateRequired('deviceModule', $this->deviceModule, true);
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
        if (null !== $this->deviceCode) {
            $res['device_code'] = $this->deviceCode;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->deviceModule) {
            $res['device_module'] = $this->deviceModule;
        }
        if (null !== $this->fileVersion) {
            $res['file_version'] = $this->fileVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadTsmResourcefileRequest
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
        if (isset($map['device_code'])) {
            $model->deviceCode = $map['device_code'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['device_module'])) {
            $model->deviceModule = $map['device_module'];
        }
        if (isset($map['file_version'])) {
            $model->fileVersion = $map['file_version'];
        }

        return $model;
    }
}
