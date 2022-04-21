<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class StandardAuthExtendInfoRequest extends Model
{
    // 协议列表
    /**
     * @example 协议列表
     *
     * @var AgreementExtRequest[]
     */
    public $agreementList;

    // 地区请求
    /**
     * @example 地区请求
     *
     * @var DistrictExtRequest
     */
    public $districtextRequest;
    protected $_name = [
        'agreementList'      => 'agreement_list',
        'districtextRequest' => 'districtext_request',
    ];

    public function validate()
    {
        Model::validateRequired('agreementList', $this->agreementList, true);
        Model::validateRequired('districtextRequest', $this->districtextRequest, true);
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
        if (null !== $this->districtextRequest) {
            $res['districtext_request'] = null !== $this->districtextRequest ? $this->districtextRequest->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StandardAuthExtendInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['agreement_list'])) {
            if (!empty($map['agreement_list'])) {
                $model->agreementList = [];
                $n                    = 0;
                foreach ($map['agreement_list'] as $item) {
                    $model->agreementList[$n++] = null !== $item ? AgreementExtRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['districtext_request'])) {
            $model->districtextRequest = DistrictExtRequest::fromMap($map['districtext_request']);
        }

        return $model;
    }
}
