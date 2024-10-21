<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class ProjectPerformance extends Model
{
    // 项目ID
    /**
     * @example 7757b03c0ed947409bdf142e572df93f
     *
     * @var string
     */
    public $projectId;

    // 项目净值
    /**
     * @example 3.14
     *
     * @var string
     */
    public $netValue;

    // 币种(目前支持USD、HKD)
    /**
     * @example HKD
     *
     * @var string
     */
    public $currency;

    // 净值更新时间戳
    /**
     * @example 1726024364000
     *
     * @var int
     */
    public $updateTime;
    protected $_name = [
        'projectId'  => 'project_id',
        'netValue'   => 'net_value',
        'currency'   => 'currency',
        'updateTime' => 'update_time',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('netValue', $this->netValue, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->netValue) {
            $res['net_value'] = $this->netValue;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProjectPerformance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['net_value'])) {
            $model->netValue = $map['net_value'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
