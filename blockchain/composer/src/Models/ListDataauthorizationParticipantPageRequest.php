<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListDataauthorizationParticipantPageRequest extends Model
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

    // 信用代码编号
    /**
     * @var string
     */
    public $creditNumber;

    // 参与方名字
    /**
     * @var string
     */
    public $name;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页数量
    /**
     * @var int
     */
    public $pageSize;

    // 角色
    /**
     * @var string
     */
    public $role;

    // 空间ID
    /**
     * @var string
     */
    public $spaceId;

    // 账户名称
    /**
     * @var string
     */
    public $account;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'creditNumber'      => 'credit_number',
        'name'              => 'name',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'role'              => 'role',
        'spaceId'           => 'space_id',
        'account'           => 'account',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateMinimum('pageNum', $this->pageNum, 1);
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
        if (null !== $this->creditNumber) {
            $res['credit_number'] = $this->creditNumber;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDataauthorizationParticipantPageRequest
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
        if (isset($map['credit_number'])) {
            $model->creditNumber = $map['credit_number'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }

        return $model;
    }
}
