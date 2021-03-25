<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdateLeaseContractRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contractId' => 'contract_id',
        'applicationId' => 'application_id',
    ];
    public function validate() {
        Model::validateRequired('contractId', $this->contractId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateLeaseContractRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['contract_id'])){
            $model->contractId = $map['contract_id'];
        }
        if(isset($map['application_id'])){
            $model->applicationId = $map['application_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 被升级的合约名称
    /**
     * @var string
     */
    public $contractId;

    // 合约业务层id
    /**
     * @var string
     */
    public $applicationId;

}
