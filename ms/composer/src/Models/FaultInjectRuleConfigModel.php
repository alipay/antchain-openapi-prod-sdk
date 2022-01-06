<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class FaultInjectRuleConfigModel extends Model
{
    // 方法名
    /**
     * @example save
     *
     * @var string
     */
    public $methodName;

    // 请求类型
    /**
     * @example GET
     *
     * @var string
     */
    public $httpMethod;

    // 请求路径
    /**
     * @example /hello
     *
     * @var string
     */
    public $httpPath;

    // 故障注入生效端（o:客户端生效/ i:服务端生效）
    /**
     * @example o
     *
     * @var string
     */
    public $trafficType;

    // 资源标识
    /**
     * @example com.alipay.test.TestFacade:1.0@DEFAULT:o:r
     *
     * @var string
     */
    public $resource;

    // 配置项
    /**
     * @example [{"ruleType": "ABORT"}]
     *
     * @var FaultInjectRuleItemModel[]
     */
    public $faultInjectRuleItems;
    protected $_name = [
        'methodName'           => 'method_name',
        'httpMethod'           => 'http_method',
        'httpPath'             => 'http_path',
        'trafficType'          => 'traffic_type',
        'resource'             => 'resource',
        'faultInjectRuleItems' => 'fault_inject_rule_items',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->methodName) {
            $res['method_name'] = $this->methodName;
        }
        if (null !== $this->httpMethod) {
            $res['http_method'] = $this->httpMethod;
        }
        if (null !== $this->httpPath) {
            $res['http_path'] = $this->httpPath;
        }
        if (null !== $this->trafficType) {
            $res['traffic_type'] = $this->trafficType;
        }
        if (null !== $this->resource) {
            $res['resource'] = $this->resource;
        }
        if (null !== $this->faultInjectRuleItems) {
            $res['fault_inject_rule_items'] = [];
            if (null !== $this->faultInjectRuleItems && \is_array($this->faultInjectRuleItems)) {
                $n = 0;
                foreach ($this->faultInjectRuleItems as $item) {
                    $res['fault_inject_rule_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaultInjectRuleConfigModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['method_name'])) {
            $model->methodName = $map['method_name'];
        }
        if (isset($map['http_method'])) {
            $model->httpMethod = $map['http_method'];
        }
        if (isset($map['http_path'])) {
            $model->httpPath = $map['http_path'];
        }
        if (isset($map['traffic_type'])) {
            $model->trafficType = $map['traffic_type'];
        }
        if (isset($map['resource'])) {
            $model->resource = $map['resource'];
        }
        if (isset($map['fault_inject_rule_items'])) {
            if (!empty($map['fault_inject_rule_items'])) {
                $model->faultInjectRuleItems = [];
                $n                           = 0;
                foreach ($map['fault_inject_rule_items'] as $item) {
                    $model->faultInjectRuleItems[$n++] = null !== $item ? FaultInjectRuleItemModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
