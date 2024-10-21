<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class CreateDistributorSubuserRequest extends Model
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

    // 钱包地址
    /**
     * @var string
     */
    public $walletAddress;

    // 项目名称
    /**
     * @var string
     */
    public $projectName;

    // 项目id
    /**
     * @var string
     */
    public $projectId;

    // 用户资产配额
    /**
     * @var string
     */
    public $userTarget;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'walletAddress'     => 'wallet_address',
        'projectName'       => 'project_name',
        'projectId'         => 'project_id',
        'userTarget'        => 'user_target',
    ];

    public function validate()
    {
        Model::validateRequired('walletAddress', $this->walletAddress, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('userTarget', $this->userTarget, true);
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
        if (null !== $this->walletAddress) {
            $res['wallet_address'] = $this->walletAddress;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->userTarget) {
            $res['user_target'] = $this->userTarget;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDistributorSubuserRequest
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
        if (isset($map['wallet_address'])) {
            $model->walletAddress = $map['wallet_address'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['user_target'])) {
            $model->userTarget = $map['user_target'];
        }

        return $model;
    }
}
