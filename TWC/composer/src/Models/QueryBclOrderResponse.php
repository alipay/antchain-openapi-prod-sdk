<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryBclOrderResponse extends Model
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

    // 订单信息
    /**
     * @var BclOrderInfo
     */
    public $orderInfo;

    // 实人信息
    /**
     * @var BclCertifyInfo
     */
    public $certifyInfo;

    // 风控分数
    // 分数0-100，小数2位，分数越高风险越大
    /**
     * @var string
     */
    public $riskScore;

    // 用户身份信息和支付宝ID的核验
    // 1.匹配，PASS
    // 2.不匹配，UN_PASS
    /**
     * @var string
     */
    public $identityVerification;

    // 合同信息
    /**
     * @var BclContractInfo
     */
    public $contractInfo;

    // 承诺信息
    /**
     * @var BclPromiseInfo
     */
    public $promiseInfo;

    // 履约详情
    /**
     * @var BclRentalInfo[]
     */
    public $rentalInfos;

    // 物流信息
    /**
     * @var BclLogisticsInfo[]
     */
    public $logisticsInfos;

    // 存证信息
    /**
     * @var BclNotaryInfo[]
     */
    public $notaryInfos;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'orderInfo'            => 'order_info',
        'certifyInfo'          => 'certify_info',
        'riskScore'            => 'risk_score',
        'identityVerification' => 'identity_verification',
        'contractInfo'         => 'contract_info',
        'promiseInfo'          => 'promise_info',
        'rentalInfos'          => 'rental_infos',
        'logisticsInfos'       => 'logistics_infos',
        'notaryInfos'          => 'notary_infos',
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
        if (null !== $this->orderInfo) {
            $res['order_info'] = null !== $this->orderInfo ? $this->orderInfo->toMap() : null;
        }
        if (null !== $this->certifyInfo) {
            $res['certify_info'] = null !== $this->certifyInfo ? $this->certifyInfo->toMap() : null;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->identityVerification) {
            $res['identity_verification'] = $this->identityVerification;
        }
        if (null !== $this->contractInfo) {
            $res['contract_info'] = null !== $this->contractInfo ? $this->contractInfo->toMap() : null;
        }
        if (null !== $this->promiseInfo) {
            $res['promise_info'] = null !== $this->promiseInfo ? $this->promiseInfo->toMap() : null;
        }
        if (null !== $this->rentalInfos) {
            $res['rental_infos'] = [];
            if (null !== $this->rentalInfos && \is_array($this->rentalInfos)) {
                $n = 0;
                foreach ($this->rentalInfos as $item) {
                    $res['rental_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->logisticsInfos) {
            $res['logistics_infos'] = [];
            if (null !== $this->logisticsInfos && \is_array($this->logisticsInfos)) {
                $n = 0;
                foreach ($this->logisticsInfos as $item) {
                    $res['logistics_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->notaryInfos) {
            $res['notary_infos'] = [];
            if (null !== $this->notaryInfos && \is_array($this->notaryInfos)) {
                $n = 0;
                foreach ($this->notaryInfos as $item) {
                    $res['notary_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBclOrderResponse
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
        if (isset($map['order_info'])) {
            $model->orderInfo = BclOrderInfo::fromMap($map['order_info']);
        }
        if (isset($map['certify_info'])) {
            $model->certifyInfo = BclCertifyInfo::fromMap($map['certify_info']);
        }
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }
        if (isset($map['identity_verification'])) {
            $model->identityVerification = $map['identity_verification'];
        }
        if (isset($map['contract_info'])) {
            $model->contractInfo = BclContractInfo::fromMap($map['contract_info']);
        }
        if (isset($map['promise_info'])) {
            $model->promiseInfo = BclPromiseInfo::fromMap($map['promise_info']);
        }
        if (isset($map['rental_infos'])) {
            if (!empty($map['rental_infos'])) {
                $model->rentalInfos = [];
                $n                  = 0;
                foreach ($map['rental_infos'] as $item) {
                    $model->rentalInfos[$n++] = null !== $item ? BclRentalInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['logistics_infos'])) {
            if (!empty($map['logistics_infos'])) {
                $model->logisticsInfos = [];
                $n                     = 0;
                foreach ($map['logistics_infos'] as $item) {
                    $model->logisticsInfos[$n++] = null !== $item ? BclLogisticsInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['notary_infos'])) {
            if (!empty($map['notary_infos'])) {
                $model->notaryInfos = [];
                $n                  = 0;
                foreach ($map['notary_infos'] as $item) {
                    $model->notaryInfos[$n++] = null !== $item ? BclNotaryInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
