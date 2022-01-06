<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class CircuitBreakerRuleResult extends Model
{
    // 多个应用名
    /**
     * @example bbbb,aaaa
     *
     * @var string
     */
    public $appNames;

    // 服务id
    /**
     * @example com.alipay.antcloud.service
     *
     * @var string
     */
    public $dataId;

    // 规则总数
    /**
     * @example 2
     *
     * @var int
     */
    public $rulesNum;

    // 服务类型
    /**
     * @example sofa
     *
     * @var string
     */
    public $serviceType;
    protected $_name = [
        'appNames'    => 'app_names',
        'dataId'      => 'data_id',
        'rulesNum'    => 'rules_num',
        'serviceType' => 'service_type',
    ];

    public function validate()
    {
        Model::validateRequired('appNames', $this->appNames, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('rulesNum', $this->rulesNum, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appNames) {
            $res['app_names'] = $this->appNames;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->rulesNum) {
            $res['rules_num'] = $this->rulesNum;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CircuitBreakerRuleResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_names'])) {
            $model->appNames = $map['app_names'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['rules_num'])) {
            $model->rulesNum = $map['rules_num'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }

        return $model;
    }
}
