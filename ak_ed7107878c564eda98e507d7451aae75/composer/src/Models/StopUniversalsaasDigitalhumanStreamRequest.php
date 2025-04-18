<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class StopUniversalsaasDigitalhumanStreamRequest extends Model
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

    // 租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // app_id
    /**
     * @var string
     */
    public $appId;

    // 流Id
    /**
     * @var string
     */
    public $streamId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'appId'             => 'app_id',
        'streamId'          => 'stream_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('streamId', $this->streamId, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->streamId) {
            $res['stream_id'] = $this->streamId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StopUniversalsaasDigitalhumanStreamRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['stream_id'])) {
            $model->streamId = $map['stream_id'];
        }

        return $model;
    }
}
