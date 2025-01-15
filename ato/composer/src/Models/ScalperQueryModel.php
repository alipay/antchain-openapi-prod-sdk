<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ScalperQueryModel extends Model
{
    // 注册手机号，填写咨询对象所关联的注册手机号
    /**
     * @example 123xxxxxx56
     *
     * @var string
     */
    public $registrationPhone;

    // 认证时间，填写风险咨询对象所关联的账号的真实身份认证时间
    /**
     * @example 2099-12-30 23:59:59
     *
     * @var string
     */
    public $certificateDate;

    // 登录手机号，填写风险咨询对象关联账号的登录手机号
    /**
     * @example 123xxxxxx56
     *
     * @var string
     */
    public $loginPhone;

    // 注册账号身份证，填写风险咨询对象所关联账号的注册身份证信息
    /**
     * @example 123xxxxxxxxxx55
     *
     * @var string
     */
    public $registrationCert;

    // 登录账号身份证，登录账号的身份证号码
    /**
     * @example 230109xxxxxxxx3000
     *
     * @var string
     */
    public $loginCert;

    // 注册时间，填写风险咨询对象所关联的账号的注册时间
    /**
     * @example 2099-12-30 23:59:59
     *
     * @var string
     */
    public $registrationDate;

    // 证件类型；枚举值：1 - 身份证；2 - 护照
    /**
     * @example 1
     *
     * @var int
     */
    public $certType;

    // 银行卡号
    /**
     * @example 223940194399993xxxx
     *
     * @var string
     */
    public $bankCardNo;

    // 用户邮箱
    /**
     * @example zhifubaoxxxx@163.com
     *
     * @var string
     */
    public $emailAddress;

    // 手机序列号
    /**
     * @example 86573603141xxxx
     *
     * @var string
     */
    public $imei;

    // 国际移动用户识别码
    /**
     * @example 46000123456xxxx
     *
     * @var string
     */
    public $imsi;

    // mac 地址或设备唯一标识
    /**
     * @example 42.118.71.72
     *
     * @var string
     */
    public $macAddress;

    // 设备号，设备唯一号码
    /**
     * @example qtedxaxxxxxxxx
     *
     * @var string
     */
    public $apdid;

    // 支付宝外部交易号
    /**
     * @example 123xxxxxxxxxx55
     *
     * @var string
     */
    public $outOrderNo;

    // 所咨询的唯一支付宝交易号
    /**
     * @example 202304262200141025xxxxxx0000
     *
     * @var string
     */
    public $orderNo;

    // 用户购买或使用服务时产生的具体金额总数，单位：分
    /**
     * @example 3354
     *
     * @var int
     */
    public $salesAmount;

    // 用户姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $userName;

    // 收货手机号，用于区分 mobile_no 所填的手机号
    /**
     * @example 1380095xxxx
     *
     * @var string
     */
    public $mailingPhone;

    // 收货地址
    /**
     * @example 西溪路
     *
     * @var string
     */
    public $mailingAddress;

    // 是否为员工账号，枚举值：1 - 是
    /**
     * @example 1
     *
     * @var string
     */
    public $isEmployee;

    // 渠道，枚举值：alipay - 支付宝；app - 自有app；pc - 电脑端
    /**
     * @example alipay
     *
     * @var string
     */
    public $channel;

    // 服务商 pid
    /**
     * @example 208850162456xxxx
     *
     * @var string
     */
    public $isvPid;

    // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
    /**
     * @example CATERING
     *
     * @var string
     */
    public $storeMccDesc;

    // 消费者 id，外部会员账号
    /**
     * @example 12321123
     *
     * @var string
     */
    public $customerId;

    // 订单所有商品信息列表
    /**
     * @example
     *
     * @var ScalperQueryOrderItem[]
     */
    public $orderItemsInfoList;
    protected $_name = [
        'registrationPhone'  => 'registration_phone',
        'certificateDate'    => 'certificate_date',
        'loginPhone'         => 'login_phone',
        'registrationCert'   => 'registration_cert',
        'loginCert'          => 'login_cert',
        'registrationDate'   => 'registration_date',
        'certType'           => 'cert_type',
        'bankCardNo'         => 'bank_card_no',
        'emailAddress'       => 'email_address',
        'imei'               => 'imei',
        'imsi'               => 'imsi',
        'macAddress'         => 'mac_address',
        'apdid'              => 'apdid',
        'outOrderNo'         => 'out_order_no',
        'orderNo'            => 'order_no',
        'salesAmount'        => 'sales_amount',
        'userName'           => 'user_name',
        'mailingPhone'       => 'mailing_phone',
        'mailingAddress'     => 'mailing_address',
        'isEmployee'         => 'is_employee',
        'channel'            => 'channel',
        'isvPid'             => 'isv_pid',
        'storeMccDesc'       => 'store_mcc_desc',
        'customerId'         => 'customer_id',
        'orderItemsInfoList' => 'order_items_info_list',
    ];

    public function validate()
    {
        Model::validateMaxLength('registrationPhone', $this->registrationPhone, 20);
        Model::validateMaxLength('certificateDate', $this->certificateDate, 20);
        Model::validateMaxLength('loginPhone', $this->loginPhone, 20);
        Model::validateMaxLength('registrationCert', $this->registrationCert, 30);
        Model::validateMaxLength('loginCert', $this->loginCert, 30);
        Model::validateMaxLength('registrationDate', $this->registrationDate, 20);
        Model::validateMaxLength('bankCardNo', $this->bankCardNo, 50);
        Model::validateMaxLength('emailAddress', $this->emailAddress, 35);
        Model::validateMaxLength('imei', $this->imei, 100);
        Model::validateMaxLength('imsi', $this->imsi, 100);
        Model::validateMaxLength('macAddress', $this->macAddress, 30);
        Model::validateMaxLength('apdid', $this->apdid, 128);
        Model::validateMaxLength('outOrderNo', $this->outOrderNo, 128);
        Model::validateMaxLength('orderNo', $this->orderNo, 128);
        Model::validateMaxLength('userName', $this->userName, 50);
        Model::validateMaxLength('mailingPhone', $this->mailingPhone, 20);
        Model::validateMaxLength('mailingAddress', $this->mailingAddress, 128);
        Model::validateMaxLength('isEmployee', $this->isEmployee, 10);
        Model::validateMaxLength('channel', $this->channel, 10);
        Model::validateMaxLength('isvPid', $this->isvPid, 128);
        Model::validateMaxLength('storeMccDesc', $this->storeMccDesc, 20);
        Model::validateMaxLength('customerId', $this->customerId, 128);
        Model::validateMinLength('registrationPhone', $this->registrationPhone, 1);
        Model::validateMinLength('certificateDate', $this->certificateDate, 1);
        Model::validateMinLength('loginPhone', $this->loginPhone, 1);
        Model::validateMinLength('registrationCert', $this->registrationCert, 1);
        Model::validateMinLength('loginCert', $this->loginCert, 1);
        Model::validateMinLength('registrationDate', $this->registrationDate, 1);
        Model::validateMinLength('bankCardNo', $this->bankCardNo, 1);
        Model::validateMinLength('emailAddress', $this->emailAddress, 1);
        Model::validateMinLength('imei', $this->imei, 1);
        Model::validateMinLength('imsi', $this->imsi, 1);
        Model::validateMinLength('macAddress', $this->macAddress, 1);
        Model::validateMinLength('apdid', $this->apdid, 1);
        Model::validateMinLength('outOrderNo', $this->outOrderNo, 1);
        Model::validateMinLength('orderNo', $this->orderNo, 1);
        Model::validateMinLength('userName', $this->userName, 1);
        Model::validateMinLength('mailingPhone', $this->mailingPhone, 1);
        Model::validateMinLength('mailingAddress', $this->mailingAddress, 1);
        Model::validateMinLength('isEmployee', $this->isEmployee, 1);
        Model::validateMinLength('channel', $this->channel, 1);
        Model::validateMinLength('isvPid', $this->isvPid, 1);
        Model::validateMinLength('storeMccDesc', $this->storeMccDesc, 1);
        Model::validateMinLength('customerId', $this->customerId, 1);
        Model::validateMaximum('certType', $this->certType, 2);
        Model::validateMaximum('salesAmount', $this->salesAmount, 1000000);
        Model::validateMinimum('certType', $this->certType, 1);
        Model::validateMinimum('salesAmount', $this->salesAmount, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->registrationPhone) {
            $res['registration_phone'] = $this->registrationPhone;
        }
        if (null !== $this->certificateDate) {
            $res['certificate_date'] = $this->certificateDate;
        }
        if (null !== $this->loginPhone) {
            $res['login_phone'] = $this->loginPhone;
        }
        if (null !== $this->registrationCert) {
            $res['registration_cert'] = $this->registrationCert;
        }
        if (null !== $this->loginCert) {
            $res['login_cert'] = $this->loginCert;
        }
        if (null !== $this->registrationDate) {
            $res['registration_date'] = $this->registrationDate;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->emailAddress) {
            $res['email_address'] = $this->emailAddress;
        }
        if (null !== $this->imei) {
            $res['imei'] = $this->imei;
        }
        if (null !== $this->imsi) {
            $res['imsi'] = $this->imsi;
        }
        if (null !== $this->macAddress) {
            $res['mac_address'] = $this->macAddress;
        }
        if (null !== $this->apdid) {
            $res['apdid'] = $this->apdid;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->salesAmount) {
            $res['sales_amount'] = $this->salesAmount;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->mailingPhone) {
            $res['mailing_phone'] = $this->mailingPhone;
        }
        if (null !== $this->mailingAddress) {
            $res['mailing_address'] = $this->mailingAddress;
        }
        if (null !== $this->isEmployee) {
            $res['is_employee'] = $this->isEmployee;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->isvPid) {
            $res['isv_pid'] = $this->isvPid;
        }
        if (null !== $this->storeMccDesc) {
            $res['store_mcc_desc'] = $this->storeMccDesc;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->orderItemsInfoList) {
            $res['order_items_info_list'] = [];
            if (null !== $this->orderItemsInfoList && \is_array($this->orderItemsInfoList)) {
                $n = 0;
                foreach ($this->orderItemsInfoList as $item) {
                    $res['order_items_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScalperQueryModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['registration_phone'])) {
            $model->registrationPhone = $map['registration_phone'];
        }
        if (isset($map['certificate_date'])) {
            $model->certificateDate = $map['certificate_date'];
        }
        if (isset($map['login_phone'])) {
            $model->loginPhone = $map['login_phone'];
        }
        if (isset($map['registration_cert'])) {
            $model->registrationCert = $map['registration_cert'];
        }
        if (isset($map['login_cert'])) {
            $model->loginCert = $map['login_cert'];
        }
        if (isset($map['registration_date'])) {
            $model->registrationDate = $map['registration_date'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['email_address'])) {
            $model->emailAddress = $map['email_address'];
        }
        if (isset($map['imei'])) {
            $model->imei = $map['imei'];
        }
        if (isset($map['imsi'])) {
            $model->imsi = $map['imsi'];
        }
        if (isset($map['mac_address'])) {
            $model->macAddress = $map['mac_address'];
        }
        if (isset($map['apdid'])) {
            $model->apdid = $map['apdid'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['sales_amount'])) {
            $model->salesAmount = $map['sales_amount'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['mailing_phone'])) {
            $model->mailingPhone = $map['mailing_phone'];
        }
        if (isset($map['mailing_address'])) {
            $model->mailingAddress = $map['mailing_address'];
        }
        if (isset($map['is_employee'])) {
            $model->isEmployee = $map['is_employee'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['isv_pid'])) {
            $model->isvPid = $map['isv_pid'];
        }
        if (isset($map['store_mcc_desc'])) {
            $model->storeMccDesc = $map['store_mcc_desc'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['order_items_info_list'])) {
            if (!empty($map['order_items_info_list'])) {
                $model->orderItemsInfoList = [];
                $n                         = 0;
                foreach ($map['order_items_info_list'] as $item) {
                    $model->orderItemsInfoList[$n++] = null !== $item ? ScalperQueryOrderItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
