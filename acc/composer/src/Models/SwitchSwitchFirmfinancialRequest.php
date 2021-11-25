<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class SwitchSwitchFirmfinancialRequest extends Model
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

    // 企业id
    /**
     * @var int
     */
    public $firmId;

    // 租户类型
    /**
     * @var string
     */
    public $tenantId;

    // 操作类型（新增：add，删除：delete)
    /**
     * @var string
     */
    public $operationType;

    // 业务id
    /**
     * @var string
     */
    public $bizId;

    // 财报信息
    /**
     * @var FileInfo
     */
    public $fileInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'firmId'            => 'firm_id',
        'tenantId'          => 'tenant_id',
        'operationType'     => 'operation_type',
        'bizId'             => 'biz_id',
        'fileInfo'          => 'file_info',
    ];

    public function validate()
    {
        Model::validateRequired('firmId', $this->firmId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('operationType', $this->operationType, true);
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
        if (null !== $this->firmId) {
            $res['firm_id'] = $this->firmId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->fileInfo) {
            $res['file_info'] = null !== $this->fileInfo ? $this->fileInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SwitchSwitchFirmfinancialRequest
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
        if (isset($map['firm_id'])) {
            $model->firmId = $map['firm_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['file_info'])) {
            $model->fileInfo = FileInfo::fromMap($map['file_info']);
        }

        return $model;
    }
}
