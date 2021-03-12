<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

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

    // 成员数量
    /**
     * @example 5
     *
     * @var int
     */
    public $memberNum;

    // 时间戳
    /**
     * @example 时间戳
     *
     * @var int
     */
    public $createTime;

    // 角色
    /**
     * @example 角色
     *
     * @var string
     */
    public $role;

    // 联盟id
    /**
     * @example 联盟id
     *
     * @var string
     */
    public $consortiumId;

    // 状态值
    /**
     * @example 状态值
     *
     * @var string
     */
    public $status;

    // 联盟名称
    /**
     * @example 联盟名称
     *
     * @var string
     */
    public $consortiumName;

    // 联盟描述
    /**
     * @example 联盟描述
     *
     * @var string
     */
    public $consortiumDescription;

    // 是否为空联盟
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isEmptyConsortium;
    protected $_name = [
        'chainNum'              => 'chain_num',
        'memberNum'             => 'member_num',
        'createTime'            => 'create_time',
        'role'                  => 'role',
        'consortiumId'          => 'consortium_id',
        'status'                => 'status',
        'consortiumName'        => 'consortium_name',
        'consortiumDescription' => 'consortium_description',
        'isEmptyConsortium'     => 'is_empty_consortium',
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
        if (null !== $this->memberNum) {
            $res['member_num'] = $this->memberNum;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->consortiumName) {
            $res['consortium_name'] = $this->consortiumName;
        }
        if (null !== $this->consortiumDescription) {
            $res['consortium_description'] = $this->consortiumDescription;
        }
        if (null !== $this->isEmptyConsortium) {
            $res['is_empty_consortium'] = $this->isEmptyConsortium;
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
        if (isset($map['member_num'])) {
            $model->memberNum = $map['member_num'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['consortium_name'])) {
            $model->consortiumName = $map['consortium_name'];
        }
        if (isset($map['consortium_description'])) {
            $model->consortiumDescription = $map['consortium_description'];
        }
        if (isset($map['is_empty_consortium'])) {
            $model->isEmptyConsortium = $map['is_empty_consortium'];
        }

        return $model;
    }
}
