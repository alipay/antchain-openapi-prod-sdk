<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class UpdateInstanceRequest extends Model
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

    // 需变更的实例状态
    /**
     * @var string
     */
    public $instanceStatus;

    // 履约幂等号
    /**
     * @var string
     */
    public $bizNo;

    // L5商品编号
    /**
     * @var string
     */
    public $businessCode;

    // 规格属性
    /**
     * @var string
     */
    public $specification;

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
        'authToken'        => 'auth_token',
        'instanceId'       => 'instance_id',
        'instanceStatus'   => 'instance_status',
        'bizNo'            => 'biz_no',
        'businessCode'     => 'business_code',
        'specification'    => 'specification',
        'extensionInfo'    => 'extension_info',
        'versionTimestamp' => 'version_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('instanceStatus', $this->instanceStatus, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('businessCode', $this->businessCode, true);
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
        if (null !== $this->instanceStatus) {
            $res['instance_status'] = $this->instanceStatus;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->specification) {
            $res['specification'] = $this->specification;
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
     * @return UpdateInstanceRequest
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
        if (isset($map['instance_status'])) {
            $model->instanceStatus = $map['instance_status'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['specification'])) {
            $model->specification = $map['specification'];
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
