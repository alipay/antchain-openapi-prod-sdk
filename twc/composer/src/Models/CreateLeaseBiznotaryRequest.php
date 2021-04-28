<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseBiznotaryRequest extends Model
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

    // 要存证的文件哈希
    /**
     * @var string
     */
    public $hash;

    // 租赁机构社会统一信用码
    /**
     * @var string
     */
    public $leaseCorpId;

    // 租赁机构公司名称
    /**
     * @var string
     */
    public $leaseCorpName;

    // 租赁机构法人姓名
    /**
     * @var string
     */
    public $leaseCorpOwnerName;

    // 被代理机构金融科技租户id
    /**
     * @var string
     */
    public $agentLeaseId;

    // 模式，代理模式为isvMode
    /**
     * @var string
     */
    public $mode;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'hash'               => 'hash',
        'leaseCorpId'        => 'lease_corp_id',
        'leaseCorpName'      => 'lease_corp_name',
        'leaseCorpOwnerName' => 'lease_corp_owner_name',
        'agentLeaseId'       => 'agent_lease_id',
        'mode'               => 'mode',
    ];

    public function validate()
    {
        Model::validateRequired('hash', $this->hash, true);
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
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
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
        if (null !== $this->agentLeaseId) {
            $res['agent_lease_id'] = $this->agentLeaseId;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseBiznotaryRequest
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
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
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
        if (isset($map['agent_lease_id'])) {
            $model->agentLeaseId = $map['agent_lease_id'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }

        return $model;
    }
}
