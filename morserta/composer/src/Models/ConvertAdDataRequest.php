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

    // ios/android
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

    // 转化时间
    /**
     * @var int
     */
    public $convTime;

    // 点击时间
    /**
     * @var int
     */
    public $clickTime;

    // 曝光时间
    /**
     * @var string
     */
    public $impressionTime;

    // 投放日期年月日时分秒（准确到秒），格式为 yyyyMMddhhmmss
    /**
     * @var string
     */
    public $dt;

    // 手机号MD5
    /**
     * @var string
     */
    public $mobileMd5;

    // 是否提单标签0,1
    /**
     * @var int
     */
    public $labelSubmit;

    // 是否支付标签0,1
    /**
     * @var int
     */
    public $labelPay;

    // 是否升级标签0,1
    /**
     * @var int
     */
    public $labelUp;

    // m2是否续期
    /**
     * @var int
     */
    public $labelM2Renewal;

    // 是否退保
    /**
     * @var int
     */
    public $labelSurrender;

    // 区分投放渠道来源weixin\youlianghui\chuanshanjia\douyin
    /**
     * @var int
     */
    public $platform;
    protected $_name = [
        'authToken'      => 'auth_token',
        'accountId'      => 'account_id',
        'deviceOsType'   => 'device_os_type',
        'muid'           => 'muid',
        'clickId'        => 'click_id',
        'convTime'       => 'conv_time',
        'clickTime'      => 'click_time',
        'impressionTime' => 'impression_time',
        'dt'             => 'dt',
        'mobileMd5'      => 'mobile_md5',
        'labelSubmit'    => 'label_submit',
        'labelPay'       => 'label_pay',
        'labelUp'        => 'label_up',
        'labelM2Renewal' => 'label_m2_renewal',
        'labelSurrender' => 'label_surrender',
        'platform'       => 'platform',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('deviceOsType', $this->deviceOsType, true);
        Model::validateRequired('muid', $this->muid, true);
        Model::validateRequired('clickId', $this->clickId, true);
        Model::validateRequired('convTime', $this->convTime, true);
        Model::validateRequired('clickTime', $this->clickTime, true);
        Model::validateRequired('impressionTime', $this->impressionTime, true);
        Model::validateRequired('dt', $this->dt, true);
        Model::validateRequired('mobileMd5', $this->mobileMd5, true);
        Model::validateRequired('labelSubmit', $this->labelSubmit, true);
        Model::validateRequired('labelPay', $this->labelPay, true);
        Model::validateRequired('labelM2Renewal', $this->labelM2Renewal, true);
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
        if (null !== $this->convTime) {
            $res['conv_time'] = $this->convTime;
        }
        if (null !== $this->clickTime) {
            $res['click_time'] = $this->clickTime;
        }
        if (null !== $this->impressionTime) {
            $res['impression_time'] = $this->impressionTime;
        }
        if (null !== $this->dt) {
            $res['dt'] = $this->dt;
        }
        if (null !== $this->mobileMd5) {
            $res['mobile_md5'] = $this->mobileMd5;
        }
        if (null !== $this->labelSubmit) {
            $res['label_submit'] = $this->labelSubmit;
        }
        if (null !== $this->labelPay) {
            $res['label_pay'] = $this->labelPay;
        }
        if (null !== $this->labelUp) {
            $res['label_up'] = $this->labelUp;
        }
        if (null !== $this->labelM2Renewal) {
            $res['label_m2_renewal'] = $this->labelM2Renewal;
        }
        if (null !== $this->labelSurrender) {
            $res['label_surrender'] = $this->labelSurrender;
        }
        if (null !== $this->platform) {
            $res['platform'] = $this->platform;
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
        if (isset($map['conv_time'])) {
            $model->convTime = $map['conv_time'];
        }
        if (isset($map['click_time'])) {
            $model->clickTime = $map['click_time'];
        }
        if (isset($map['impression_time'])) {
            $model->impressionTime = $map['impression_time'];
        }
        if (isset($map['dt'])) {
            $model->dt = $map['dt'];
        }
        if (isset($map['mobile_md5'])) {
            $model->mobileMd5 = $map['mobile_md5'];
        }
        if (isset($map['label_submit'])) {
            $model->labelSubmit = $map['label_submit'];
        }
        if (isset($map['label_pay'])) {
            $model->labelPay = $map['label_pay'];
        }
        if (isset($map['label_up'])) {
            $model->labelUp = $map['label_up'];
        }
        if (isset($map['label_m2_renewal'])) {
            $model->labelM2Renewal = $map['label_m2_renewal'];
        }
        if (isset($map['label_surrender'])) {
            $model->labelSurrender = $map['label_surrender'];
        }
        if (isset($map['platform'])) {
            $model->platform = $map['platform'];
        }

        return $model;
    }
}
