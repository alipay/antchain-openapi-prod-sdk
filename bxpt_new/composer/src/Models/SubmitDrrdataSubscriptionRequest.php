<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BXPT_NEW\Models;

use AlibabaCloud\Tea\Model;

class SubmitDrrdataSubscriptionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 请求id
    /**
     * @var string
     */
    public $requestId;

    // 运单号
    /**
     * @var string
     */
    public $mailNo;

    // 快递公司编码
    /**
     * @var string
     */
    public $cpCode;

    // 自定义标签，可为备注
    /**
     * @var string
     */
    public $tag;

    // 收、寄件人电话号码
    /**
     * @var string
     */
    public $phone;

    // 出发地城市
    /**
     * @var string
     */
    public $fromCity;

    // 目的地城市
    /**
     * @var string
     */
    public $toCity;

    // {}
    /**
     * @var string
     */
    public $bizContent;
    protected $_name = [
        'authToken'  => 'auth_token',
        'bizType'    => 'biz_type',
        'requestId'  => 'request_id',
        'mailNo'     => 'mail_no',
        'cpCode'     => 'cp_code',
        'tag'        => 'tag',
        'phone'      => 'phone',
        'fromCity'   => 'from_city',
        'toCity'     => 'to_city',
        'bizContent' => 'biz_content',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('mailNo', $this->mailNo, true);
        Model::validateMaxLength('bizType', $this->bizType, 32);
        Model::validateMaxLength('requestId', $this->requestId, 64);
        Model::validateMaxLength('mailNo', $this->mailNo, 64);
        Model::validateMaxLength('cpCode', $this->cpCode, 64);
        Model::validateMaxLength('tag', $this->tag, 128);
        Model::validateMaxLength('phone', $this->phone, 32);
        Model::validateMaxLength('fromCity', $this->fromCity, 128);
        Model::validateMaxLength('toCity', $this->toCity, 128);
        Model::validateMaxLength('bizContent', $this->bizContent, 1000);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->mailNo) {
            $res['mail_no'] = $this->mailNo;
        }
        if (null !== $this->cpCode) {
            $res['cp_code'] = $this->cpCode;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->fromCity) {
            $res['from_city'] = $this->fromCity;
        }
        if (null !== $this->toCity) {
            $res['to_city'] = $this->toCity;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitDrrdataSubscriptionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['mail_no'])) {
            $model->mailNo = $map['mail_no'];
        }
        if (isset($map['cp_code'])) {
            $model->cpCode = $map['cp_code'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['from_city'])) {
            $model->fromCity = $map['from_city'];
        }
        if (isset($map['to_city'])) {
            $model->toCity = $map['to_city'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }

        return $model;
    }
}
