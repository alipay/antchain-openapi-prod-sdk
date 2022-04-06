<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateCertificateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // zoneId
    /**
     * @var string
     */
    public $zoneId;

    // name
    /**
     * @var string
     */
    public $name;

    // paas_region_id
    /**
     * @var string
     */
    public $paasRegionId;

    // certificate
    /**
     * @var string
     */
    public $certificate;

    // privateKey
    /**
     * @var string
     */
    public $privateKey;

    // cert_type
    /**
     * @var int
     */
    public $certType;

    // 多provider时选填
    /**
     * @var string
     */
    public $providerId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'workspaceId'  => 'workspace_id',
        'zoneId'       => 'zone_id',
        'name'         => 'name',
        'paasRegionId' => 'paas_region_id',
        'certificate'  => 'certificate',
        'privateKey'   => 'private_key',
        'certType'     => 'cert_type',
        'providerId'   => 'provider_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('paasRegionId', $this->paasRegionId, true);
        Model::validateRequired('certificate', $this->certificate, true);
        Model::validateRequired('privateKey', $this->privateKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->paasRegionId) {
            $res['paas_region_id'] = $this->paasRegionId;
        }
        if (null !== $this->certificate) {
            $res['certificate'] = $this->certificate;
        }
        if (null !== $this->privateKey) {
            $res['private_key'] = $this->privateKey;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCertificateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['paas_region_id'])) {
            $model->paasRegionId = $map['paas_region_id'];
        }
        if (isset($map['certificate'])) {
            $model->certificate = $map['certificate'];
        }
        if (isset($map['private_key'])) {
            $model->privateKey = $map['private_key'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }

        return $model;
    }
}
