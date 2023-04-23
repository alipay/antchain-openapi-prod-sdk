<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class ApplyPartnerSettleinRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户来源-用于租户隔离
    /**
     * @var string
     */
    public $source;

    // 入驻的一级伙伴类型
    /**
     * @var string
     */
    public $l1PartnerType;

    // 入驻的二级合作类型
    /**
     * @var string
     */
    public $l2PartnerType;

    // 入驻申请业务单据号-幂等使用
    /**
     * @var string
     */
    public $businessNo;

    // 合作方信息
    /**
     * @var PartnerInformation
     */
    public $partnerInformation;

    // 参与人列表
    /**
     * @var Participant[]
     */
    public $participants;

    // 签约请求
    /**
     * @var SignRequest
     */
    public $signRequest;

    // 入驻申请扩展信息
    /**
     * @var string
     */
    public $extendInfo;

    // 入驻申请时间
    /**
     * @var string
     */
    public $applyTime;

    // 入驻申请类型：新签、改签、续签
    /**
     * @var string
     */
    public $applyOperateType;
    protected $_name = [
        'authToken'          => 'auth_token',
        'source'             => 'source',
        'l1PartnerType'      => 'l1_partner_type',
        'l2PartnerType'      => 'l2_partner_type',
        'businessNo'         => 'business_no',
        'partnerInformation' => 'partner_information',
        'participants'       => 'participants',
        'signRequest'        => 'sign_request',
        'extendInfo'         => 'extend_info',
        'applyTime'          => 'apply_time',
        'applyOperateType'   => 'apply_operate_type',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('l1PartnerType', $this->l1PartnerType, true);
        Model::validateRequired('l2PartnerType', $this->l2PartnerType, true);
        Model::validateRequired('businessNo', $this->businessNo, true);
        Model::validateRequired('partnerInformation', $this->partnerInformation, true);
        Model::validateRequired('participants', $this->participants, true);
        Model::validateRequired('signRequest', $this->signRequest, true);
        Model::validateRequired('applyTime', $this->applyTime, true);
        Model::validateRequired('applyOperateType', $this->applyOperateType, true);
        Model::validatePattern('applyTime', $this->applyTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->l1PartnerType) {
            $res['l1_partner_type'] = $this->l1PartnerType;
        }
        if (null !== $this->l2PartnerType) {
            $res['l2_partner_type'] = $this->l2PartnerType;
        }
        if (null !== $this->businessNo) {
            $res['business_no'] = $this->businessNo;
        }
        if (null !== $this->partnerInformation) {
            $res['partner_information'] = null !== $this->partnerInformation ? $this->partnerInformation->toMap() : null;
        }
        if (null !== $this->participants) {
            $res['participants'] = [];
            if (null !== $this->participants && \is_array($this->participants)) {
                $n = 0;
                foreach ($this->participants as $item) {
                    $res['participants'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signRequest) {
            $res['sign_request'] = null !== $this->signRequest ? $this->signRequest->toMap() : null;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }
        if (null !== $this->applyTime) {
            $res['apply_time'] = $this->applyTime;
        }
        if (null !== $this->applyOperateType) {
            $res['apply_operate_type'] = $this->applyOperateType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyPartnerSettleinRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['l1_partner_type'])) {
            $model->l1PartnerType = $map['l1_partner_type'];
        }
        if (isset($map['l2_partner_type'])) {
            $model->l2PartnerType = $map['l2_partner_type'];
        }
        if (isset($map['business_no'])) {
            $model->businessNo = $map['business_no'];
        }
        if (isset($map['partner_information'])) {
            $model->partnerInformation = PartnerInformation::fromMap($map['partner_information']);
        }
        if (isset($map['participants'])) {
            if (!empty($map['participants'])) {
                $model->participants = [];
                $n                   = 0;
                foreach ($map['participants'] as $item) {
                    $model->participants[$n++] = null !== $item ? Participant::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_request'])) {
            $model->signRequest = SignRequest::fromMap($map['sign_request']);
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = $map['extend_info'];
        }
        if (isset($map['apply_time'])) {
            $model->applyTime = $map['apply_time'];
        }
        if (isset($map['apply_operate_type'])) {
            $model->applyOperateType = $map['apply_operate_type'];
        }

        return $model;
    }
}
