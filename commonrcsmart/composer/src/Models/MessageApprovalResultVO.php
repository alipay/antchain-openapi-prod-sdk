<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMONRCSMART\Models;

use AlibabaCloud\Tea\Model;

class MessageApprovalResultVO extends Model
{
    // 机审结果
    /**
     * @example FAIL
     *
     * @var string
     */
    public $result;

    // 审核结果详情
    /**
     * @example
     *
     * @var ContentRiskDetailVO[]
     */
    public $riskDetailVoList;
    protected $_name = [
        'result'           => 'result',
        'riskDetailVoList' => 'risk_detail_vo_list',
    ];

    public function validate()
    {
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('riskDetailVoList', $this->riskDetailVoList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->riskDetailVoList) {
            $res['risk_detail_vo_list'] = [];
            if (null !== $this->riskDetailVoList && \is_array($this->riskDetailVoList)) {
                $n = 0;
                foreach ($this->riskDetailVoList as $item) {
                    $res['risk_detail_vo_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MessageApprovalResultVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['risk_detail_vo_list'])) {
            if (!empty($map['risk_detail_vo_list'])) {
                $model->riskDetailVoList = [];
                $n                       = 0;
                foreach ($map['risk_detail_vo_list'] as $item) {
                    $model->riskDetailVoList[$n++] = null !== $item ? ContentRiskDetailVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
