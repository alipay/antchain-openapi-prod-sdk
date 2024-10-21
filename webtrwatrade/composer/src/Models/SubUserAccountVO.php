<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class SubUserAccountVO extends Model
{
    // 用户账户id
    /**
     * @example userAccountId
     *
     * @var string
     */
    public $userAccountId;

    // 用户id
    /**
     * @example userId
     *
     * @var string
     */
    public $userId;

    // 用户地址
    /**
     * @example userAddress
     *
     * @var string
     */
    public $userAddress;

    // 用户资产配额
    /**
     * @example userTarget
     *
     * @var string
     */
    public $userTarget;

    // 用户资产
    /**
     * @example userBalance
     *
     * @var string
     */
    public $userBalance;

    // 项目id
    /**
     * @example assetProjectId
     *
     * @var string
     */
    public $assetProjectId;

    // 项目名称
    /**
     * @example assetProjectName
     *
     * @var string
     */
    public $assetProjectName;

    // 用户所属机构id
    /**
     * @example institutionId
     *
     * @var string
     */
    public $institutionId;

    // 用户所属机构名称
    /**
     * @example institutionName
     *
     * @var string
     */
    public $institutionName;
    protected $_name = [
        'userAccountId'    => 'user_account_id',
        'userId'           => 'user_id',
        'userAddress'      => 'user_address',
        'userTarget'       => 'user_target',
        'userBalance'      => 'user_balance',
        'assetProjectId'   => 'asset_project_id',
        'assetProjectName' => 'asset_project_name',
        'institutionId'    => 'institution_id',
        'institutionName'  => 'institution_name',
    ];

    public function validate()
    {
        Model::validateRequired('userAccountId', $this->userAccountId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userAddress', $this->userAddress, true);
        Model::validateRequired('userTarget', $this->userTarget, true);
        Model::validateRequired('userBalance', $this->userBalance, true);
        Model::validateRequired('assetProjectId', $this->assetProjectId, true);
        Model::validateRequired('assetProjectName', $this->assetProjectName, true);
        Model::validateRequired('institutionId', $this->institutionId, true);
        Model::validateRequired('institutionName', $this->institutionName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userAccountId) {
            $res['user_account_id'] = $this->userAccountId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->userTarget) {
            $res['user_target'] = $this->userTarget;
        }
        if (null !== $this->userBalance) {
            $res['user_balance'] = $this->userBalance;
        }
        if (null !== $this->assetProjectId) {
            $res['asset_project_id'] = $this->assetProjectId;
        }
        if (null !== $this->assetProjectName) {
            $res['asset_project_name'] = $this->assetProjectName;
        }
        if (null !== $this->institutionId) {
            $res['institution_id'] = $this->institutionId;
        }
        if (null !== $this->institutionName) {
            $res['institution_name'] = $this->institutionName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubUserAccountVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_account_id'])) {
            $model->userAccountId = $map['user_account_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['user_target'])) {
            $model->userTarget = $map['user_target'];
        }
        if (isset($map['user_balance'])) {
            $model->userBalance = $map['user_balance'];
        }
        if (isset($map['asset_project_id'])) {
            $model->assetProjectId = $map['asset_project_id'];
        }
        if (isset($map['asset_project_name'])) {
            $model->assetProjectName = $map['asset_project_name'];
        }
        if (isset($map['institution_id'])) {
            $model->institutionId = $map['institution_id'];
        }
        if (isset($map['institution_name'])) {
            $model->institutionName = $map['institution_name'];
        }

        return $model;
    }
}
