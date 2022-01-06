<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class RouterRuleModel extends Model
{
    // [
    // {
    // "type":"system",
    // "field":"app.kubernetes.io/version",
    // "operation":"equal",
    // "value":[
    // "22"
    // ]
    // }
    // ]
    /**
     * @example 见描述
     *
     * @var BaseConditionModel[]
     */
    public $conditions;

    // [
    // {
    // "weight":100,
    // "destination":[
    // {
    // "type":"system",
    // "field":"app.kubernetes.io/version",
    // "operation":"equal",
    // "value":[
    // "22"
    // ]
    // }
    // ]
    // }
    // ]
    /**
     * @example 见描述
     *
     * @var RouterDestinationModel[]
     */
    public $destinations;

    // 是否生效，1 生效，0 未生效。默认未生效
    /**
     * @example 0,1
     *
     * @var int
     */
    public $enabled;

    // fallback
    /**
     * @example 1
     *
     * @var int
     */
    public $fallback;

    // faultProtection
    /**
     * @example 1
     *
     * @var int
     */
    public $faultProtection;

    // 更新时间
    /**
     * @example 1000000
     *
     * @var int
     */
    public $gmtModified;

    // TreeSet<BaseConditionModel>
    /**
     * @example json:[{}]
     *
     * @var BaseConditionModel[]
     */
    public $grays;

    // 规则名
    /**
     * @example 测试规则
     *
     * @var string
     */
    public $name;

    // 优先级
    /**
     * @example 1
     *
     * @var int
     */
    public $orderNum;

    // 唯一UUID
    /**
     * @example gdashikjncpzpfdshokjsd
     *
     * @var string
     */
    public $id;
    protected $_name = [
        'conditions'      => 'conditions',
        'destinations'    => 'destinations',
        'enabled'         => 'enabled',
        'fallback'        => 'fallback',
        'faultProtection' => 'fault_protection',
        'gmtModified'     => 'gmt_modified',
        'grays'           => 'grays',
        'name'            => 'name',
        'orderNum'        => 'order_num',
        'id'              => 'id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->destinations) {
            $res['destinations'] = [];
            if (null !== $this->destinations && \is_array($this->destinations)) {
                $n = 0;
                foreach ($this->destinations as $item) {
                    $res['destinations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->fallback) {
            $res['fallback'] = $this->fallback;
        }
        if (null !== $this->faultProtection) {
            $res['fault_protection'] = $this->faultProtection;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->grays) {
            $res['grays'] = [];
            if (null !== $this->grays && \is_array($this->grays)) {
                $n = 0;
                foreach ($this->grays as $item) {
                    $res['grays'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->orderNum) {
            $res['order_num'] = $this->orderNum;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RouterRuleModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? BaseConditionModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['destinations'])) {
            if (!empty($map['destinations'])) {
                $model->destinations = [];
                $n                   = 0;
                foreach ($map['destinations'] as $item) {
                    $model->destinations[$n++] = null !== $item ? RouterDestinationModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['fallback'])) {
            $model->fallback = $map['fallback'];
        }
        if (isset($map['fault_protection'])) {
            $model->faultProtection = $map['fault_protection'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['grays'])) {
            if (!empty($map['grays'])) {
                $model->grays = [];
                $n            = 0;
                foreach ($map['grays'] as $item) {
                    $model->grays[$n++] = null !== $item ? BaseConditionModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['order_num'])) {
            $model->orderNum = $map['order_num'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
