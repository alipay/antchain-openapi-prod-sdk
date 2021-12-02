<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class ModelCategory extends Model
{
    // 唯一标识（全局唯一）
    /**
     * @example host_manage
     *
     * @var string
     */
    public $uniqueId;

    // 名称（全局唯一）
    /**
     * @example 主机管理
     *
     * @var string
     */
    public $name;

    // 是否为系统内置
    /**
     * @example true, false
     *
     * @var bool
     */
    public $system;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;

    // icon
    /**
     * @example icon
     *
     * @var string
     */
    public $icon;
    protected $_name = [
        'uniqueId'     => 'unique_id',
        'name'         => 'name',
        'system'       => 'system',
        'createdTime'  => 'created_time',
        'modifiedTime' => 'modified_time',
        'icon'         => 'icon',
    ];

    public function validate()
    {
        Model::validateRequired('uniqueId', $this->uniqueId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('system', $this->system, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('modifiedTime', $this->modifiedTime, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->system) {
            $res['system'] = $this->system;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->icon) {
            $res['icon'] = $this->icon;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ModelCategory
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['system'])) {
            $model->system = $map['system'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }
        if (isset($map['icon'])) {
            $model->icon = $map['icon'];
        }

        return $model;
    }
}
