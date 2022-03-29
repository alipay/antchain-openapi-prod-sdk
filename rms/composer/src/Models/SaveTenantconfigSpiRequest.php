<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class SaveTenantconfigSpiRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // configKey参数名称
    /**
     * @var string
     */
    public $entityName;

    // end_point
    /**
     * @var string
     */
    public $endPoint;

    // 默认为CamelCase
    /**
     * @var string
     */
    public $fieldNamingStrategy;

    // 云厂商类型
    /**
     * @var string
     */
    public $cloudVendorType;
    protected $_name = [
        'authToken'           => 'auth_token',
        'workspaceName'       => 'workspace_name',
        'entityName'          => 'entity_name',
        'endPoint'            => 'end_point',
        'fieldNamingStrategy' => 'field_naming_strategy',
        'cloudVendorType'     => 'cloud_vendor_type',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('entityName', $this->entityName, true);
        Model::validateRequired('endPoint', $this->endPoint, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->entityName) {
            $res['entity_name'] = $this->entityName;
        }
        if (null !== $this->endPoint) {
            $res['end_point'] = $this->endPoint;
        }
        if (null !== $this->fieldNamingStrategy) {
            $res['field_naming_strategy'] = $this->fieldNamingStrategy;
        }
        if (null !== $this->cloudVendorType) {
            $res['cloud_vendor_type'] = $this->cloudVendorType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveTenantconfigSpiRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['entity_name'])) {
            $model->entityName = $map['entity_name'];
        }
        if (isset($map['end_point'])) {
            $model->endPoint = $map['end_point'];
        }
        if (isset($map['field_naming_strategy'])) {
            $model->fieldNamingStrategy = $map['field_naming_strategy'];
        }
        if (isset($map['cloud_vendor_type'])) {
            $model->cloudVendorType = $map['cloud_vendor_type'];
        }

        return $model;
    }
}
