<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class FinishClaimSettleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 报案单编号（蚂蚁内部）
    /**
     * @var string
     */
    public $claimNotificationFormNoInner;

    // 报案号（保司）
    /**
     * @var string
     */
    public $claimNotificationNo;

    // 赔付受理结果：01--受理、02--拒赔
    /**
     * @var string
     */
    public $acceptResult;

    // 受理结论
    /**
     * @var string
     */
    public $acceptNote;

    // 支付信息
    /**
     * @var string
     */
    public $tradeInfo;
    protected $_name = [
        'authToken'                    => 'auth_token',
        'claimNotificationFormNoInner' => 'claim_notification_form_no_inner',
        'claimNotificationNo'          => 'claim_notification_no',
        'acceptResult'                 => 'accept_result',
        'acceptNote'                   => 'accept_note',
        'tradeInfo'                    => 'trade_info',
    ];

    public function validate()
    {
        Model::validateRequired('claimNotificationFormNoInner', $this->claimNotificationFormNoInner, true);
        Model::validateRequired('acceptResult', $this->acceptResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->claimNotificationFormNoInner) {
            $res['claim_notification_form_no_inner'] = $this->claimNotificationFormNoInner;
        }
        if (null !== $this->claimNotificationNo) {
            $res['claim_notification_no'] = $this->claimNotificationNo;
        }
        if (null !== $this->acceptResult) {
            $res['accept_result'] = $this->acceptResult;
        }
        if (null !== $this->acceptNote) {
            $res['accept_note'] = $this->acceptNote;
        }
        if (null !== $this->tradeInfo) {
            $res['trade_info'] = $this->tradeInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishClaimSettleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['claim_notification_form_no_inner'])) {
            $model->claimNotificationFormNoInner = $map['claim_notification_form_no_inner'];
        }
        if (isset($map['claim_notification_no'])) {
            $model->claimNotificationNo = $map['claim_notification_no'];
        }
        if (isset($map['accept_result'])) {
            $model->acceptResult = $map['accept_result'];
        }
        if (isset($map['accept_note'])) {
            $model->acceptNote = $map['accept_note'];
        }
        if (isset($map['trade_info'])) {
            $model->tradeInfo = $map['trade_info'];
        }

        return $model;
    }
}
