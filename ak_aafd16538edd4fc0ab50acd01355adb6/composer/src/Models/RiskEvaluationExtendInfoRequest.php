<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_aafd16538edd4fc0ab50acd01355adb6\Models;

use AlibabaCloud\Tea\Model;

class RiskEvaluationExtendInfoRequest extends Model
{
    // 协议集合
    /**
     * @example
     *
     * @var RiskEvaluationAgreementExtRequest[]
     */
    public $agreementList;

    // 地区请求
    /**
     * @example 地区请求
     *
     * @var RiskEvaluationDistrictExtRequest
     */
    public $districtExt;
    protected $_name = [
        'agreementList' => 'agreement_list',
        'districtExt'   => 'district_ext',
    ];

    public function validate()
    {
        Model::validateRequired('agreementList', $this->agreementList, true);
        Model::validateRequired('districtExt', $this->districtExt, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->agreementList) {
            $res['agreement_list'] = [];
            if (null !== $this->agreementList && \is_array($this->agreementList)) {
                $n = 0;
                foreach ($this->agreementList as $item) {
                    $res['agreement_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->districtExt) {
            $res['district_ext'] = null !== $this->districtExt ? $this->districtExt->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskEvaluationExtendInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['agreement_list'])) {
            if (!empty($map['agreement_list'])) {
                $model->agreementList = [];
                $n                    = 0;
                foreach ($map['agreement_list'] as $item) {
                    $model->agreementList[$n++] = null !== $item ? RiskEvaluationAgreementExtRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['district_ext'])) {
            $model->districtExt = RiskEvaluationDistrictExtRequest::fromMap($map['district_ext']);
        }

        return $model;
    }
}
