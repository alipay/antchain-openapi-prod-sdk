<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MORSERTA\Models;

use AlibabaCloud\Tea\Model;

class ConvertAdDataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 广告主id
    /**
     * @var int
     */
    public $accountId;

    // ios/android/web
    /**
     * @var string
     */
    public $deviceOsType;

    // 设备ID（imei或idfa的加密值）
    /**
     * @var string
     */
    public $muid;

    // 点击ID
    /**
     * @var string
     */
    public $clickId;

    // 点击时间
    /**
     * @var int
     */
    public $clickTime;

    // 曝光时间
    /**
     * @var int
     */
    public $impressionTime;

    // 手机号MD5
    /**
     * @var string
     */
    public $mobileMd5;

    // 区分投放渠道来源guangdiantong/oceanengine
    /**
     * @var string
     */
    public $platform;

    // 事件类型，枚举值如下：
    // submit-提交表单
    // pay-付费
    // renewal-续费
    // m2_renewal-m2续期
    // surrender-退保
    /**
     * @var string
     */
    public $eventCode;

    // 转化事件时间
    /**
     * @var int
     */
    public $eventTime;

    // 设备oaid
    /**
     * @var string
     */
    public $oaid;

    // oaid_md5
    /**
     * @var string
     */
    public $oaidMd5;

    // caid
    /**
     * @var string
     */
    public $caid;

    // caid_md5
    /**
     * @var string
     */
    public $caidMd5;

    // android_id
    /**
     * @var string
     */
    public $androidId;

    // imei
    /**
     * @var string
     */
    public $imei;

    // imei_md5
    /**
     * @var string
     */
    public $imeiMd5;

    // idfa
    /**
     * @var string
     */
    public $idfa;

    // idfa_md5
    /**
     * @var string
     */
    public $idfaMd5;

    // 首次支付保费(蚂蚁数科定义)，用户首次支付保险的费用。单位元
    /**
     * @var string
     */
    public $firstPayAmount;

    // 升级支付保费(蚂蚁数科定义)，用户支付后进行保险升级的支付费用。单位元
    /**
     * @var string
     */
    public $upgradePayAmount;

    // 续费保费(蚂蚁数科定义)，用户M2进行保险续费的费用。
    /**
     * @var string
     */
    public $upgradeRenewvalAmount;

    // 行业
    /**
     * @var string
     */
    public $industry;

    // 用户的借款金额
    /**
     * @var string
     */
    public $loanAmount;

    // 扩展json
    /**
     * @var string
     */
    public $ext;

    // 手机号原值
    /**
     * @var string
     */
    public $mobile;

    // 业务事件id, 用于唯一标识当前事件，如下单事件的订单id等
    /**
     * @var string
     */
    public $outEventId;

    // android_id md5值
    /**
     * @var string
     */
    public $androidIdMd5;
    protected $_name = [
        'authToken'             => 'auth_token',
        'accountId'             => 'account_id',
        'deviceOsType'          => 'device_os_type',
        'muid'                  => 'muid',
        'clickId'               => 'click_id',
        'clickTime'             => 'click_time',
        'impressionTime'        => 'impression_time',
        'mobileMd5'             => 'mobile_md5',
        'platform'              => 'platform',
        'eventCode'             => 'event_code',
        'eventTime'             => 'event_time',
        'oaid'                  => 'oaid',
        'oaidMd5'               => 'oaid_md5',
        'caid'                  => 'caid',
        'caidMd5'               => 'caid_md5',
        'androidId'             => 'android_id',
        'imei'                  => 'imei',
        'imeiMd5'               => 'imei_md5',
        'idfa'                  => 'idfa',
        'idfaMd5'               => 'idfa_md5',
        'firstPayAmount'        => 'first_pay_amount',
        'upgradePayAmount'      => 'upgrade_pay_amount',
        'upgradeRenewvalAmount' => 'upgrade_renewval_amount',
        'industry'              => 'industry',
        'loanAmount'            => 'loan_amount',
        'ext'                   => 'ext',
        'mobile'                => 'mobile',
        'outEventId'            => 'out_event_id',
        'androidIdMd5'          => 'android_id_md5',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('deviceOsType', $this->deviceOsType, true);
        Model::validateRequired('clickId', $this->clickId, true);
        Model::validateRequired('platform', $this->platform, true);
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('industry', $this->industry, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->deviceOsType) {
            $res['device_os_type'] = $this->deviceOsType;
        }
        if (null !== $this->muid) {
            $res['muid'] = $this->muid;
        }
        if (null !== $this->clickId) {
            $res['click_id'] = $this->clickId;
        }
        if (null !== $this->clickTime) {
            $res['click_time'] = $this->clickTime;
        }
        if (null !== $this->impressionTime) {
            $res['impression_time'] = $this->impressionTime;
        }
        if (null !== $this->mobileMd5) {
            $res['mobile_md5'] = $this->mobileMd5;
        }
        if (null !== $this->platform) {
            $res['platform'] = $this->platform;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->oaid) {
            $res['oaid'] = $this->oaid;
        }
        if (null !== $this->oaidMd5) {
            $res['oaid_md5'] = $this->oaidMd5;
        }
        if (null !== $this->caid) {
            $res['caid'] = $this->caid;
        }
        if (null !== $this->caidMd5) {
            $res['caid_md5'] = $this->caidMd5;
        }
        if (null !== $this->androidId) {
            $res['android_id'] = $this->androidId;
        }
        if (null !== $this->imei) {
            $res['imei'] = $this->imei;
        }
        if (null !== $this->imeiMd5) {
            $res['imei_md5'] = $this->imeiMd5;
        }
        if (null !== $this->idfa) {
            $res['idfa'] = $this->idfa;
        }
        if (null !== $this->idfaMd5) {
            $res['idfa_md5'] = $this->idfaMd5;
        }
        if (null !== $this->firstPayAmount) {
            $res['first_pay_amount'] = $this->firstPayAmount;
        }
        if (null !== $this->upgradePayAmount) {
            $res['upgrade_pay_amount'] = $this->upgradePayAmount;
        }
        if (null !== $this->upgradeRenewvalAmount) {
            $res['upgrade_renewval_amount'] = $this->upgradeRenewvalAmount;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->loanAmount) {
            $res['loan_amount'] = $this->loanAmount;
        }
        if (null !== $this->ext) {
            $res['ext'] = $this->ext;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->outEventId) {
            $res['out_event_id'] = $this->outEventId;
        }
        if (null !== $this->androidIdMd5) {
            $res['android_id_md5'] = $this->androidIdMd5;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConvertAdDataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['device_os_type'])) {
            $model->deviceOsType = $map['device_os_type'];
        }
        if (isset($map['muid'])) {
            $model->muid = $map['muid'];
        }
        if (isset($map['click_id'])) {
            $model->clickId = $map['click_id'];
        }
        if (isset($map['click_time'])) {
            $model->clickTime = $map['click_time'];
        }
        if (isset($map['impression_time'])) {
            $model->impressionTime = $map['impression_time'];
        }
        if (isset($map['mobile_md5'])) {
            $model->mobileMd5 = $map['mobile_md5'];
        }
        if (isset($map['platform'])) {
            $model->platform = $map['platform'];
        }
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['oaid'])) {
            $model->oaid = $map['oaid'];
        }
        if (isset($map['oaid_md5'])) {
            $model->oaidMd5 = $map['oaid_md5'];
        }
        if (isset($map['caid'])) {
            $model->caid = $map['caid'];
        }
        if (isset($map['caid_md5'])) {
            $model->caidMd5 = $map['caid_md5'];
        }
        if (isset($map['android_id'])) {
            $model->androidId = $map['android_id'];
        }
        if (isset($map['imei'])) {
            $model->imei = $map['imei'];
        }
        if (isset($map['imei_md5'])) {
            $model->imeiMd5 = $map['imei_md5'];
        }
        if (isset($map['idfa'])) {
            $model->idfa = $map['idfa'];
        }
        if (isset($map['idfa_md5'])) {
            $model->idfaMd5 = $map['idfa_md5'];
        }
        if (isset($map['first_pay_amount'])) {
            $model->firstPayAmount = $map['first_pay_amount'];
        }
        if (isset($map['upgrade_pay_amount'])) {
            $model->upgradePayAmount = $map['upgrade_pay_amount'];
        }
        if (isset($map['upgrade_renewval_amount'])) {
            $model->upgradeRenewvalAmount = $map['upgrade_renewval_amount'];
        }
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['loan_amount'])) {
            $model->loanAmount = $map['loan_amount'];
        }
        if (isset($map['ext'])) {
            $model->ext = $map['ext'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['out_event_id'])) {
            $model->outEventId = $map['out_event_id'];
        }
        if (isset($map['android_id_md5'])) {
            $model->androidIdMd5 = $map['android_id_md5'];
        }

        return $model;
    }
}
