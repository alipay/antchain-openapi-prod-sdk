<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UpdateInsuranceOlpRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 被保人证件号
    /**
     * @var string
     */
    public $bbrIdNo;

    // 被保人名称
    /**
     * @var string
     */
    public $bbrName;

    // 被保人类型, 1-个人 2-企业
    /**
     * @var string
     */
    public $bbrType;

    // 保险公司编码
    /**
     * @var string
     */
    public $channelCode;

    // 保险公司名称
    /**
     * @var string
     */
    public $channelName;

    // 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，CLAIMED: 已理赔
    /**
     * @var string
     */
    public $claimStatus;

    // 投保时间
    /**
     * @var string
     */
    public $insureDate;

    // 保险止期
    /**
     * @var string
     */
    public $insureEnd;

    // 保险起期
    /**
     * @var string
     */
    public $insureStart;

    // 存证平台编码
    /**
     * @var string
     */
    public $platformConsumerCode;

    // 存证平台名称
    /**
     * @var string
     */
    public $platformConsumerName;

    // 保单文件id，可支持多个，逗号隔开
    /**
     * @var string
     */
    public $polFileIds;

    // 保单号
    /**
     * @var string
     */
    public $polNo;

    // 保单状态，INSURED: 已投保，SURRENDERED: 已退保,
    /**
     * @var string
     */
    public $polStatus;

    // 电子保单url地址
    /**
     * @var string
     */
    public $polUrl;

    // 保费
    //
    /**
     * @var string
     */
    public $premium;

    // 险种代码
    //
    /**
     * @var string
     */
    public $productCode;

    // 险种名称
    //
    /**
     * @var string
     */
    public $productName;

    // 退保时间
    /**
     * @var string
     */
    public $surrenderTime;

    // 投保人证件号
    /**
     * @var string
     */
    public $tbrIdNo;

    // 投保人名称
    /**
     * @var string
     */
    public $tbrName;

    // 投保人类型, 1-个人 2-企业
    /**
     * @var string
     */
    public $tbrType;

    // 交易流水号
    /**
     * @var string
     */
    public $tradeNo;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'bbrIdNo'              => 'bbr_id_no',
        'bbrName'              => 'bbr_name',
        'bbrType'              => 'bbr_type',
        'channelCode'          => 'channel_code',
        'channelName'          => 'channel_name',
        'claimStatus'          => 'claim_status',
        'insureDate'           => 'insure_date',
        'insureEnd'            => 'insure_end',
        'insureStart'          => 'insure_start',
        'platformConsumerCode' => 'platform_consumer_code',
        'platformConsumerName' => 'platform_consumer_name',
        'polFileIds'           => 'pol_file_ids',
        'polNo'                => 'pol_no',
        'polStatus'            => 'pol_status',
        'polUrl'               => 'pol_url',
        'premium'              => 'premium',
        'productCode'          => 'product_code',
        'productName'          => 'product_name',
        'surrenderTime'        => 'surrender_time',
        'tbrIdNo'              => 'tbr_id_no',
        'tbrName'              => 'tbr_name',
        'tbrType'              => 'tbr_type',
        'tradeNo'              => 'trade_no',
    ];

    public function validate()
    {
        Model::validateMaxLength('bbrIdNo', $this->bbrIdNo, 50);
        Model::validateMaxLength('bbrName', $this->bbrName, 100);
        Model::validateMaxLength('bbrType', $this->bbrType, 10);
        Model::validateMaxLength('channelCode', $this->channelCode, 50);
        Model::validateMaxLength('channelName', $this->channelName, 100);
        Model::validateMaxLength('claimStatus', $this->claimStatus, 12);
        Model::validateMaxLength('platformConsumerCode', $this->platformConsumerCode, 50);
        Model::validateMaxLength('platformConsumerName', $this->platformConsumerName, 100);
        Model::validateMaxLength('polFileIds', $this->polFileIds, 3200);
        Model::validateMaxLength('polNo', $this->polNo, 100);
        Model::validateMaxLength('polStatus', $this->polStatus, 12);
        Model::validateMaxLength('polUrl', $this->polUrl, 500);
        Model::validateMaxLength('premium', $this->premium, 20);
        Model::validateMaxLength('productCode', $this->productCode, 50);
        Model::validateMaxLength('productName', $this->productName, 100);
        Model::validateMaxLength('tbrIdNo', $this->tbrIdNo, 50);
        Model::validateMaxLength('tbrName', $this->tbrName, 100);
        Model::validateMaxLength('tbrType', $this->tbrType, 10);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 200);
        Model::validatePattern('insureDate', $this->insureDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('insureEnd', $this->insureEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('insureStart', $this->insureStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('surrenderTime', $this->surrenderTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('platformConsumerCode', $this->platformConsumerCode, true);
        Model::validateRequired('polNo', $this->polNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bbrIdNo) {
            $res['bbr_id_no'] = $this->bbrIdNo;
        }
        if (null !== $this->bbrName) {
            $res['bbr_name'] = $this->bbrName;
        }
        if (null !== $this->bbrType) {
            $res['bbr_type'] = $this->bbrType;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->claimStatus) {
            $res['claim_status'] = $this->claimStatus;
        }
        if (null !== $this->insureDate) {
            $res['insure_date'] = $this->insureDate;
        }
        if (null !== $this->insureEnd) {
            $res['insure_end'] = $this->insureEnd;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->platformConsumerCode) {
            $res['platform_consumer_code'] = $this->platformConsumerCode;
        }
        if (null !== $this->platformConsumerName) {
            $res['platform_consumer_name'] = $this->platformConsumerName;
        }
        if (null !== $this->polFileIds) {
            $res['pol_file_ids'] = $this->polFileIds;
        }
        if (null !== $this->polNo) {
            $res['pol_no'] = $this->polNo;
        }
        if (null !== $this->polStatus) {
            $res['pol_status'] = $this->polStatus;
        }
        if (null !== $this->polUrl) {
            $res['pol_url'] = $this->polUrl;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->surrenderTime) {
            $res['surrender_time'] = $this->surrenderTime;
        }
        if (null !== $this->tbrIdNo) {
            $res['tbr_id_no'] = $this->tbrIdNo;
        }
        if (null !== $this->tbrName) {
            $res['tbr_name'] = $this->tbrName;
        }
        if (null !== $this->tbrType) {
            $res['tbr_type'] = $this->tbrType;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateInsuranceOlpRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['bbr_id_no'])) {
            $model->bbrIdNo = $map['bbr_id_no'];
        }
        if (isset($map['bbr_name'])) {
            $model->bbrName = $map['bbr_name'];
        }
        if (isset($map['bbr_type'])) {
            $model->bbrType = $map['bbr_type'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['claim_status'])) {
            $model->claimStatus = $map['claim_status'];
        }
        if (isset($map['insure_date'])) {
            $model->insureDate = $map['insure_date'];
        }
        if (isset($map['insure_end'])) {
            $model->insureEnd = $map['insure_end'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['platform_consumer_code'])) {
            $model->platformConsumerCode = $map['platform_consumer_code'];
        }
        if (isset($map['platform_consumer_name'])) {
            $model->platformConsumerName = $map['platform_consumer_name'];
        }
        if (isset($map['pol_file_ids'])) {
            $model->polFileIds = $map['pol_file_ids'];
        }
        if (isset($map['pol_no'])) {
            $model->polNo = $map['pol_no'];
        }
        if (isset($map['pol_status'])) {
            $model->polStatus = $map['pol_status'];
        }
        if (isset($map['pol_url'])) {
            $model->polUrl = $map['pol_url'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['surrender_time'])) {
            $model->surrenderTime = $map['surrender_time'];
        }
        if (isset($map['tbr_id_no'])) {
            $model->tbrIdNo = $map['tbr_id_no'];
        }
        if (isset($map['tbr_name'])) {
            $model->tbrName = $map['tbr_name'];
        }
        if (isset($map['tbr_type'])) {
            $model->tbrType = $map['tbr_type'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }

        return $model;
    }
}
