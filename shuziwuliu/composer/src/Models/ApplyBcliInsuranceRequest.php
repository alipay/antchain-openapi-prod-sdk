<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyBcliInsuranceRequest extends Model
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

    // 投保流水号，格式：日期_身份标识_全局唯一序号
    /**
     * @var string
     */
    public $tradeNo;

    // 保司编码,CPIC_SHENZHEN-太保深分
    /**
     * @var string
     */
    public $externalChannelCode;

    // 保险产品编码,Pbins-动力电池延保保险产品编码
    /**
     * @var string
     */
    public $externalProductCode;

    // 投保人名称
    /**
     * @var string
     */
    public $tbrName;

    // 投保人证件类型，01-居民身份证、03-营业执照
    /**
     * @var string
     */
    public $tbrIdType;

    // 投保人证件号码
    /**
     * @var string
     */
    public $tbrIdNo;

    // 投保人联系地址
    /**
     * @var string
     */
    public $tbrAddr;

    // 被保人名称
    /**
     * @var string
     */
    public $bbrName;

    // 01-居民身份证、03-营业执照
    /**
     * @var string
     */
    public $bbrIdType;

    // 被保人证件号码
    /**
     * @var string
     */
    public $bbrIdNo;

    // 被保人联系地址
    /**
     * @var string
     */
    public $bbrAddr;

    // 投保方案ID，battery202501
    /**
     * @var string
     */
    public $schemeName;

    // 保额，金额人民币元，整数
    /**
     * @var string
     */
    public $insuredAmount;

    // 客户所期待的保险起期，实际保司出单以保司出具的信息为准，格式：YYYY-MM-DD HH:MM:SS
    /**
     * @var string
     */
    public $insureStart;

    // 客户所期待的保险止期，实际保司出单以保司出具的信息为准,格式：YYYY-MM-DD HH:MM:SS
    /**
     * @var string
     */
    public $insureEnd;

    // 邮箱地址，用于保司回传科技公司电子保单
    /**
     * @var string
     */
    public $email;

    // 保险期限内电池容量允许衰减程度
    /**
     * @var string
     */
    public $bcdaPt;

    // 车牌号码
    /**
     * @var string
     */
    public $vehiclePlate;

    // 车架号
    /**
     * @var string
     */
    public $vin;

    // 车辆初登日期  格式：YYYY-MM-DD
    /**
     * @var string
     */
    public $vehicleRegistDate;

    // 行驶证发证日期,格式：YYYY-MM-DD
    /**
     * @var string
     */
    public $licenseDate;

    // 车辆使用性质,01-企业非营业用车、02出租车、03租赁车、04家庭自用车、05党政机关用车、06事业团体用车、07城市公交、08公路客运、09营运货车、10营业特种车
    /**
     * @var string
     */
    public $vehicleUsage;

    // 投保车辆实际价值（元）,金额人民币元，精确到小数点后2位
    /**
     * @var string
     */
    public $vehiclePrice;

    // 投保车龄（月）
    /**
     * @var string
     */
    public $vehicleAge;

    // 行驶证图片信息url
    /**
     * @var string
     */
    public $licensePicture;

    // 动力电池编码（ID),动力电池包的唯一标识
    /**
     * @var string
     */
    public $batteryCode;

    // 动力电池铭牌照片url
    /**
     * @var string
     */
    public $batteryNameplatePicture;

    // 动力电池包外观照片地址
    /**
     * @var string
     */
    public $batteryPackPhotoFile;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'tradeNo'                 => 'trade_no',
        'externalChannelCode'     => 'external_channel_code',
        'externalProductCode'     => 'external_product_code',
        'tbrName'                 => 'tbr_name',
        'tbrIdType'               => 'tbr_id_type',
        'tbrIdNo'                 => 'tbr_id_no',
        'tbrAddr'                 => 'tbr_addr',
        'bbrName'                 => 'bbr_name',
        'bbrIdType'               => 'bbr_id_type',
        'bbrIdNo'                 => 'bbr_id_no',
        'bbrAddr'                 => 'bbr_addr',
        'schemeName'              => 'scheme_name',
        'insuredAmount'           => 'insured_amount',
        'insureStart'             => 'insure_start',
        'insureEnd'               => 'insure_end',
        'email'                   => 'email',
        'bcdaPt'                  => 'bcda_pt',
        'vehiclePlate'            => 'vehicle_plate',
        'vin'                     => 'vin',
        'vehicleRegistDate'       => 'vehicle_regist_date',
        'licenseDate'             => 'license_date',
        'vehicleUsage'            => 'vehicle_usage',
        'vehiclePrice'            => 'vehicle_price',
        'vehicleAge'              => 'vehicle_age',
        'licensePicture'          => 'license_picture',
        'batteryCode'             => 'battery_code',
        'batteryNameplatePicture' => 'battery_nameplate_picture',
        'batteryPackPhotoFile'    => 'battery_pack_photo_file',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('tbrName', $this->tbrName, true);
        Model::validateRequired('tbrIdType', $this->tbrIdType, true);
        Model::validateRequired('tbrIdNo', $this->tbrIdNo, true);
        Model::validateRequired('tbrAddr', $this->tbrAddr, true);
        Model::validateRequired('bbrName', $this->bbrName, true);
        Model::validateRequired('bbrIdType', $this->bbrIdType, true);
        Model::validateRequired('bbrIdNo', $this->bbrIdNo, true);
        Model::validateRequired('bbrAddr', $this->bbrAddr, true);
        Model::validateRequired('schemeName', $this->schemeName, true);
        Model::validateRequired('insuredAmount', $this->insuredAmount, true);
        Model::validateRequired('bcdaPt', $this->bcdaPt, true);
        Model::validateRequired('vehiclePlate', $this->vehiclePlate, true);
        Model::validateRequired('vin', $this->vin, true);
        Model::validateRequired('vehicleRegistDate', $this->vehicleRegistDate, true);
        Model::validateRequired('licenseDate', $this->licenseDate, true);
        Model::validateRequired('vehicleUsage', $this->vehicleUsage, true);
        Model::validateRequired('vehiclePrice', $this->vehiclePrice, true);
        Model::validateRequired('vehicleAge', $this->vehicleAge, true);
        Model::validateRequired('licensePicture', $this->licensePicture, true);
        Model::validateRequired('batteryCode', $this->batteryCode, true);
        Model::validateRequired('batteryNameplatePicture', $this->batteryNameplatePicture, true);
        Model::validateRequired('batteryPackPhotoFile', $this->batteryPackPhotoFile, true);
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->externalChannelCode) {
            $res['external_channel_code'] = $this->externalChannelCode;
        }
        if (null !== $this->externalProductCode) {
            $res['external_product_code'] = $this->externalProductCode;
        }
        if (null !== $this->tbrName) {
            $res['tbr_name'] = $this->tbrName;
        }
        if (null !== $this->tbrIdType) {
            $res['tbr_id_type'] = $this->tbrIdType;
        }
        if (null !== $this->tbrIdNo) {
            $res['tbr_id_no'] = $this->tbrIdNo;
        }
        if (null !== $this->tbrAddr) {
            $res['tbr_addr'] = $this->tbrAddr;
        }
        if (null !== $this->bbrName) {
            $res['bbr_name'] = $this->bbrName;
        }
        if (null !== $this->bbrIdType) {
            $res['bbr_id_type'] = $this->bbrIdType;
        }
        if (null !== $this->bbrIdNo) {
            $res['bbr_id_no'] = $this->bbrIdNo;
        }
        if (null !== $this->bbrAddr) {
            $res['bbr_addr'] = $this->bbrAddr;
        }
        if (null !== $this->schemeName) {
            $res['scheme_name'] = $this->schemeName;
        }
        if (null !== $this->insuredAmount) {
            $res['insured_amount'] = $this->insuredAmount;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->insureEnd) {
            $res['insure_end'] = $this->insureEnd;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->bcdaPt) {
            $res['bcda_pt'] = $this->bcdaPt;
        }
        if (null !== $this->vehiclePlate) {
            $res['vehicle_plate'] = $this->vehiclePlate;
        }
        if (null !== $this->vin) {
            $res['vin'] = $this->vin;
        }
        if (null !== $this->vehicleRegistDate) {
            $res['vehicle_regist_date'] = $this->vehicleRegistDate;
        }
        if (null !== $this->licenseDate) {
            $res['license_date'] = $this->licenseDate;
        }
        if (null !== $this->vehicleUsage) {
            $res['vehicle_usage'] = $this->vehicleUsage;
        }
        if (null !== $this->vehiclePrice) {
            $res['vehicle_price'] = $this->vehiclePrice;
        }
        if (null !== $this->vehicleAge) {
            $res['vehicle_age'] = $this->vehicleAge;
        }
        if (null !== $this->licensePicture) {
            $res['license_picture'] = $this->licensePicture;
        }
        if (null !== $this->batteryCode) {
            $res['battery_code'] = $this->batteryCode;
        }
        if (null !== $this->batteryNameplatePicture) {
            $res['battery_nameplate_picture'] = $this->batteryNameplatePicture;
        }
        if (null !== $this->batteryPackPhotoFile) {
            $res['battery_pack_photo_file'] = $this->batteryPackPhotoFile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyBcliInsuranceRequest
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['external_channel_code'])) {
            $model->externalChannelCode = $map['external_channel_code'];
        }
        if (isset($map['external_product_code'])) {
            $model->externalProductCode = $map['external_product_code'];
        }
        if (isset($map['tbr_name'])) {
            $model->tbrName = $map['tbr_name'];
        }
        if (isset($map['tbr_id_type'])) {
            $model->tbrIdType = $map['tbr_id_type'];
        }
        if (isset($map['tbr_id_no'])) {
            $model->tbrIdNo = $map['tbr_id_no'];
        }
        if (isset($map['tbr_addr'])) {
            $model->tbrAddr = $map['tbr_addr'];
        }
        if (isset($map['bbr_name'])) {
            $model->bbrName = $map['bbr_name'];
        }
        if (isset($map['bbr_id_type'])) {
            $model->bbrIdType = $map['bbr_id_type'];
        }
        if (isset($map['bbr_id_no'])) {
            $model->bbrIdNo = $map['bbr_id_no'];
        }
        if (isset($map['bbr_addr'])) {
            $model->bbrAddr = $map['bbr_addr'];
        }
        if (isset($map['scheme_name'])) {
            $model->schemeName = $map['scheme_name'];
        }
        if (isset($map['insured_amount'])) {
            $model->insuredAmount = $map['insured_amount'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['insure_end'])) {
            $model->insureEnd = $map['insure_end'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['bcda_pt'])) {
            $model->bcdaPt = $map['bcda_pt'];
        }
        if (isset($map['vehicle_plate'])) {
            $model->vehiclePlate = $map['vehicle_plate'];
        }
        if (isset($map['vin'])) {
            $model->vin = $map['vin'];
        }
        if (isset($map['vehicle_regist_date'])) {
            $model->vehicleRegistDate = $map['vehicle_regist_date'];
        }
        if (isset($map['license_date'])) {
            $model->licenseDate = $map['license_date'];
        }
        if (isset($map['vehicle_usage'])) {
            $model->vehicleUsage = $map['vehicle_usage'];
        }
        if (isset($map['vehicle_price'])) {
            $model->vehiclePrice = $map['vehicle_price'];
        }
        if (isset($map['vehicle_age'])) {
            $model->vehicleAge = $map['vehicle_age'];
        }
        if (isset($map['license_picture'])) {
            $model->licensePicture = $map['license_picture'];
        }
        if (isset($map['battery_code'])) {
            $model->batteryCode = $map['battery_code'];
        }
        if (isset($map['battery_nameplate_picture'])) {
            $model->batteryNameplatePicture = $map['battery_nameplate_picture'];
        }
        if (isset($map['battery_pack_photo_file'])) {
            $model->batteryPackPhotoFile = $map['battery_pack_photo_file'];
        }

        return $model;
    }
}
