<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class AirDecisionFlows extends Model
{
    // 决策结果
    /**
     * @example review
     *
     * @var string
     */
    public $decision;

    // air引擎输出的infoCodes信息
    /**
     * @example info_codes
     *
     * @var AirInfoCodes[]
     */
    public $infoCodes;

    // 策略名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'decision'  => 'decision',
        'infoCodes' => 'info_codes',
        'name'      => 'name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }
        if (null !== $this->infoCodes) {
            $res['info_codes'] = [];
            if (null !== $this->infoCodes && \is_array($this->infoCodes)) {
                $n = 0;
                foreach ($this->infoCodes as $item) {
                    $res['info_codes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AirDecisionFlows
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }
        if (isset($map['info_codes'])) {
            if (!empty($map['info_codes'])) {
                $model->infoCodes = [];
                $n                = 0;
                foreach ($map['info_codes'] as $item) {
                    $model->infoCodes[$n++] = null !== $item ? AirInfoCodes::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
