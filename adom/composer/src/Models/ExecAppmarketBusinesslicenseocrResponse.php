<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ADOM\Models;

use AlibabaCloud\Tea\Model;

class ExecAppmarketBusinesslicenseocrResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 地址
    /**
     * @var string
     */
    public $address;

    // 经营范围
    /**
     * @var string
     */
    public $business;

    // 注册资本
    /**
     * @var string
     */
    public $captial;

    // 企业成立日期
    /**
     * @var string
     */
    public $establishDate;

    // 名称，控股股东名称
    /**
     * @var string
     */
    public $name;

    // 法定代表人
    /**
     * @var string
     */
    public $person;

    // 统一社会信用代码，控股股东证件号码
    /**
     * @var string
     */
    public $regNum;

    // 印章
    /**
     * @var string
     */
    public $stamp;

    // 类型，如：有限责任公司(自然人独资)
    /**
     * @var string
     */
    public $type;

    // 营业期限，营业执照有效期，控股股东证件有效期
    /**
     * @var string
     */
    public $validPeriod;

    // 标题，如"营业执照"
    /**
     * @var string
     */
    public $title;

    // 颁发日期
    /**
     * @var string
     */
    public $date;

    // 编号
    /**
     * @var string
     */
    public $num;

    // 投资人
    /**
     * @var string
     */
    public $investors;

    // 组成形式
    /**
     * @var string
     */
    public $formation;

    // 注册日期
    /**
     * @var string
     */
    public $dateOfRegistration;

    // 经营者
    /**
     * @var string
     */
    public $operators;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'address'            => 'address',
        'business'           => 'business',
        'captial'            => 'captial',
        'establishDate'      => 'establish_date',
        'name'               => 'name',
        'person'             => 'person',
        'regNum'             => 'reg_num',
        'stamp'              => 'stamp',
        'type'               => 'type',
        'validPeriod'        => 'valid_period',
        'title'              => 'title',
        'date'               => 'date',
        'num'                => 'num',
        'investors'          => 'investors',
        'formation'          => 'formation',
        'dateOfRegistration' => 'date_of_registration',
        'operators'          => 'operators',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->business) {
            $res['business'] = $this->business;
        }
        if (null !== $this->captial) {
            $res['captial'] = $this->captial;
        }
        if (null !== $this->establishDate) {
            $res['establish_date'] = $this->establishDate;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->person) {
            $res['person'] = $this->person;
        }
        if (null !== $this->regNum) {
            $res['reg_num'] = $this->regNum;
        }
        if (null !== $this->stamp) {
            $res['stamp'] = $this->stamp;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->validPeriod) {
            $res['valid_period'] = $this->validPeriod;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->num) {
            $res['num'] = $this->num;
        }
        if (null !== $this->investors) {
            $res['investors'] = $this->investors;
        }
        if (null !== $this->formation) {
            $res['formation'] = $this->formation;
        }
        if (null !== $this->dateOfRegistration) {
            $res['date_of_registration'] = $this->dateOfRegistration;
        }
        if (null !== $this->operators) {
            $res['operators'] = $this->operators;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAppmarketBusinesslicenseocrResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['business'])) {
            $model->business = $map['business'];
        }
        if (isset($map['captial'])) {
            $model->captial = $map['captial'];
        }
        if (isset($map['establish_date'])) {
            $model->establishDate = $map['establish_date'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['person'])) {
            $model->person = $map['person'];
        }
        if (isset($map['reg_num'])) {
            $model->regNum = $map['reg_num'];
        }
        if (isset($map['stamp'])) {
            $model->stamp = $map['stamp'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['valid_period'])) {
            $model->validPeriod = $map['valid_period'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['num'])) {
            $model->num = $map['num'];
        }
        if (isset($map['investors'])) {
            $model->investors = $map['investors'];
        }
        if (isset($map['formation'])) {
            $model->formation = $map['formation'];
        }
        if (isset($map['date_of_registration'])) {
            $model->dateOfRegistration = $map['date_of_registration'];
        }
        if (isset($map['operators'])) {
            $model->operators = $map['operators'];
        }

        return $model;
    }
}
