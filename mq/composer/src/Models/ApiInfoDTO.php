<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ApiInfoDTO extends Model
{
    // api详细描述
    /**
     * @example 使用本接口根据 Message Key 查询消息的方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
     *
     * @var string
     */
    public $description;

    // api名
    /**
     * @example sofa.mq.sofamq.messagebykey.query
     *
     * @var string
     */
    public $name;

    // 负责人
    /**
     * @example 子欢
     *
     * @var string
     */
    public $owner;

    // api路径
    /**
     * @example /openapi/mq/openapi/sofamq/message/getByKey
     *
     * @var string
     */
    public $path;

    // api简介
    /**
     * @example  通过传入 Key 进行模糊查询
     *
     * @var string
     */
    public $summary;

    // 开关
    /**
     * @example true, false
     *
     * @var bool
     */
    public $switchOpen;

    // sofamq action 名称
    /**
     * @example topic.create
     *
     * @var string
     */
    public $sofamqAction;

    // 是否默认分配给普通用户
    /**
     * @example true, false
     *
     * @var bool
     */
    public $userDefaultAssign;

    // 是否默认分配给 app owner
    /**
     * @example true, false
     *
     * @var bool
     */
    public $ownerDefaultAssign;
    protected $_name = [
        'description'        => 'description',
        'name'               => 'name',
        'owner'              => 'owner',
        'path'               => 'path',
        'summary'            => 'summary',
        'switchOpen'         => 'switch_open',
        'sofamqAction'       => 'sofamq_action',
        'userDefaultAssign'  => 'user_default_assign',
        'ownerDefaultAssign' => 'owner_default_assign',
    ];

    public function validate()
    {
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('summary', $this->summary, true);
        Model::validateRequired('switchOpen', $this->switchOpen, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->summary) {
            $res['summary'] = $this->summary;
        }
        if (null !== $this->switchOpen) {
            $res['switch_open'] = $this->switchOpen;
        }
        if (null !== $this->sofamqAction) {
            $res['sofamq_action'] = $this->sofamqAction;
        }
        if (null !== $this->userDefaultAssign) {
            $res['user_default_assign'] = $this->userDefaultAssign;
        }
        if (null !== $this->ownerDefaultAssign) {
            $res['owner_default_assign'] = $this->ownerDefaultAssign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['summary'])) {
            $model->summary = $map['summary'];
        }
        if (isset($map['switch_open'])) {
            $model->switchOpen = $map['switch_open'];
        }
        if (isset($map['sofamq_action'])) {
            $model->sofamqAction = $map['sofamq_action'];
        }
        if (isset($map['user_default_assign'])) {
            $model->userDefaultAssign = $map['user_default_assign'];
        }
        if (isset($map['owner_default_assign'])) {
            $model->ownerDefaultAssign = $map['owner_default_assign'];
        }

        return $model;
    }
}
