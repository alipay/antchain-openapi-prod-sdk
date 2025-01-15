<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AwardingQueryModel extends Model
{
    // 对方支付宝账户 uid，用于表示两个账户在业务交互中的对方账户，如人传人活动用户A会拉用户B来注册领奖，其中用户B为对方账户
    /**
     * @example 208834525645xxxx
     *
     * @var string
     */
    public $opposingUserid;

    // 对方支付宝账户openid，营销发奖风险识别场景，userid 与 open_id 至少传入一个
    /**
     * @example 021uU206oUtUsckXA1rpUpiWpFwNTOFzX00gV0PIrkWxxxx
     *
     * @var string
     */
    public $opposingOpenId;

    // 服务二级分类
    /**
     * @example category1
     *
     * @var string
     */
    public $serviceCategory;

    // 服务商 pid
    /**
     * @example 208834525645xxxx
     *
     * @var string
     */
    public $isvPid;

    // 银行卡号
    /**
     * @example 6228xxxxxxxxxxxxx13
     *
     * @var string
     */
    public $bankCardNo;

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

    // 金额，用户购买或使用服务时产生的具体金额，单位：分
    /**
     * @example 1000
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

    // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
    /**
     * @example CATERING
     *
     * @var string
     */
    public $storeMccDesc;

    // 消费者 id，外部会员账号
    /**
     * @example 1232xxxx
     *
     * @var string
     */
    public $customerId;

    // 填入想要咨询风控的二维码值，需为唯一值
    /**
     * @example http://xxxxxx/b/26acfacxxxxxx
     *
     * @var string
     */
    public $qrCode;
    protected $_name = [
        'opposingUserid'  => 'opposing_userid',
        'opposingOpenId'  => 'opposing_open_id',
        'serviceCategory' => 'service_category',
        'isvPid'          => 'isv_pid',
        'bankCardNo'      => 'bank_card_no',
        'imei'            => 'imei',
        'imsi'            => 'imsi',
        'salesAmount'     => 'sales_amount',
        'userName'        => 'user_name',
        'storeMccDesc'    => 'store_mcc_desc',
        'customerId'      => 'customer_id',
        'qrCode'          => 'qr_code',
    ];

    public function validate()
    {
        Model::validateMaxLength('opposingUserid', $this->opposingUserid, 128);
        Model::validateMaxLength('opposingOpenId', $this->opposingOpenId, 128);
        Model::validateMaxLength('serviceCategory', $this->serviceCategory, 128);
        Model::validateMaxLength('isvPid', $this->isvPid, 128);
        Model::validateMaxLength('bankCardNo', $this->bankCardNo, 128);
        Model::validateMaxLength('imei', $this->imei, 128);
        Model::validateMaxLength('imsi', $this->imsi, 128);
        Model::validateMaxLength('userName', $this->userName, 128);
        Model::validateMaxLength('storeMccDesc', $this->storeMccDesc, 30);
        Model::validateMaxLength('customerId', $this->customerId, 128);
        Model::validateMaxLength('qrCode', $this->qrCode, 256);
        Model::validateMinLength('opposingUserid', $this->opposingUserid, 1);
        Model::validateMinLength('opposingOpenId', $this->opposingOpenId, 1);
        Model::validateMinLength('serviceCategory', $this->serviceCategory, 1);
        Model::validateMinLength('isvPid', $this->isvPid, 1);
        Model::validateMinLength('bankCardNo', $this->bankCardNo, 1);
        Model::validateMinLength('imei', $this->imei, 1);
        Model::validateMinLength('imsi', $this->imsi, 1);
        Model::validateMinLength('userName', $this->userName, 1);
        Model::validateMinLength('storeMccDesc', $this->storeMccDesc, 1);
        Model::validateMinLength('customerId', $this->customerId, 1);
        Model::validateMinLength('qrCode', $this->qrCode, 1);
        Model::validateMaximum('salesAmount', $this->salesAmount, 10000000);
        Model::validateMinimum('salesAmount', $this->salesAmount, 1);
        Model::validateRequired('customerId', $this->customerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->opposingUserid) {
            $res['opposing_userid'] = $this->opposingUserid;
        }
        if (null !== $this->opposingOpenId) {
            $res['opposing_open_id'] = $this->opposingOpenId;
        }
        if (null !== $this->serviceCategory) {
            $res['service_category'] = $this->serviceCategory;
        }
        if (null !== $this->isvPid) {
            $res['isv_pid'] = $this->isvPid;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->imei) {
            $res['imei'] = $this->imei;
        }
        if (null !== $this->imsi) {
            $res['imsi'] = $this->imsi;
        }
        if (null !== $this->salesAmount) {
            $res['sales_amount'] = $this->salesAmount;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->storeMccDesc) {
            $res['store_mcc_desc'] = $this->storeMccDesc;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->qrCode) {
            $res['qr_code'] = $this->qrCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AwardingQueryModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['opposing_userid'])) {
            $model->opposingUserid = $map['opposing_userid'];
        }
        if (isset($map['opposing_open_id'])) {
            $model->opposingOpenId = $map['opposing_open_id'];
        }
        if (isset($map['service_category'])) {
            $model->serviceCategory = $map['service_category'];
        }
        if (isset($map['isv_pid'])) {
            $model->isvPid = $map['isv_pid'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['imei'])) {
            $model->imei = $map['imei'];
        }
        if (isset($map['imsi'])) {
            $model->imsi = $map['imsi'];
        }
        if (isset($map['sales_amount'])) {
            $model->salesAmount = $map['sales_amount'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['store_mcc_desc'])) {
            $model->storeMccDesc = $map['store_mcc_desc'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['qr_code'])) {
            $model->qrCode = $map['qr_code'];
        }

        return $model;
    }
}
