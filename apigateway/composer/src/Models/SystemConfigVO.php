<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SystemConfigVO extends Model
{
    // config_key
    /**
     * @example config_key
     *
     * @var string
     */
    public $configKey;

    // config_value
    /**
     * @example config_value
     *
     * @var string
     */
    public $configValue;

    // 描述
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // gateway_list
    /**
     * @example
     *
     * @var GateWayConfigVO[]
     */
    public $gatewayList;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // 创建人
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // switch_list
    /**
     * @example
     *
     * @var SwitchVO[]
     */
    public $switchList;
    protected $_name = [
        'configKey'   => 'config_key',
        'configValue' => 'config_value',
        'description' => 'description',
        'gatewayList' => 'gateway_list',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'instanceId'  => 'instance_id',
        'operator'    => 'operator',
        'switchList'  => 'switch_list',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->configKey) {
            $res['config_key'] = $this->configKey;
        }
        if (null !== $this->configValue) {
            $res['config_value'] = $this->configValue;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->gatewayList) {
            $res['gateway_list'] = [];
            if (null !== $this->gatewayList && \is_array($this->gatewayList)) {
                $n = 0;
                foreach ($this->gatewayList as $item) {
                    $res['gateway_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->switchList) {
            $res['switch_list'] = [];
            if (null !== $this->switchList && \is_array($this->switchList)) {
                $n = 0;
                foreach ($this->switchList as $item) {
                    $res['switch_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SystemConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['config_key'])) {
            $model->configKey = $map['config_key'];
        }
        if (isset($map['config_value'])) {
            $model->configValue = $map['config_value'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['gateway_list'])) {
            if (!empty($map['gateway_list'])) {
                $model->gatewayList = [];
                $n                  = 0;
                foreach ($map['gateway_list'] as $item) {
                    $model->gatewayList[$n++] = null !== $item ? GateWayConfigVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['switch_list'])) {
            if (!empty($map['switch_list'])) {
                $model->switchList = [];
                $n                 = 0;
                foreach ($map['switch_list'] as $item) {
                    $model->switchList[$n++] = null !== $item ? SwitchVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
