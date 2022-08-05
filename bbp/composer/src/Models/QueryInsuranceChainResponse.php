<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class QueryInsuranceChainResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 保司编码
    /**
     * @var string
     */
    public $merchanismCode;

    // 订单来源 TIANMAO
    /**
     * @var string
     */
    public $source;

    // 保险类型
    /**
     * @var string
     */
    public $insuraceType;

    // 保单加密信息（加密数据，由保司持有密钥）
    /**
     * @var string
     */
    public $insuranceContext;

    // 退保保单信息（加密数据，由保司持有密钥）
    /**
     * @var string
     */
    public $insuranceClaimContext;

    // 保单理赔信息（加密数据，由保司持有密钥）
    /**
     * @var string
     */
    public $insuranceSurrenderContext;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'merchanismCode'            => 'merchanism_code',
        'source'                    => 'source',
        'insuraceType'              => 'insurace_type',
        'insuranceContext'          => 'insurance_context',
        'insuranceClaimContext'     => 'insurance_claim_context',
        'insuranceSurrenderContext' => 'insurance_surrender_context',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->merchanismCode) {
            $res['merchanism_code'] = $this->merchanismCode;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->insuraceType) {
            $res['insurace_type'] = $this->insuraceType;
        }
        if (null !== $this->insuranceContext) {
            $res['insurance_context'] = $this->insuranceContext;
        }
        if (null !== $this->insuranceClaimContext) {
            $res['insurance_claim_context'] = $this->insuranceClaimContext;
        }
        if (null !== $this->insuranceSurrenderContext) {
            $res['insurance_surrender_context'] = $this->insuranceSurrenderContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsuranceChainResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['merchanism_code'])) {
            $model->merchanismCode = $map['merchanism_code'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['insurace_type'])) {
            $model->insuraceType = $map['insurace_type'];
        }
        if (isset($map['insurance_context'])) {
            $model->insuranceContext = $map['insurance_context'];
        }
        if (isset($map['insurance_claim_context'])) {
            $model->insuranceClaimContext = $map['insurance_claim_context'];
        }
        if (isset($map['insurance_surrender_context'])) {
            $model->insuranceSurrenderContext = $map['insurance_surrender_context'];
        }

        return $model;
    }
}
