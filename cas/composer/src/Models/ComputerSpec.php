<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ComputerSpec extends Model
{
    // cpu个数
    /**
     * @example 1
     *
     * @var int
     */
    public $cpu;

    // 可以挂载的磁盘类型
    /**
     * @example
     *
     * @var string[]
     */
    public $diskSpecIds;

    // 服务器规格名称
    /**
     * @example group
     *
     * @var string
     */
    public $group;

    // 是否有IO优化
    /**
     * @example true, false
     *
     * @var bool
     */
    public $ioOptimized;

    // 内存大小
    /**
     * @example 12
     *
     * @var int
     */
    public $memory;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // enable
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enable;

    // iaasId
    /**
     * @example iaasId
     *
     * @var string
     */
    public $iaasId;

    // COMPUTER_ECS
    /**
     * @example COMPUTER_ECS
     *
     * @var string
     */
    public $iaasType;

    // id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $id;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // providerId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $providerId;
    protected $_name = [
        'cpu'         => 'cpu',
        'diskSpecIds' => 'disk_spec_ids',
        'group'       => 'group',
        'ioOptimized' => 'io_optimized',
        'memory'      => 'memory',
        'description' => 'description',
        'enable'      => 'enable',
        'iaasId'      => 'iaas_id',
        'iaasType'    => 'iaas_type',
        'id'          => 'id',
        'name'        => 'name',
        'providerId'  => 'provider_id',
    ];

    public function validate()
    {
        Model::validateRequired('group', $this->group, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->diskSpecIds) {
            $res['disk_spec_ids'] = $this->diskSpecIds;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->ioOptimized) {
            $res['io_optimized'] = $this->ioOptimized;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComputerSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['disk_spec_ids'])) {
            if (!empty($map['disk_spec_ids'])) {
                $model->diskSpecIds = $map['disk_spec_ids'];
            }
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['io_optimized'])) {
            $model->ioOptimized = $map['io_optimized'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }

        return $model;
    }
}
