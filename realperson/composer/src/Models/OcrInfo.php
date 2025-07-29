<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class OcrInfo extends Model
{
    // 当识别到身份证是人像面时返回FACE，国徽面时返回BACK
    /**
     * @example FACE
     *
     * @var string
     */
    public $side;

    // 当请求参数 return_photo = true时返回，头像切图的 base64 编码（无编码头，需自行处理）
    // *当服务降级时，返回null
    /**
     * @example BASE64String
     *
     * @var string
     */
    public $photo;

    // {}	当请求参数 return_photo = true时返回，头像的位置信息（坐标0点为左上角）
    // *当服务降级时，返回null
    /**
     * @example {}
     *
     * @var OcrLocation
     */
    public $photoLocation;

    // 当请求参数 return_card = true时返回，身份证裁剪切图的 base64 编码（无编码头，需自行处理）
    // *当服务降级时，返回null
    /**
     * @example BASE64String
     *
     * @var string
     */
    public $cardImage;

    // 当请求参数 return_card = true时返回，身份证裁剪切图的位置信息（坐标0点为左上角）
    // *当服务降级时，返回null
    /**
     * @example {}
     *
     * @var OcrLocation
     */
    public $cardLocation;

    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 性别
    /**
     * @example 女
     *
     * @var string
     */
    public $sex;

    // 民族
    /**
     * @example 汉
     *
     * @var string
     */
    public $nationality;

    // 出生日期（yyyyMMdd格式）
    /**
     * @example 19620710
     *
     * @var string
     */
    public $birth;

    // 住址
    /**
     * @example 江苏省睢宁县xxxx
     *
     * @var string
     */
    public $address;

    // 身份证号
    /**
     * @example 320324196207101234
     *
     * @var string
     */
    public $num;

    // 发证日期（yyyyMMdd格式）
    /**
     * @example 20120912
     *
     * @var string
     */
    public $startDate;

    // 到期日（yyyyMMdd格式）。
    // 如果是长期身份证，该字段内容为“长期”（不含引号）。
    /**
     * @example 20220912
     *
     * @var string
     */
    public $endDate;

    // 签发机关
    /**
     * @example 宜川县公安局
     *
     * @var string
     */
    public $issue;

    // 银行卡类型（CC（贷记卡），SCC（准贷记卡），DCC（存贷合一卡），DC（储蓄卡），PC（预付卡））
    /**
     * @example CC
     *
     * @var string
     */
    public $bankCardType;

    // 银行名，不能识别时为空
    /**
     * @example 中国建设银行
     *
     * @var string
     */
    public $bankName;

    // 银行卡号
    /**
     * @example 6227001223456784765
     *
     * @var string
     */
    public $cardNumber;

    // 有效期至
    /**
     * @example 10/30
     *
     * @var string
     */
    public $validToDate;

    // 证件类别
    /**
     * @example 港澳居民来往内地通行证
     *
     * @var string
     */
    public $title;

    // 有效期限(yyyy.MM.dd-yyyy.MM.dd格式)
    /**
     * @example 2017.07.13-2027.07.12
     *
     * @var string
     */
    public $dateOfExpiry;

    // 换证次数
    /**
     * @example 01
     *
     * @var string
     */
    public $changeNum;

    // 初次领证日期
    /**
     * @example 20200202
     *
     * @var string
     */
    public $firstIssue;

    // 准驾车型
    /**
     * @example C1
     *
     * @var string
     */
    public $driverClass;

    // 档案编号
    /**
     * @example 110012345678
     *
     * @var string
     */
    public $docNum;

    // 电子驾驶证生成时间
    /**
     * @example 2021年08月06日
     *
     * @var string
     */
    public $issueTime;

    // 当前时间
    /**
     * @example 2021年04月16日14:09:39
     *
     * @var string
     */
    public $currentTime;

    // 条形码编号
    /**
     * @example *4360028416316*
     *
     * @var string
     */
    public $barCode;

    // 累计记分
    /**
     * @example 0
     *
     * @var string
     */
    public $points;

    // 记录
    /**
     * @example 请于每个记分周期结束后三十日接受审验。无记分的，免予本次审验。
     *
     * @var string
     */
    public $remark;

    // 状态
    /**
     * @example 正常
     *
     * @var string
     */
    public $status;

    // 车辆识别代号
    /**
     * @example SSVUDDTT2J2022558
     *
     * @var string
     */
    public $vehicle;

    // 品牌型号
    /**
     * @example 大众汽车牌SVW6474DFD
     *
     * @var string
     */
    public $model;

    // 车辆类型
    /**
     * @example 小型普通客车
     *
     * @var string
     */
    public $type;

    // 使用性质
    /**
     * @example 非运营
     *
     * @var string
     */
    public $useage;

    // 发动机号码
    /**
     * @example 111533
     *
     * @var string
     */
    public $engNum;

    // 车牌号码
    /**
     * @example 浙BF12345
     *
     * @var string
     */
    public $plate;

    // 检验记录
    /**
     * @example 2018年11月渝A()
     *
     * @var string
     */
    public $inspecRecord;

    // 核定载质量
    /**
     * @example 1490kg
     *
     * @var string
     */
    public $load;

    // 整备质量
    /**
     * @example 2600kg
     *
     * @var string
     */
    public $curbMass;

    // 外廓尺寸
    /**
     * @example 5990X2500X4400mm
     *
     * @var string
     */
    public $overallDimension;

    // 核定载人数
    /**
     * @example 5人
     *
     * @var string
     */
    public $seating;

    // 总质量
    /**
     * @example 4290kg
     *
     * @var string
     */
    public $grossMass;

    // 燃油类型
    /**
     * @example 柴油
     *
     * @var string
     */
    public $fuel;

    // 准牵引总质量
    /**
     * @example 2700kg
     *
     * @var string
     */
    public $tractionMass;

    // 证芯编号
    /**
     * @example 50027372380230106
     *
     * @var string
     */
    public $chipNum;
    protected $_name = [
        'side'             => 'side',
        'photo'            => 'photo',
        'photoLocation'    => 'photo_location',
        'cardImage'        => 'card_image',
        'cardLocation'     => 'card_location',
        'name'             => 'name',
        'sex'              => 'sex',
        'nationality'      => 'nationality',
        'birth'            => 'birth',
        'address'          => 'address',
        'num'              => 'num',
        'startDate'        => 'start_date',
        'endDate'          => 'end_date',
        'issue'            => 'issue',
        'bankCardType'     => 'bank_card_type',
        'bankName'         => 'bank_name',
        'cardNumber'       => 'card_number',
        'validToDate'      => 'valid_to_date',
        'title'            => 'title',
        'dateOfExpiry'     => 'date_of_expiry',
        'changeNum'        => 'change_num',
        'firstIssue'       => 'first_issue',
        'driverClass'      => 'driver_class',
        'docNum'           => 'doc_num',
        'issueTime'        => 'issue_time',
        'currentTime'      => 'current_time',
        'barCode'          => 'bar_code',
        'points'           => 'points',
        'remark'           => 'remark',
        'status'           => 'status',
        'vehicle'          => 'vehicle',
        'model'            => 'model',
        'type'             => 'type',
        'useage'           => 'useage',
        'engNum'           => 'eng_num',
        'plate'            => 'plate',
        'inspecRecord'     => 'inspec_record',
        'load'             => 'load',
        'curbMass'         => 'curb_mass',
        'overallDimension' => 'overall_dimension',
        'seating'          => 'seating',
        'grossMass'        => 'gross_mass',
        'fuel'             => 'fuel',
        'tractionMass'     => 'traction_mass',
        'chipNum'          => 'chip_num',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->side) {
            $res['side'] = $this->side;
        }
        if (null !== $this->photo) {
            $res['photo'] = $this->photo;
        }
        if (null !== $this->photoLocation) {
            $res['photo_location'] = null !== $this->photoLocation ? $this->photoLocation->toMap() : null;
        }
        if (null !== $this->cardImage) {
            $res['card_image'] = $this->cardImage;
        }
        if (null !== $this->cardLocation) {
            $res['card_location'] = null !== $this->cardLocation ? $this->cardLocation->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }
        if (null !== $this->nationality) {
            $res['nationality'] = $this->nationality;
        }
        if (null !== $this->birth) {
            $res['birth'] = $this->birth;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->num) {
            $res['num'] = $this->num;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->issue) {
            $res['issue'] = $this->issue;
        }
        if (null !== $this->bankCardType) {
            $res['bank_card_type'] = $this->bankCardType;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->cardNumber) {
            $res['card_number'] = $this->cardNumber;
        }
        if (null !== $this->validToDate) {
            $res['valid_to_date'] = $this->validToDate;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->dateOfExpiry) {
            $res['date_of_expiry'] = $this->dateOfExpiry;
        }
        if (null !== $this->changeNum) {
            $res['change_num'] = $this->changeNum;
        }
        if (null !== $this->firstIssue) {
            $res['first_issue'] = $this->firstIssue;
        }
        if (null !== $this->driverClass) {
            $res['driver_class'] = $this->driverClass;
        }
        if (null !== $this->docNum) {
            $res['doc_num'] = $this->docNum;
        }
        if (null !== $this->issueTime) {
            $res['issue_time'] = $this->issueTime;
        }
        if (null !== $this->currentTime) {
            $res['current_time'] = $this->currentTime;
        }
        if (null !== $this->barCode) {
            $res['bar_code'] = $this->barCode;
        }
        if (null !== $this->points) {
            $res['points'] = $this->points;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->vehicle) {
            $res['vehicle'] = $this->vehicle;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->useage) {
            $res['useage'] = $this->useage;
        }
        if (null !== $this->engNum) {
            $res['eng_num'] = $this->engNum;
        }
        if (null !== $this->plate) {
            $res['plate'] = $this->plate;
        }
        if (null !== $this->inspecRecord) {
            $res['inspec_record'] = $this->inspecRecord;
        }
        if (null !== $this->load) {
            $res['load'] = $this->load;
        }
        if (null !== $this->curbMass) {
            $res['curb_mass'] = $this->curbMass;
        }
        if (null !== $this->overallDimension) {
            $res['overall_dimension'] = $this->overallDimension;
        }
        if (null !== $this->seating) {
            $res['seating'] = $this->seating;
        }
        if (null !== $this->grossMass) {
            $res['gross_mass'] = $this->grossMass;
        }
        if (null !== $this->fuel) {
            $res['fuel'] = $this->fuel;
        }
        if (null !== $this->tractionMass) {
            $res['traction_mass'] = $this->tractionMass;
        }
        if (null !== $this->chipNum) {
            $res['chip_num'] = $this->chipNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OcrInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['side'])) {
            $model->side = $map['side'];
        }
        if (isset($map['photo'])) {
            $model->photo = $map['photo'];
        }
        if (isset($map['photo_location'])) {
            $model->photoLocation = OcrLocation::fromMap($map['photo_location']);
        }
        if (isset($map['card_image'])) {
            $model->cardImage = $map['card_image'];
        }
        if (isset($map['card_location'])) {
            $model->cardLocation = OcrLocation::fromMap($map['card_location']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['sex'])) {
            $model->sex = $map['sex'];
        }
        if (isset($map['nationality'])) {
            $model->nationality = $map['nationality'];
        }
        if (isset($map['birth'])) {
            $model->birth = $map['birth'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['num'])) {
            $model->num = $map['num'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['issue'])) {
            $model->issue = $map['issue'];
        }
        if (isset($map['bank_card_type'])) {
            $model->bankCardType = $map['bank_card_type'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['card_number'])) {
            $model->cardNumber = $map['card_number'];
        }
        if (isset($map['valid_to_date'])) {
            $model->validToDate = $map['valid_to_date'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['date_of_expiry'])) {
            $model->dateOfExpiry = $map['date_of_expiry'];
        }
        if (isset($map['change_num'])) {
            $model->changeNum = $map['change_num'];
        }
        if (isset($map['first_issue'])) {
            $model->firstIssue = $map['first_issue'];
        }
        if (isset($map['driver_class'])) {
            $model->driverClass = $map['driver_class'];
        }
        if (isset($map['doc_num'])) {
            $model->docNum = $map['doc_num'];
        }
        if (isset($map['issue_time'])) {
            $model->issueTime = $map['issue_time'];
        }
        if (isset($map['current_time'])) {
            $model->currentTime = $map['current_time'];
        }
        if (isset($map['bar_code'])) {
            $model->barCode = $map['bar_code'];
        }
        if (isset($map['points'])) {
            $model->points = $map['points'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['vehicle'])) {
            $model->vehicle = $map['vehicle'];
        }
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['useage'])) {
            $model->useage = $map['useage'];
        }
        if (isset($map['eng_num'])) {
            $model->engNum = $map['eng_num'];
        }
        if (isset($map['plate'])) {
            $model->plate = $map['plate'];
        }
        if (isset($map['inspec_record'])) {
            $model->inspecRecord = $map['inspec_record'];
        }
        if (isset($map['load'])) {
            $model->load = $map['load'];
        }
        if (isset($map['curb_mass'])) {
            $model->curbMass = $map['curb_mass'];
        }
        if (isset($map['overall_dimension'])) {
            $model->overallDimension = $map['overall_dimension'];
        }
        if (isset($map['seating'])) {
            $model->seating = $map['seating'];
        }
        if (isset($map['gross_mass'])) {
            $model->grossMass = $map['gross_mass'];
        }
        if (isset($map['fuel'])) {
            $model->fuel = $map['fuel'];
        }
        if (isset($map['traction_mass'])) {
            $model->tractionMass = $map['traction_mass'];
        }
        if (isset($map['chip_num'])) {
            $model->chipNum = $map['chip_num'];
        }

        return $model;
    }
}
