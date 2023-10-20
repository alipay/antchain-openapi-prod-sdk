<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ResultList extends Model
{
    // 结果列表
    /**
     * @example
     *
     * @var RiskResult[]
     */
    public $riskResults;

    // 入参列表，数组
    /**
     * @example
     *
     * @var BizParam[]
     */
    public $bizParams;
    protected $_name = [
        'riskResults' => 'risk_results',
        'bizParams'   => 'biz_params',
    ];

    public function validate()
    {
        Model::validateRequired('riskResults', $this->riskResults, true);
        Model::validateRequired('bizParams', $this->bizParams, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskResults) {
            $res['risk_results'] = [];
            if (null !== $this->riskResults && \is_array($this->riskResults)) {
                $n = 0;
                foreach ($this->riskResults as $item) {
                    $res['risk_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bizParams) {
            $res['biz_params'] = [];
            if (null !== $this->bizParams && \is_array($this->bizParams)) {
                $n = 0;
                foreach ($this->bizParams as $item) {
                    $res['biz_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_results'])) {
            if (!empty($map['risk_results'])) {
                $model->riskResults = [];
                $n                  = 0;
                foreach ($map['risk_results'] as $item) {
                    $model->riskResults[$n++] = null !== $item ? RiskResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['biz_params'])) {
            if (!empty($map['biz_params'])) {
                $model->bizParams = [];
                $n                = 0;
                foreach ($map['biz_params'] as $item) {
                    $model->bizParams[$n++] = null !== $item ? BizParam::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
