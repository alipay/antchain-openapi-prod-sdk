<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateAccountMappingInfoRequest extends Model
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

    // 注册地址
    /**
     * @var string
     */
    public $address;

    // 业务场景code
    /**
     * @var string
     */
    public $bizCode;

    // 业务名称
    /**
     * @var string
     */
    public $bizName;

    // 业务类型，预留
    /**
     * @var string
     */
    public $bizType;

    // 用户创建时间
    /**
     * @var string
     */
    public $createTime;

    // 用户注销时间
    /**
     * @var string
     */
    public $endTime;

    // 扩展字段，使用json格式
    /**
     * @var string
     */
    public $extension;

    // 业务组code
    /**
     * @var string
     */
    public $groupCode;

    // 业务组名称
    /**
     * @var string
     */
    public $groupName;

    // 唯一标示类型，0:统一信用代码,1:开票机构代码,2:身份证号
    /**
     * @var int
     */
    public $identityType;

    // 唯一标示码
    /**
     * @var string
     */
    public $identityValue;

    // 用户标签
    /**
     * @var string
     */
    public $label;

    // 间连用户的上层直连用户名称
    /**
     * @var string
     */
    public $parent;

    // 统计时间
    /**
     * @var string
     */
    public $statDate;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 用户或企业名称
    /**
     * @var string
     */
    public $userName;

    // 用户类型：direct直连，indirect间连，partner合作伙伴
    /**
     * @var string
     */
    public $userType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'address'           => 'address',
        'bizCode'           => 'biz_code',
        'bizName'           => 'biz_name',
        'bizType'           => 'biz_type',
        'createTime'        => 'create_time',
        'endTime'           => 'end_time',
        'extension'         => 'extension',
        'groupCode'         => 'group_code',
        'groupName'         => 'group_name',
        'identityType'      => 'identity_type',
        'identityValue'     => 'identity_value',
        'label'             => 'label',
        'parent'            => 'parent',
        'statDate'          => 'stat_date',
        'userId'            => 'user_id',
        'userName'          => 'user_name',
        'userType'          => 'user_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('bizName', $this->bizName, true);
        Model::validateRequired('groupCode', $this->groupCode, true);
        Model::validateRequired('groupName', $this->groupName, true);
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
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->bizName) {
            $res['biz_name'] = $this->bizName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->groupCode) {
            $res['group_code'] = $this->groupCode;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }
        if (null !== $this->identityType) {
            $res['identity_type'] = $this->identityType;
        }
        if (null !== $this->identityValue) {
            $res['identity_value'] = $this->identityValue;
        }
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }
        if (null !== $this->parent) {
            $res['parent'] = $this->parent;
        }
        if (null !== $this->statDate) {
            $res['stat_date'] = $this->statDate;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAccountMappingInfoRequest
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
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['biz_name'])) {
            $model->bizName = $map['biz_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['group_code'])) {
            $model->groupCode = $map['group_code'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }
        if (isset($map['identity_type'])) {
            $model->identityType = $map['identity_type'];
        }
        if (isset($map['identity_value'])) {
            $model->identityValue = $map['identity_value'];
        }
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }
        if (isset($map['parent'])) {
            $model->parent = $map['parent'];
        }
        if (isset($map['stat_date'])) {
            $model->statDate = $map['stat_date'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }

        return $model;
    }
}
