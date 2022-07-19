<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class DeploySolutionContractRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizid;

    // 链操作者信息
    /**
     * @var string
     */
    public $operator;

    // 合约名称
    /**
     * @var string
     */
    public $contractName;

    // 提交记录ID
    /**
     * @var string
     */
    public $commitId;

    // 当前分支
    /**
     * @var string
     */
    public $branch;

    // 合约仓库路径
    /**
     * @var string
     */
    public $gitRepo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'operator'          => 'operator',
        'contractName'      => 'contract_name',
        'commitId'          => 'commit_id',
        'branch'            => 'branch',
        'gitRepo'           => 'git_repo',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('commitId', $this->commitId, true);
        Model::validateRequired('branch', $this->branch, true);
        Model::validateRequired('gitRepo', $this->gitRepo, true);
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
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->commitId) {
            $res['commit_id'] = $this->commitId;
        }
        if (null !== $this->branch) {
            $res['branch'] = $this->branch;
        }
        if (null !== $this->gitRepo) {
            $res['git_repo'] = $this->gitRepo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeploySolutionContractRequest
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
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['commit_id'])) {
            $model->commitId = $map['commit_id'];
        }
        if (isset($map['branch'])) {
            $model->branch = $map['branch'];
        }
        if (isset($map['git_repo'])) {
            $model->gitRepo = $map['git_repo'];
        }

        return $model;
    }
}
