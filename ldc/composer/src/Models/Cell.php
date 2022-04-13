<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class Cell extends Model
{
    // 所属逻辑单元名称[单元化模式特有]。
    /**
     * @example RZM0
     *
     * @var string
     */
    public $cellGroup;

    // 蓝绿着色信息[单元化模式特有]。
    /**
     * @example Blue
     *
     * @var string
     */
    public $color;

    // 创建时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 部署单元标识，创建之后不允许修改。
    /**
     * @example RZM0A
     *
     * @var string
     */
    public $identity;

    // 是否灰度[单元化模式特有]。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isGray;

    // 部署单元名称，主要用作页面展示。
    /**
     * @example RZM0A
     *
     * @var string
     */
    public $name;

    // 压测权重
    /**
     * @example 50
     *
     * @var int
     */
    public $pressWeight;

    // 部署单元类型[单元化模式特有]。
    /**
     * @example 本地域
     *
     * @var string
     */
    public $type;

    // 默认权重[单元化模式特有]。
    /**
     * @example 5
     *
     * @var int
     */
    public $weight;

    // 所属工作空间名称。
    /**
     * @example hz-dev
     *
     * @var string
     */
    public $workspace;

    // 所属机房信息。
    /**
     * @example CM10
     *
     * @var string
     */
    public $zone;

    // cell名称，与name一样，为了兼容已有代码
    /**
     * @example RZM0A
     *
     * @var string
     */
    public $displayName;

    // 所属cluster
    /**
     * @example mayibank-sit
     *
     * @var string
     */
    public $cluster;
    protected $_name = [
        'cellGroup'   => 'cell_group',
        'color'       => 'color',
        'createdTime' => 'created_time',
        'identity'    => 'identity',
        'isGray'      => 'is_gray',
        'name'        => 'name',
        'pressWeight' => 'press_weight',
        'type'        => 'type',
        'weight'      => 'weight',
        'workspace'   => 'workspace',
        'zone'        => 'zone',
        'displayName' => 'display_name',
        'cluster'     => 'cluster',
    ];

    public function validate()
    {
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('zone', $this->zone, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellGroup) {
            $res['cell_group'] = $this->cellGroup;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->isGray) {
            $res['is_gray'] = $this->isGray;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pressWeight) {
            $res['press_weight'] = $this->pressWeight;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cell
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_group'])) {
            $model->cellGroup = $map['cell_group'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['is_gray'])) {
            $model->isGray = $map['is_gray'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['press_weight'])) {
            $model->pressWeight = $map['press_weight'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }

        return $model;
    }
}
