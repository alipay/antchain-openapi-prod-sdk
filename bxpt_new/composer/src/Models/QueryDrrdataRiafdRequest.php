<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BXPT_NEW\Models;

use AlibabaCloud\Tea\Model;

class QueryDrrdataRiafdRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 业务流水号 需唯一， 格式：日期_客户标识_序列号
    /**
     * @var string
     */
    public $tradeNo;

    // 请求来源  国泰-GT
    /**
     * @var string
     */
    public $bizSource;

    // 逆向物流单号
    /**
     * @var string
     */
    public $reverseMailNo;

    // 逆向物流快递公司代码
    /**
     * @var string
     */
    public $reverseCpCode;

    // 逆向物流关联的电商平台
    /**
     * @var string
     */
    public $reverseRelatePlatform;

    // 逆向收件人电话后四位
    /**
     * @var string
     */
    public $reverseReceiverPhone;

    // 逆向寄件人电话后四位
    /**
     * @var string
     */
    public $reverseSenderPhone;

    // 申请退货时间 格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $applyReturnTime;

    // 申请理赔时间 格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $claimProcessingTime;

    // 正向物流单号
    /**
     * @var string
     */
    public $forwardMailNo;

    // 正向物流快递公司代码
    /**
     * @var string
     */
    public $forwardCpCode;

    // 正向物流关联的电商平台
    /**
     * @var string
     */
    public $forwardRelatePlatform;

    // 正向收件人电话后四位
    /**
     * @var string
     */
    public $forwardReceiverPhone;

    // 正向寄件人电话后四位
    /**
     * @var string
     */
    public $forwardSenderPhone;
    protected $_name = [
        'authToken'             => 'auth_token',
        'tradeNo'               => 'trade_no',
        'bizSource'             => 'biz_source',
        'reverseMailNo'         => 'reverse_mail_no',
        'reverseCpCode'         => 'reverse_cp_code',
        'reverseRelatePlatform' => 'reverse_relate_platform',
        'reverseReceiverPhone'  => 'reverse_receiver_phone',
        'reverseSenderPhone'    => 'reverse_sender_phone',
        'applyReturnTime'       => 'apply_return_time',
        'claimProcessingTime'   => 'claim_processing_time',
        'forwardMailNo'         => 'forward_mail_no',
        'forwardCpCode'         => 'forward_cp_code',
        'forwardRelatePlatform' => 'forward_relate_platform',
        'forwardReceiverPhone'  => 'forward_receiver_phone',
        'forwardSenderPhone'    => 'forward_sender_phone',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('bizSource', $this->bizSource, true);
        Model::validateRequired('reverseMailNo', $this->reverseMailNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->bizSource) {
            $res['biz_source'] = $this->bizSource;
        }
        if (null !== $this->reverseMailNo) {
            $res['reverse_mail_no'] = $this->reverseMailNo;
        }
        if (null !== $this->reverseCpCode) {
            $res['reverse_cp_code'] = $this->reverseCpCode;
        }
        if (null !== $this->reverseRelatePlatform) {
            $res['reverse_relate_platform'] = $this->reverseRelatePlatform;
        }
        if (null !== $this->reverseReceiverPhone) {
            $res['reverse_receiver_phone'] = $this->reverseReceiverPhone;
        }
        if (null !== $this->reverseSenderPhone) {
            $res['reverse_sender_phone'] = $this->reverseSenderPhone;
        }
        if (null !== $this->applyReturnTime) {
            $res['apply_return_time'] = $this->applyReturnTime;
        }
        if (null !== $this->claimProcessingTime) {
            $res['claim_processing_time'] = $this->claimProcessingTime;
        }
        if (null !== $this->forwardMailNo) {
            $res['forward_mail_no'] = $this->forwardMailNo;
        }
        if (null !== $this->forwardCpCode) {
            $res['forward_cp_code'] = $this->forwardCpCode;
        }
        if (null !== $this->forwardRelatePlatform) {
            $res['forward_relate_platform'] = $this->forwardRelatePlatform;
        }
        if (null !== $this->forwardReceiverPhone) {
            $res['forward_receiver_phone'] = $this->forwardReceiverPhone;
        }
        if (null !== $this->forwardSenderPhone) {
            $res['forward_sender_phone'] = $this->forwardSenderPhone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDrrdataRiafdRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['biz_source'])) {
            $model->bizSource = $map['biz_source'];
        }
        if (isset($map['reverse_mail_no'])) {
            $model->reverseMailNo = $map['reverse_mail_no'];
        }
        if (isset($map['reverse_cp_code'])) {
            $model->reverseCpCode = $map['reverse_cp_code'];
        }
        if (isset($map['reverse_relate_platform'])) {
            $model->reverseRelatePlatform = $map['reverse_relate_platform'];
        }
        if (isset($map['reverse_receiver_phone'])) {
            $model->reverseReceiverPhone = $map['reverse_receiver_phone'];
        }
        if (isset($map['reverse_sender_phone'])) {
            $model->reverseSenderPhone = $map['reverse_sender_phone'];
        }
        if (isset($map['apply_return_time'])) {
            $model->applyReturnTime = $map['apply_return_time'];
        }
        if (isset($map['claim_processing_time'])) {
            $model->claimProcessingTime = $map['claim_processing_time'];
        }
        if (isset($map['forward_mail_no'])) {
            $model->forwardMailNo = $map['forward_mail_no'];
        }
        if (isset($map['forward_cp_code'])) {
            $model->forwardCpCode = $map['forward_cp_code'];
        }
        if (isset($map['forward_relate_platform'])) {
            $model->forwardRelatePlatform = $map['forward_relate_platform'];
        }
        if (isset($map['forward_receiver_phone'])) {
            $model->forwardReceiverPhone = $map['forward_receiver_phone'];
        }
        if (isset($map['forward_sender_phone'])) {
            $model->forwardSenderPhone = $map['forward_sender_phone'];
        }

        return $model;
    }
}
