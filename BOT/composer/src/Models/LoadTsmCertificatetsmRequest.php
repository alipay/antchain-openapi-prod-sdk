<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class LoadTsmCertificatetsmRequest extends Model
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

    // certificate
    /**
     * @var string
     */
    public $certificate;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certificate'       => 'certificate',
        'deviceCode'        => 'device_code',
        'deviceModel'       => 'device_model',
        'deviceModule'      => 'device_module',
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
        if (null !== $this->certificate) {
            $res['certificate'] = $this->certificate;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadTsmCertificatetsmRequest
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
        if (isset($map['certificate'])) {
            $model->certificate = $map['certificate'];
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

        return $model;
    }
}
