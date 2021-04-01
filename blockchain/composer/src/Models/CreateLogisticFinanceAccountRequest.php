<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateLogisticFinanceAccountRequest extends Model
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

    // 指定的分布式数字身份，缺省时默认为自己的分布式数字身份
    /**
     * @var string
     */
    public $did;

    // 纳税人识别号
    /**
     * @var string
     */
    public $draweeTaxNo;

    // 业务方企业id
    /**
     * @var string
     */
    public $orgId;

    // 业务方用户id
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'draweeTaxNo'       => 'drawee_tax_no',
        'orgId'             => 'org_id',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('draweeTaxNo', $this->draweeTaxNo, true);
        Model::validateRequired('orgId', $this->orgId, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->draweeTaxNo) {
            $res['drawee_tax_no'] = $this->draweeTaxNo;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLogisticFinanceAccountRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['drawee_tax_no'])) {
            $model->draweeTaxNo = $map['drawee_tax_no'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
