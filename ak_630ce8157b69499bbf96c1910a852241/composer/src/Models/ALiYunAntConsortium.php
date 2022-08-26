<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class ALiYunAntConsortium extends Model
{
    // 链的数量
    /**
     * @example 2
     *
     * @var int
     */
    public $chainNum;

    // 联盟描述
    /**
     * @example 联盟描述
     *
     * @var string
     */
    public $consortiumDescription;

    // 联盟id
    /**
     * @example 联盟id
     *
     * @var string
     */
    public $consortiumId;

    // 联盟名称
    /**
     * @example 联盟名称
     *
     * @var string
     */
    public $consortiumName;

    // 时间戳
    /**
     * @example 时间戳
     *
     * @var int
     */
    public $createTime;

    // 是否为空联盟
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isEmptyConsortium;

    // 成员数量
    /**
     * @example 5
     *
     * @var int
     */
    public $memberNum;

    // 角色
    /**
     * @example 角色
     *
     * @var string
     */
    public $role;

    // 状态值
    /**
     * @example 状态值
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'chainNum'              => 'chain_num',
        'consortiumDescription' => 'consortium_description',
        'consortiumId'          => 'consortium_id',
        'consortiumName'        => 'consortium_name',
        'createTime'            => 'create_time',
        'isEmptyConsortium'     => 'is_empty_consortium',
        'memberNum'             => 'member_num',
        'role'                  => 'role',
        'status'                => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->chainNum) {
            $res['chain_num'] = $this->chainNum;
        }
        if (null !== $this->consortiumDescription) {
            $res['consortium_description'] = $this->consortiumDescription;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->consortiumName) {
            $res['consortium_name'] = $this->consortiumName;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->isEmptyConsortium) {
            $res['is_empty_consortium'] = $this->isEmptyConsortium;
        }
        if (null !== $this->memberNum) {
            $res['member_num'] = $this->memberNum;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunAntConsortium
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['chain_num'])) {
            $model->chainNum = $map['chain_num'];
        }
        if (isset($map['consortium_description'])) {
            $model->consortiumDescription = $map['consortium_description'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['consortium_name'])) {
            $model->consortiumName = $map['consortium_name'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['is_empty_consortium'])) {
            $model->isEmptyConsortium = $map['is_empty_consortium'];
        }
        if (isset($map['member_num'])) {
            $model->memberNum = $map['member_num'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
