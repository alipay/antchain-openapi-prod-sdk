<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UserGroup extends Model
{
    // ID
    /**
     * @example 15
     *
     * @var int
     */
    public $id;

    // 通知组名称
    /**
     * @example 日志通知
     *
     * @var string
     */
    public $name;

    // 最后修改人
    /**
     * @example antcloudcore@antfin.com
     *
     * @var string
     */
    public $modifier;

    // 最后修改时间
    /**
     * @example 1611845221912
     *
     * @var int
     */
    public $gmtModified;

    // 用户组关联关系
    /**
     * @example
     *
     * @var UserGroupRelation[]
     */
    public $relations;

    // 全局订阅
    /**
     * @example true, false
     *
     * @var bool
     */
    public $scopeGlobal;

    // 0、当前workspace有效；
    // 1、租户有效；
    /**
     * @example 0,1
     *
     * @var int
     */
    public $validScope;

    // 当前用户组的告警规则定阅数量
    /**
     * @example 0
     *
     * @var int
     */
    public $subscribeCount;
    protected $_name = [
        'id'             => 'id',
        'name'           => 'name',
        'modifier'       => 'modifier',
        'gmtModified'    => 'gmt_modified',
        'relations'      => 'relations',
        'scopeGlobal'    => 'scope_global',
        'validScope'     => 'valid_scope',
        'subscribeCount' => 'subscribe_count',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('modifier', $this->modifier, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('relations', $this->relations, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->relations) {
            $res['relations'] = [];
            if (null !== $this->relations && \is_array($this->relations)) {
                $n = 0;
                foreach ($this->relations as $item) {
                    $res['relations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->scopeGlobal) {
            $res['scope_global'] = $this->scopeGlobal;
        }
        if (null !== $this->validScope) {
            $res['valid_scope'] = $this->validScope;
        }
        if (null !== $this->subscribeCount) {
            $res['subscribe_count'] = $this->subscribeCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['relations'])) {
            if (!empty($map['relations'])) {
                $model->relations = [];
                $n                = 0;
                foreach ($map['relations'] as $item) {
                    $model->relations[$n++] = null !== $item ? UserGroupRelation::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['scope_global'])) {
            $model->scopeGlobal = $map['scope_global'];
        }
        if (isset($map['valid_scope'])) {
            $model->validScope = $map['valid_scope'];
        }
        if (isset($map['subscribe_count'])) {
            $model->subscribeCount = $map['subscribe_count'];
        }

        return $model;
    }
}
