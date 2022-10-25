<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class VerifyRefinancePackageRequest extends Model
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

    // 资产包id
    /**
     * @var string
     */
    public $packageId;

    // AUDIT_SUCCESS(审核通过), AUDIT_REFUSE(审核驳回), AUDITING(审核中，需要调无效资产推送将无效资产分批推送过来)
    /**
     * @var string
     */
    public $auditStatus;

    // 放款金额，单位毫厘
    /**
     * @var int
     */
    public $recreditLimit;

    // 再融资放款流水号
    /**
     * @var string
     */
    public $recreditSerialNumber;

    // 额外审核信息说明
    /**
     * @var string
     */
    public $auditMessage;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'packageId'            => 'package_id',
        'auditStatus'          => 'audit_status',
        'recreditLimit'        => 'recredit_limit',
        'recreditSerialNumber' => 'recredit_serial_number',
        'auditMessage'         => 'audit_message',
    ];

    public function validate()
    {
        Model::validateRequired('packageId', $this->packageId, true);
        Model::validateRequired('auditStatus', $this->auditStatus, true);
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
        if (null !== $this->packageId) {
            $res['package_id'] = $this->packageId;
        }
        if (null !== $this->auditStatus) {
            $res['audit_status'] = $this->auditStatus;
        }
        if (null !== $this->recreditLimit) {
            $res['recredit_limit'] = $this->recreditLimit;
        }
        if (null !== $this->recreditSerialNumber) {
            $res['recredit_serial_number'] = $this->recreditSerialNumber;
        }
        if (null !== $this->auditMessage) {
            $res['audit_message'] = $this->auditMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyRefinancePackageRequest
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
        if (isset($map['package_id'])) {
            $model->packageId = $map['package_id'];
        }
        if (isset($map['audit_status'])) {
            $model->auditStatus = $map['audit_status'];
        }
        if (isset($map['recredit_limit'])) {
            $model->recreditLimit = $map['recredit_limit'];
        }
        if (isset($map['recredit_serial_number'])) {
            $model->recreditSerialNumber = $map['recredit_serial_number'];
        }
        if (isset($map['audit_message'])) {
            $model->auditMessage = $map['audit_message'];
        }

        return $model;
    }
}
