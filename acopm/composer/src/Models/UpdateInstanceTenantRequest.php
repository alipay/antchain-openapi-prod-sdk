<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class UpdateInstanceTenantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 履约幂等号
    /**
     * @var string
     */
    public $bizNo;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 租户操作
    /**
     * @var string
     */
    public $tenantOperatorEnum;

    // 扩展信息
    /**
     * @var string
     */
    public $extensionInfo;

    // 修改时间戳
    /**
     * @var string
     */
    public $versionTimestamp;
    protected $_name = [
        'authToken'          => 'auth_token',
        'instanceId'         => 'instance_id',
        'bizNo'              => 'biz_no',
        'tenantId'           => 'tenant_id',
        'tenantOperatorEnum' => 'tenant_operator_enum',
        'extensionInfo'      => 'extension_info',
        'versionTimestamp'   => 'version_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tenantOperatorEnum', $this->tenantOperatorEnum, true);
        Model::validateRequired('versionTimestamp', $this->versionTimestamp, true);
        Model::validatePattern('versionTimestamp', $this->versionTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantOperatorEnum) {
            $res['tenant_operator_enum'] = $this->tenantOperatorEnum;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->versionTimestamp) {
            $res['version_timestamp'] = $this->versionTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateInstanceTenantRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_operator_enum'])) {
            $model->tenantOperatorEnum = $map['tenant_operator_enum'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['version_timestamp'])) {
            $model->versionTimestamp = $map['version_timestamp'];
        }

        return $model;
    }
}
