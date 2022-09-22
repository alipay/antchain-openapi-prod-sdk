<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CancelSidecaropsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用服务名称
    /**
     * @var string
     */
    public $containerServiceName;

    // mosn/odp
    /**
     * @var string
     */
    public $sidecarName;

    // 具体sidecar的版本，非必填
    /**
     * @var string
     */
    public $sidecarVersion;

    // 环宇 order number
    /**
     * @var string
     */
    public $orderNum;
    protected $_name = [
        'authToken'            => 'auth_token',
        'containerServiceName' => 'container_service_name',
        'sidecarName'          => 'sidecar_name',
        'sidecarVersion'       => 'sidecar_version',
        'orderNum'             => 'order_num',
    ];

    public function validate()
    {
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('orderNum', $this->orderNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->orderNum) {
            $res['order_num'] = $this->orderNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelSidecaropsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['sidecar_name'])) {
            $model->sidecarName = $map['sidecar_name'];
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['order_num'])) {
            $model->orderNum = $map['order_num'];
        }

        return $model;
    }
}
