<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeleteDeviceRelationRequest extends Model
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

    // 主设备链上id
    /**
     * @var string
     */
    public $subjectChainDeviceId;

    // 关系谓语，目前取值范围：SUB_DEVICE（子设备）
    /**
     * @var string
     */
    public $predicate;

    // 关联设备链上id
    /**
     * @var string
     */
    public $objectChainDeviceId;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'subjectChainDeviceId' => 'subject_chain_device_id',
        'predicate'            => 'predicate',
        'objectChainDeviceId'  => 'object_chain_device_id',
    ];

    public function validate()
    {
        Model::validateRequired('subjectChainDeviceId', $this->subjectChainDeviceId, true);
        Model::validateRequired('predicate', $this->predicate, true);
        Model::validateRequired('objectChainDeviceId', $this->objectChainDeviceId, true);
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
        if (null !== $this->subjectChainDeviceId) {
            $res['subject_chain_device_id'] = $this->subjectChainDeviceId;
        }
        if (null !== $this->predicate) {
            $res['predicate'] = $this->predicate;
        }
        if (null !== $this->objectChainDeviceId) {
            $res['object_chain_device_id'] = $this->objectChainDeviceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteDeviceRelationRequest
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
        if (isset($map['subject_chain_device_id'])) {
            $model->subjectChainDeviceId = $map['subject_chain_device_id'];
        }
        if (isset($map['predicate'])) {
            $model->predicate = $map['predicate'];
        }
        if (isset($map['object_chain_device_id'])) {
            $model->objectChainDeviceId = $map['object_chain_device_id'];
        }

        return $model;
    }
}
