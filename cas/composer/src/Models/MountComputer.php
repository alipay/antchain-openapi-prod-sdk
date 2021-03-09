<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class MountComputer extends Model
{
    // computer
    /**
     * @example
     *
     * @var Computer
     */
    public $computer;

    // domain
    /**
     * @example domain
     *
     * @var string
     */
    public $domain;

    // loadbalancer
    /**
     * @example
     *
     * @var LoadBalancer
     */
    public $loadbalancer;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // weight
    /**
     * @example weight
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'computer'     => 'computer',
        'domain'       => 'domain',
        'loadbalancer' => 'loadbalancer',
        'status'       => 'status',
        'weight'       => 'weight',
    ];

    public function validate()
    {
        Model::validateRequired('weight', $this->weight, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->computer) {
            $res['computer'] = null !== $this->computer ? $this->computer->toMap() : null;
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->loadbalancer) {
            $res['loadbalancer'] = null !== $this->loadbalancer ? $this->loadbalancer->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MountComputer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['computer'])) {
            $model->computer = Computer::fromMap($map['computer']);
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['loadbalancer'])) {
            $model->loadbalancer = LoadBalancer::fromMap($map['loadbalancer']);
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
