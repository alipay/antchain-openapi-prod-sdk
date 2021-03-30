<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsurancepolicyZhonghuacaixianRequest extends Model
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

    // 被保险人地址
    /**
     * @var string
     */
    public $bbrAddr;

    // 被保险人证件号码
    /**
     * @var string
     */
    public $bbrIdNo;

    // 被保险人证件类型。按照如下值填写
    // 464001	身份证
    // 464002	护照
    // 464003	其他
    // 464004	组织机构代码
    // 464005	军人证
    // 464006	工商注册号码
    // 464007	统一社会信用代码
    // 464008	临时身份证
    // 464009	外国护照
    // 464010	中国人民武装警察身份证件
    // 464011	军官证
    // 464012	企业营业执照号码
    // 464013	统一社会信用代码（五证合一号码）
    // 464014	个体工商户营业执照号码
    // 464015	户口本
    // 464016	其他类境内个人身份有效证件
    // 464017	其他类境外个人身份有效证件
    // 464018	税务登记证
    // 464019	金融许可证号码
    // 464020	国家主管部门颁外国驻华机构批文号码
    // 464021	其他类境外机构代码
    /**
     * @var string
     */
    public $bbrIdType;

    // 被保险人姓名
    /**
     * @var string
     */
    public $bbrName;

    // 被保险人联系电话
    /**
     * @var string
     */
    public $bbrTel;

    // 运费,四舍五入精确到小数点两位。系统将根据运费和费率计算含税保费，计算的保费结果为四舍五入，精确到两位小数
    /**
     * @var string
     */
    public $carriage;

    // 货物名称
    /**
     * @var string
     */
    public $carGo;

    // 厂牌型号
    /**
     * @var string
     */
    public $cpModel;

    // 目的地
    /**
     * @var string
     */
    public $destination;

    // 行驶证车主
    /**
     * @var string
     */
    public $drivPer;

    // 保险起期，精确到天；最短起保时间为次日0点，最长延时起保时间为次日0点后24h
    /**
     * @var string
     */
    public $effDate;

    // 发动机编号
    /**
     * @var string
     */
    public $engineNo;

    // 车架号
    /**
     * @var string
     */
    public $frameNo;

    // 运单所属集团分布式身份标识
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 投保人证件类型有效止期
    /**
     * @var string
     */
    public $identifyPeriodEnd;

    // 投保人证件类型有效起期
    /**
     * @var string
     */
    public $identifyPeriodStart;

    // 车牌号码
    /**
     * @var string
     */
    public $licenseNo;

    // 运单所属平台分布式身份标识
    /**
     * @var string
     */
    public $platformDid;

    // 运营证号
    /**
     * @var string
     */
    public $runNo;

    // 起运地
    /**
     * @var string
     */
    public $startPlace;

    // 投保人地址
    /**
     * @var string
     */
    public $tbrAddr;

    // 投保人邮箱
    /**
     * @var string
     */
    public $tbrEmail;

    // 投保人证件号
    /**
     * @var string
     */
    public $tbrIdNo;

    // 投保人证件类型，按照如下状态进行填写
    // 464001	身份证
    // 464002	护照
    // 464003	其他
    // 464004	组织机构代码
    // 464005	军人证
    // 464006	工商注册号码
    // 464007	统一社会信用代码
    // 464008	临时身份证
    // 464009	外国护照
    // 464010	中国人民武装警察身份证件
    // 464011	军官证
    // 464012	企业营业执照号码
    // 464013	统一社会信用代码（五证合一号码）
    // 464014	个体工商户营业执照号码
    // 464015	户口本
    // 464016	其他类境内个人身份有效证件
    // 464017	其他类境外个人身份有效证件
    // 464018	税务登记证
    // 464019	金融许可证号码
    // 464020	国家主管部门颁外国驻华机构批文号码
    // 464021	其他类境外机构代码
    /**
     * @var string
     */
    public $tbrIdType;

    // 投保人姓名
    /**
     * @var string
     */
    public $tbrName;

    // 投保人联系电话
    /**
     * @var string
     */
    public $tbrTel;

    // 保险止期，保期时间间隔为1-30天。
    /**
     * @var string
     */
    public $termDate;

    // 吨位
    /**
     * @var string
     */
    public $tonNage;

    // 交易流水号,全局唯一；格式为 yyyyMMdd+身份标识+其他编码。系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中状态，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果
    /**
     * @var string
     */
    public $tradeNo;

    // 运输货物
    /**
     * @var string
     */
    public $tsCarGo;

    // 运单id。通过运单创建接口上传运单时指定的运单标识。系统会根据该标识查询运单相关信息做投保业务校验
    /**
     * @var string
     */
    public $waybillId;

    // 重量
    /**
     * @var string
     */
    public $weight;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'bbrAddr'             => 'bbr_addr',
        'bbrIdNo'             => 'bbr_id_no',
        'bbrIdType'           => 'bbr_id_type',
        'bbrName'             => 'bbr_name',
        'bbrTel'              => 'bbr_tel',
        'carriage'            => 'carriage',
        'carGo'               => 'car_go',
        'cpModel'             => 'cp_model',
        'destination'         => 'destination',
        'drivPer'             => 'driv_per',
        'effDate'             => 'eff_date',
        'engineNo'            => 'engine_no',
        'frameNo'             => 'frame_no',
        'groupPlatformDid'    => 'group_platform_did',
        'identifyPeriodEnd'   => 'identify_period_end',
        'identifyPeriodStart' => 'identify_period_start',
        'licenseNo'           => 'license_no',
        'platformDid'         => 'platform_did',
        'runNo'               => 'run_no',
        'startPlace'          => 'start_place',
        'tbrAddr'             => 'tbr_addr',
        'tbrEmail'            => 'tbr_email',
        'tbrIdNo'             => 'tbr_id_no',
        'tbrIdType'           => 'tbr_id_type',
        'tbrName'             => 'tbr_name',
        'tbrTel'              => 'tbr_tel',
        'termDate'            => 'term_date',
        'tonNage'             => 'ton_nage',
        'tradeNo'             => 'trade_no',
        'tsCarGo'             => 'ts_car_go',
        'waybillId'           => 'waybill_id',
        'weight'              => 'weight',
    ];

    public function validate()
    {
        Model::validateMaxLength('bbrAddr', $this->bbrAddr, 80);
        Model::validateMaxLength('bbrIdNo', $this->bbrIdNo, 40);
        Model::validateMaxLength('bbrIdType', $this->bbrIdType, 40);
        Model::validateMaxLength('bbrName', $this->bbrName, 40);
        Model::validateMaxLength('bbrTel', $this->bbrTel, 40);
        Model::validateMaxLength('carriage', $this->carriage, 20);
        Model::validateMaxLength('carGo', $this->carGo, 40);
        Model::validateMaxLength('cpModel', $this->cpModel, 80);
        Model::validateMaxLength('destination', $this->destination, 200);
        Model::validateMaxLength('drivPer', $this->drivPer, 40);
        Model::validateMaxLength('engineNo', $this->engineNo, 40);
        Model::validateMaxLength('frameNo', $this->frameNo, 40);
        Model::validateMaxLength('groupPlatformDid', $this->groupPlatformDid, 80);
        Model::validateMaxLength('licenseNo', $this->licenseNo, 40);
        Model::validateMaxLength('platformDid', $this->platformDid, 80);
        Model::validateMaxLength('runNo', $this->runNo, 40);
        Model::validateMaxLength('startPlace', $this->startPlace, 200);
        Model::validateMaxLength('tbrAddr', $this->tbrAddr, 80);
        Model::validateMaxLength('tbrEmail', $this->tbrEmail, 40);
        Model::validateMaxLength('tbrIdNo', $this->tbrIdNo, 40);
        Model::validateMaxLength('tbrIdType', $this->tbrIdType, 40);
        Model::validateMaxLength('tbrName', $this->tbrName, 40);
        Model::validateMaxLength('tbrTel', $this->tbrTel, 40);
        Model::validateMaxLength('tonNage', $this->tonNage, 20);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 32);
        Model::validateMaxLength('tsCarGo', $this->tsCarGo, 80);
        Model::validateMaxLength('waybillId', $this->waybillId, 128);
        Model::validateMaxLength('weight', $this->weight, 20);
        Model::validateRequired('bbrIdNo', $this->bbrIdNo, true);
        Model::validateRequired('bbrIdType', $this->bbrIdType, true);
        Model::validateRequired('bbrName', $this->bbrName, true);
        Model::validateRequired('bbrTel', $this->bbrTel, true);
        Model::validateRequired('carriage', $this->carriage, true);
        Model::validateRequired('carGo', $this->carGo, true);
        Model::validateRequired('cpModel', $this->cpModel, true);
        Model::validateRequired('drivPer', $this->drivPer, true);
        Model::validateRequired('effDate', $this->effDate, true);
        Model::validateRequired('engineNo', $this->engineNo, true);
        Model::validateRequired('frameNo', $this->frameNo, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('licenseNo', $this->licenseNo, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('runNo', $this->runNo, true);
        Model::validateRequired('tbrIdNo', $this->tbrIdNo, true);
        Model::validateRequired('tbrIdType', $this->tbrIdType, true);
        Model::validateRequired('tbrName', $this->tbrName, true);
        Model::validateRequired('tbrTel', $this->tbrTel, true);
        Model::validateRequired('termDate', $this->termDate, true);
        Model::validateRequired('tonNage', $this->tonNage, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('tsCarGo', $this->tsCarGo, true);
        Model::validateRequired('waybillId', $this->waybillId, true);
        Model::validatePattern('effDate', $this->effDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('identifyPeriodEnd', $this->identifyPeriodEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('identifyPeriodStart', $this->identifyPeriodStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('termDate', $this->termDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateMinLength('tradeNo', $this->tradeNo, 32);
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
        if (null !== $this->bbrAddr) {
            $res['bbr_addr'] = $this->bbrAddr;
        }
        if (null !== $this->bbrIdNo) {
            $res['bbr_id_no'] = $this->bbrIdNo;
        }
        if (null !== $this->bbrIdType) {
            $res['bbr_id_type'] = $this->bbrIdType;
        }
        if (null !== $this->bbrName) {
            $res['bbr_name'] = $this->bbrName;
        }
        if (null !== $this->bbrTel) {
            $res['bbr_tel'] = $this->bbrTel;
        }
        if (null !== $this->carriage) {
            $res['carriage'] = $this->carriage;
        }
        if (null !== $this->carGo) {
            $res['car_go'] = $this->carGo;
        }
        if (null !== $this->cpModel) {
            $res['cp_model'] = $this->cpModel;
        }
        if (null !== $this->destination) {
            $res['destination'] = $this->destination;
        }
        if (null !== $this->drivPer) {
            $res['driv_per'] = $this->drivPer;
        }
        if (null !== $this->effDate) {
            $res['eff_date'] = $this->effDate;
        }
        if (null !== $this->engineNo) {
            $res['engine_no'] = $this->engineNo;
        }
        if (null !== $this->frameNo) {
            $res['frame_no'] = $this->frameNo;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->identifyPeriodEnd) {
            $res['identify_period_end'] = $this->identifyPeriodEnd;
        }
        if (null !== $this->identifyPeriodStart) {
            $res['identify_period_start'] = $this->identifyPeriodStart;
        }
        if (null !== $this->licenseNo) {
            $res['license_no'] = $this->licenseNo;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->runNo) {
            $res['run_no'] = $this->runNo;
        }
        if (null !== $this->startPlace) {
            $res['start_place'] = $this->startPlace;
        }
        if (null !== $this->tbrAddr) {
            $res['tbr_addr'] = $this->tbrAddr;
        }
        if (null !== $this->tbrEmail) {
            $res['tbr_email'] = $this->tbrEmail;
        }
        if (null !== $this->tbrIdNo) {
            $res['tbr_id_no'] = $this->tbrIdNo;
        }
        if (null !== $this->tbrIdType) {
            $res['tbr_id_type'] = $this->tbrIdType;
        }
        if (null !== $this->tbrName) {
            $res['tbr_name'] = $this->tbrName;
        }
        if (null !== $this->tbrTel) {
            $res['tbr_tel'] = $this->tbrTel;
        }
        if (null !== $this->termDate) {
            $res['term_date'] = $this->termDate;
        }
        if (null !== $this->tonNage) {
            $res['ton_nage'] = $this->tonNage;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->tsCarGo) {
            $res['ts_car_go'] = $this->tsCarGo;
        }
        if (null !== $this->waybillId) {
            $res['waybill_id'] = $this->waybillId;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsurancepolicyZhonghuacaixianRequest
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
        if (isset($map['bbr_addr'])) {
            $model->bbrAddr = $map['bbr_addr'];
        }
        if (isset($map['bbr_id_no'])) {
            $model->bbrIdNo = $map['bbr_id_no'];
        }
        if (isset($map['bbr_id_type'])) {
            $model->bbrIdType = $map['bbr_id_type'];
        }
        if (isset($map['bbr_name'])) {
            $model->bbrName = $map['bbr_name'];
        }
        if (isset($map['bbr_tel'])) {
            $model->bbrTel = $map['bbr_tel'];
        }
        if (isset($map['carriage'])) {
            $model->carriage = $map['carriage'];
        }
        if (isset($map['car_go'])) {
            $model->carGo = $map['car_go'];
        }
        if (isset($map['cp_model'])) {
            $model->cpModel = $map['cp_model'];
        }
        if (isset($map['destination'])) {
            $model->destination = $map['destination'];
        }
        if (isset($map['driv_per'])) {
            $model->drivPer = $map['driv_per'];
        }
        if (isset($map['eff_date'])) {
            $model->effDate = $map['eff_date'];
        }
        if (isset($map['engine_no'])) {
            $model->engineNo = $map['engine_no'];
        }
        if (isset($map['frame_no'])) {
            $model->frameNo = $map['frame_no'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['identify_period_end'])) {
            $model->identifyPeriodEnd = $map['identify_period_end'];
        }
        if (isset($map['identify_period_start'])) {
            $model->identifyPeriodStart = $map['identify_period_start'];
        }
        if (isset($map['license_no'])) {
            $model->licenseNo = $map['license_no'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['run_no'])) {
            $model->runNo = $map['run_no'];
        }
        if (isset($map['start_place'])) {
            $model->startPlace = $map['start_place'];
        }
        if (isset($map['tbr_addr'])) {
            $model->tbrAddr = $map['tbr_addr'];
        }
        if (isset($map['tbr_email'])) {
            $model->tbrEmail = $map['tbr_email'];
        }
        if (isset($map['tbr_id_no'])) {
            $model->tbrIdNo = $map['tbr_id_no'];
        }
        if (isset($map['tbr_id_type'])) {
            $model->tbrIdType = $map['tbr_id_type'];
        }
        if (isset($map['tbr_name'])) {
            $model->tbrName = $map['tbr_name'];
        }
        if (isset($map['tbr_tel'])) {
            $model->tbrTel = $map['tbr_tel'];
        }
        if (isset($map['term_date'])) {
            $model->termDate = $map['term_date'];
        }
        if (isset($map['ton_nage'])) {
            $model->tonNage = $map['ton_nage'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['ts_car_go'])) {
            $model->tsCarGo = $map['ts_car_go'];
        }
        if (isset($map['waybill_id'])) {
            $model->waybillId = $map['waybill_id'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
