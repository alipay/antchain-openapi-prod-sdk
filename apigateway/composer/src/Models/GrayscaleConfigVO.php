<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class GrayscaleConfigVO extends Model
{
    // gmt_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // router_type
    /**
     * @example WEIGHT|HEADER
     *
     * @var string
     */
    public $routerType;

    // service
    /**
     * @example service
     *
     * @var string
     */
    public $service;

    // matchable_service
    /**
     * @example matchable_service
     *
     * @var string
     */
    public $matchableService;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // router_id
    /**
     * @example router_id
     *
     * @var string
     */
    public $routerId;

    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // valid
    /**
     * @example valid
     *
     * @var string
     */
    public $valid;

    // gray_rule_config_list
    /**
     * @example
     *
     * @var GrayRuleConfigVO[]
     */
    public $grayRuleConfigList;
    protected $_name = [
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'routerType'         => 'router_type',
        'service'            => 'service',
        'matchableService'   => 'matchable_service',
        'instanceId'         => 'instance_id',
        'routerId'           => 'router_id',
        'appName'            => 'app_name',
        'valid'              => 'valid',
        'grayRuleConfigList' => 'gray_rule_config_list',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->routerType) {
            $res['router_type'] = $this->routerType;
        }
        if (null !== $this->service) {
            $res['service'] = $this->service;
        }
        if (null !== $this->matchableService) {
            $res['matchable_service'] = $this->matchableService;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->routerId) {
            $res['router_id'] = $this->routerId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->valid) {
            $res['valid'] = $this->valid;
        }
        if (null !== $this->grayRuleConfigList) {
            $res['gray_rule_config_list'] = [];
            if (null !== $this->grayRuleConfigList && \is_array($this->grayRuleConfigList)) {
                $n = 0;
                foreach ($this->grayRuleConfigList as $item) {
                    $res['gray_rule_config_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrayscaleConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['router_type'])) {
            $model->routerType = $map['router_type'];
        }
        if (isset($map['service'])) {
            $model->service = $map['service'];
        }
        if (isset($map['matchable_service'])) {
            $model->matchableService = $map['matchable_service'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['router_id'])) {
            $model->routerId = $map['router_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['valid'])) {
            $model->valid = $map['valid'];
        }
        if (isset($map['gray_rule_config_list'])) {
            if (!empty($map['gray_rule_config_list'])) {
                $model->grayRuleConfigList = [];
                $n                         = 0;
                foreach ($map['gray_rule_config_list'] as $item) {
                    $model->grayRuleConfigList[$n++] = null !== $item ? GrayRuleConfigVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
