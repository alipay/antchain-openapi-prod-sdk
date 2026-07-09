<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AddCertificateRequest extends Model
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

    // 机构Id
    /**
     * @var int
     */
    public $organizationId;

    // 证书内容
    /**
     * @var string
     */
    public $certificate;

    // 设备ID
    /**
     * @var string
     */
    public $deviceId;

    // 主机设备ID
    /**
     * @var string
     */
    public $hostDeviceId;

    // 场景码
    /**
     * @var string
     */
    public $projectId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'organizationId'    => 'organization_id',
        'certificate'       => 'certificate',
        'deviceId'          => 'device_id',
        'hostDeviceId'      => 'host_device_id',
        'projectId'         => 'project_id',
    ];

    public function validate()
    {
        Model::validateRequired('certificate', $this->certificate, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('hostDeviceId', $this->hostDeviceId, true);
        Model::validateRequired('projectId', $this->projectId, true);
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
        if (null !== $this->organizationId) {
            $res['organization_id'] = $this->organizationId;
        }
        if (null !== $this->certificate) {
            $res['certificate'] = $this->certificate;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->hostDeviceId) {
            $res['host_device_id'] = $this->hostDeviceId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddCertificateRequest
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
        if (isset($map['organization_id'])) {
            $model->organizationId = $map['organization_id'];
        }
        if (isset($map['certificate'])) {
            $model->certificate = $map['certificate'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['host_device_id'])) {
            $model->hostDeviceId = $map['host_device_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }

        return $model;
    }
}
