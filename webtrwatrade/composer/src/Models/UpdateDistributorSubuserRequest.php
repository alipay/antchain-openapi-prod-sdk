<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class UpdateDistributorSubuserRequest extends Model
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

    // 二级用户账号
    /**
     * @var string
     */
    public $subUserAccountId;

    // 用户id
    /**
     * @var string
     */
    public $subUserId;

    // 二级用户钱包地址
    /**
     * @var string
     */
    public $subUserAddress;

    // assetProjectId
    /**
     * @var string
     */
    public $assetProjectId;

    // userTarget
    /**
     * @var string
     */
    public $userTarget;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'subUserAccountId'  => 'sub_user_account_id',
        'subUserId'         => 'sub_user_id',
        'subUserAddress'    => 'sub_user_address',
        'assetProjectId'    => 'asset_project_id',
        'userTarget'        => 'user_target',
    ];

    public function validate()
    {
        Model::validateRequired('subUserAccountId', $this->subUserAccountId, true);
        Model::validateRequired('assetProjectId', $this->assetProjectId, true);
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
        if (null !== $this->subUserAccountId) {
            $res['sub_user_account_id'] = $this->subUserAccountId;
        }
        if (null !== $this->subUserId) {
            $res['sub_user_id'] = $this->subUserId;
        }
        if (null !== $this->subUserAddress) {
            $res['sub_user_address'] = $this->subUserAddress;
        }
        if (null !== $this->assetProjectId) {
            $res['asset_project_id'] = $this->assetProjectId;
        }
        if (null !== $this->userTarget) {
            $res['user_target'] = $this->userTarget;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDistributorSubuserRequest
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
        if (isset($map['sub_user_account_id'])) {
            $model->subUserAccountId = $map['sub_user_account_id'];
        }
        if (isset($map['sub_user_id'])) {
            $model->subUserId = $map['sub_user_id'];
        }
        if (isset($map['sub_user_address'])) {
            $model->subUserAddress = $map['sub_user_address'];
        }
        if (isset($map['asset_project_id'])) {
            $model->assetProjectId = $map['asset_project_id'];
        }
        if (isset($map['user_target'])) {
            $model->userTarget = $map['user_target'];
        }

        return $model;
    }
}
