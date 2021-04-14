<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseAssetagentregisterRequest extends Model
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

    // 被代理机构的金融科技租户id
    /**
     * @var string
     */
    public $agentLeaseId;

    // 代理合同id，作为存证使用
    /**
     * @var string
     */
    public $contractId;

    // 被代理租赁机构统一社会信用码
    //
    //
    /**
     * @var string
     */
    public $leaseCorpId;

    // 被代理租赁机构名称
    /**
     * @var string
     */
    public $leaseCorpName;

    // 被代理租赁机构法人姓名
    /**
     * @var string
     */
    public $leaseCorpOwnerName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'agentLeaseId'       => 'agent_lease_id',
        'contractId'         => 'contract_id',
        'leaseCorpId'        => 'lease_corp_id',
        'leaseCorpName'      => 'lease_corp_name',
        'leaseCorpOwnerName' => 'lease_corp_owner_name',
    ];

    public function validate()
    {
        Model::validateRequired('agentLeaseId', $this->agentLeaseId, true);
        Model::validateRequired('contractId', $this->contractId, true);
        Model::validateRequired('leaseCorpId', $this->leaseCorpId, true);
        Model::validateRequired('leaseCorpName', $this->leaseCorpName, true);
        Model::validateRequired('leaseCorpOwnerName', $this->leaseCorpOwnerName, true);
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
        if (null !== $this->agentLeaseId) {
            $res['agent_lease_id'] = $this->agentLeaseId;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->leaseCorpId) {
            $res['lease_corp_id'] = $this->leaseCorpId;
        }
        if (null !== $this->leaseCorpName) {
            $res['lease_corp_name'] = $this->leaseCorpName;
        }
        if (null !== $this->leaseCorpOwnerName) {
            $res['lease_corp_owner_name'] = $this->leaseCorpOwnerName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseAssetagentregisterRequest
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
        if (isset($map['agent_lease_id'])) {
            $model->agentLeaseId = $map['agent_lease_id'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['lease_corp_id'])) {
            $model->leaseCorpId = $map['lease_corp_id'];
        }
        if (isset($map['lease_corp_name'])) {
            $model->leaseCorpName = $map['lease_corp_name'];
        }
        if (isset($map['lease_corp_owner_name'])) {
            $model->leaseCorpOwnerName = $map['lease_corp_owner_name'];
        }

        return $model;
    }
}
