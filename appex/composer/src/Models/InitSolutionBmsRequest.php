<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class InitSolutionBmsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 链ID
    /**
     * @var string
     */
    public $bizid;

    // 账户名称
    /**
     * @var string
     */
    public $account;

    // 合约ID
    /**
     * @var string
     */
    public $contractId;

    // 合约名称
    /**
     * @var string
     */
    public $contractName;

    // 合约临时url
    /**
     * @var string
     */
    public $contractUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'account'           => 'account',
        'contractId'        => 'contract_id',
        'contractName'      => 'contract_name',
        'contractUrl'       => 'contract_url',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('account', $this->account, true);
        Model::validateRequired('contractId', $this->contractId, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('contractUrl', $this->contractUrl, true);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->contractUrl) {
            $res['contract_url'] = $this->contractUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitSolutionBmsRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['contract_url'])) {
            $model->contractUrl = $map['contract_url'];
        }

        return $model;
    }
}
