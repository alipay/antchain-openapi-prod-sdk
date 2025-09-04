<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class QueryIssuerRequest extends Model
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

    // 资产项目ID
    /**
     * @var string
     */
    public $assetProjectId;

    // 资产项目合约地址
    /**
     * @var string
     */
    public $assetProjectAddress;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 用户地址
    /**
     * @var string
     */
    public $userAddress;

    // 登录名
    /**
     * @var string
     */
    public $loginName;

    // 登录名类型(EMAIL)
    /**
     * @var string
     */
    public $loginAccoutType;

    // 开始时间 (时间戳)
    /**
     * @var int
     */
    public $startTimeMills;

    // 结束时间 (时间戳)
    /**
     * @var int
     */
    public $endTimeMills;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'assetProjectId'      => 'asset_project_id',
        'assetProjectAddress' => 'asset_project_address',
        'userId'              => 'user_id',
        'userAddress'         => 'user_address',
        'loginName'           => 'login_name',
        'loginAccoutType'     => 'login_accout_type',
        'startTimeMills'      => 'start_time_mills',
        'endTimeMills'        => 'end_time_mills',
    ];

    public function validate()
    {
        Model::validateRequired('startTimeMills', $this->startTimeMills, true);
        Model::validateRequired('endTimeMills', $this->endTimeMills, true);
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
        if (null !== $this->assetProjectId) {
            $res['asset_project_id'] = $this->assetProjectId;
        }
        if (null !== $this->assetProjectAddress) {
            $res['asset_project_address'] = $this->assetProjectAddress;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->loginAccoutType) {
            $res['login_accout_type'] = $this->loginAccoutType;
        }
        if (null !== $this->startTimeMills) {
            $res['start_time_mills'] = $this->startTimeMills;
        }
        if (null !== $this->endTimeMills) {
            $res['end_time_mills'] = $this->endTimeMills;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIssuerRequest
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
        if (isset($map['asset_project_id'])) {
            $model->assetProjectId = $map['asset_project_id'];
        }
        if (isset($map['asset_project_address'])) {
            $model->assetProjectAddress = $map['asset_project_address'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['login_accout_type'])) {
            $model->loginAccoutType = $map['login_accout_type'];
        }
        if (isset($map['start_time_mills'])) {
            $model->startTimeMills = $map['start_time_mills'];
        }
        if (isset($map['end_time_mills'])) {
            $model->endTimeMills = $map['end_time_mills'];
        }

        return $model;
    }
}
