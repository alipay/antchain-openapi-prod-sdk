<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VComputer extends Model
{
    // v_computer_group
    /**
     * @example
     *
     * @var VComputerGroup
     */
    public $vComputerGroup;

    // ip
    /**
     * @example ip
     *
     * @var string
     */
    public $ip;

    // computer
    /**
     * @example
     *
     * @var Computer
     */
    public $computer;

    // port
    /**
     * @example
     *
     * @var int
     */
    public $port;

    // weight
    /**
     * @example weight
     *
     * @var int
     */
    public $weight;

    // 是否是EIP
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isEip;

    // is_managed_computer
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isManagedComputer;

    // iaas_id
    /**
     * @example iaas_id
     *
     * @var string
     */
    public $iaasId;
    protected $_name = [
        'vComputerGroup'    => 'v_computer_group',
        'ip'                => 'ip',
        'computer'          => 'computer',
        'port'              => 'port',
        'weight'            => 'weight',
        'isEip'             => 'is_eip',
        'isManagedComputer' => 'is_managed_computer',
        'iaasId'            => 'iaas_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->vComputerGroup) {
            $res['v_computer_group'] = null !== $this->vComputerGroup ? $this->vComputerGroup->toMap() : null;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->computer) {
            $res['computer'] = null !== $this->computer ? $this->computer->toMap() : null;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->isEip) {
            $res['is_eip'] = $this->isEip;
        }
        if (null !== $this->isManagedComputer) {
            $res['is_managed_computer'] = $this->isManagedComputer;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VComputer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['v_computer_group'])) {
            $model->vComputerGroup = VComputerGroup::fromMap($map['v_computer_group']);
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['computer'])) {
            $model->computer = Computer::fromMap($map['computer']);
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['is_eip'])) {
            $model->isEip = $map['is_eip'];
        }
        if (isset($map['is_managed_computer'])) {
            $model->isManagedComputer = $map['is_managed_computer'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }

        return $model;
    }
}
