<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class QueryYouhuiTemplateResponse extends Model
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

    // 模板类型:APPLY, NORMAL
    /**
     * @var string
     */
    public $tType;

    // 币种
    /**
     * @var string
     */
    public $currency;

    // 模板ID
    /**
     * @var int
     */
    public $id;

    // 模板名称
    /**
     * @var string
     */
    public $tName;

    // 使用场景
    /**
     * @var string
     */
    public $tUseScene;

    // 模板开始时间
    /**
     * @var string
     */
    public $tStartTime;

    // 模板有效结束时间
    /**
     * @var string
     */
    public $tEndTime;

    // 优惠券允许发放的总数量
    /**
     * @var string
     */
    public $yhMaxRelease;

    // 券类型
    /**
     * @var string
     */
    public $yhType;

    // 满减条件金额(单位:元)， 如满200
    /**
     * @var string
     */
    public $yhCertainMoney;

    // 生成券的面额(单位:元)
    /**
     * @var string
     */
    public $yhAmount;

    // 折扣， 如: 0.75 取值范围(0, 1)
    /**
     * @var string
     */
    public $yhDiscountRate;

    // 优惠券使用次数 , 0表示无限制
    /**
     * @var string
     */
    public $yhUsageCount;

    // 相对时间，绝对时间ABSOLUTE/RELATIVE
    /**
     * @var string
     */
    public $yhValidityType;

    // 优惠券开始时间 yhValidityType=ABSOLUTE 不能为空, 精确到秒
    /**
     * @var string
     */
    public $yhStartTime;

    // 有效期结束时间， yhValidityType=ABSOLUTE 不能为空, 精确到秒
    /**
     * @var string
     */
    public $yhEndTime;

    // 有效时间——相对（单位秒），如果start_time为空，优惠券的有效期从生成的当天开始计算， 如果start_time不为空，优惠关的有效期从start_time开始算
    /**
     * @var int
     */
    public $yhRelativeSecond;

    // 每人限领数量
    /**
     * @var int
     */
    public $yhPerLimitNum;

    // 优惠券通用类型，UNIVERSAL通用券；NONUNIVERSAL非通用券
    /**
     * @var string
     */
    public $yhUniversalType;

    // 模板状态 APPROVED审批通过，生效中
    /**
     * @var string
     */
    public $tStatus;

    // 优惠券发券总额、总数量控制
    /**
     * @var string
     */
    public $yhControlType;

    // 申请原因
    /**
     * @var string
     */
    public $tReason;

    // 优惠条件备注，显示用
    /**
     * @var string
     */
    public $yhDescription;

    // 创建人, 系统操作为 应用名, 员工操作设置为工号
    /**
     * @var string
     */
    public $tCreator;

    // 最后修改人, 系统操作为 应用名, 员工操作设置为工号
    /**
     * @var string
     */
    public $tModifier;

    // 创建时间
    /**
     * @var string
     */
    public $tGmtCreate;

    // 最后修改时间
    /**
     * @var string
     */
    public $tGmtModified;

    // 商品规格CODE。 限定商品类型时， 适用的商品集合， 通用券( yhUniversalType=NONUNIVERSAL)不能为空
    /**
     * @var string[]
     */
    public $itemCodeSet;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'tType'            => 't_type',
        'currency'         => 'currency',
        'id'               => 'id',
        'tName'            => 't_name',
        'tUseScene'        => 't_use_scene',
        'tStartTime'       => 't_start_time',
        'tEndTime'         => 't_end_time',
        'yhMaxRelease'     => 'yh_max_release',
        'yhType'           => 'yh_type',
        'yhCertainMoney'   => 'yh_certain_money',
        'yhAmount'         => 'yh_amount',
        'yhDiscountRate'   => 'yh_discount_rate',
        'yhUsageCount'     => 'yh_usage_count',
        'yhValidityType'   => 'yh_validity_type',
        'yhStartTime'      => 'yh_start_time',
        'yhEndTime'        => 'yh_end_time',
        'yhRelativeSecond' => 'yh_relative_second',
        'yhPerLimitNum'    => 'yh_per_limit_num',
        'yhUniversalType'  => 'yh_universal_type',
        'tStatus'          => 't_status',
        'yhControlType'    => 'yh_control_type',
        'tReason'          => 't_reason',
        'yhDescription'    => 'yh_description',
        'tCreator'         => 't_creator',
        'tModifier'        => 't_modifier',
        'tGmtCreate'       => 't_gmt_create',
        'tGmtModified'     => 't_gmt_modified',
        'itemCodeSet'      => 'item_code_set',
    ];

    public function validate()
    {
        Model::validatePattern('tStartTime', $this->tStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('tEndTime', $this->tEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('yhStartTime', $this->yhStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('yhEndTime', $this->yhEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('tGmtCreate', $this->tGmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('tGmtModified', $this->tGmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->tType) {
            $res['t_type'] = $this->tType;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tName) {
            $res['t_name'] = $this->tName;
        }
        if (null !== $this->tUseScene) {
            $res['t_use_scene'] = $this->tUseScene;
        }
        if (null !== $this->tStartTime) {
            $res['t_start_time'] = $this->tStartTime;
        }
        if (null !== $this->tEndTime) {
            $res['t_end_time'] = $this->tEndTime;
        }
        if (null !== $this->yhMaxRelease) {
            $res['yh_max_release'] = $this->yhMaxRelease;
        }
        if (null !== $this->yhType) {
            $res['yh_type'] = $this->yhType;
        }
        if (null !== $this->yhCertainMoney) {
            $res['yh_certain_money'] = $this->yhCertainMoney;
        }
        if (null !== $this->yhAmount) {
            $res['yh_amount'] = $this->yhAmount;
        }
        if (null !== $this->yhDiscountRate) {
            $res['yh_discount_rate'] = $this->yhDiscountRate;
        }
        if (null !== $this->yhUsageCount) {
            $res['yh_usage_count'] = $this->yhUsageCount;
        }
        if (null !== $this->yhValidityType) {
            $res['yh_validity_type'] = $this->yhValidityType;
        }
        if (null !== $this->yhStartTime) {
            $res['yh_start_time'] = $this->yhStartTime;
        }
        if (null !== $this->yhEndTime) {
            $res['yh_end_time'] = $this->yhEndTime;
        }
        if (null !== $this->yhRelativeSecond) {
            $res['yh_relative_second'] = $this->yhRelativeSecond;
        }
        if (null !== $this->yhPerLimitNum) {
            $res['yh_per_limit_num'] = $this->yhPerLimitNum;
        }
        if (null !== $this->yhUniversalType) {
            $res['yh_universal_type'] = $this->yhUniversalType;
        }
        if (null !== $this->tStatus) {
            $res['t_status'] = $this->tStatus;
        }
        if (null !== $this->yhControlType) {
            $res['yh_control_type'] = $this->yhControlType;
        }
        if (null !== $this->tReason) {
            $res['t_reason'] = $this->tReason;
        }
        if (null !== $this->yhDescription) {
            $res['yh_description'] = $this->yhDescription;
        }
        if (null !== $this->tCreator) {
            $res['t_creator'] = $this->tCreator;
        }
        if (null !== $this->tModifier) {
            $res['t_modifier'] = $this->tModifier;
        }
        if (null !== $this->tGmtCreate) {
            $res['t_gmt_create'] = $this->tGmtCreate;
        }
        if (null !== $this->tGmtModified) {
            $res['t_gmt_modified'] = $this->tGmtModified;
        }
        if (null !== $this->itemCodeSet) {
            $res['item_code_set'] = $this->itemCodeSet;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryYouhuiTemplateResponse
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
        if (isset($map['t_type'])) {
            $model->tType = $map['t_type'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['t_name'])) {
            $model->tName = $map['t_name'];
        }
        if (isset($map['t_use_scene'])) {
            $model->tUseScene = $map['t_use_scene'];
        }
        if (isset($map['t_start_time'])) {
            $model->tStartTime = $map['t_start_time'];
        }
        if (isset($map['t_end_time'])) {
            $model->tEndTime = $map['t_end_time'];
        }
        if (isset($map['yh_max_release'])) {
            $model->yhMaxRelease = $map['yh_max_release'];
        }
        if (isset($map['yh_type'])) {
            $model->yhType = $map['yh_type'];
        }
        if (isset($map['yh_certain_money'])) {
            $model->yhCertainMoney = $map['yh_certain_money'];
        }
        if (isset($map['yh_amount'])) {
            $model->yhAmount = $map['yh_amount'];
        }
        if (isset($map['yh_discount_rate'])) {
            $model->yhDiscountRate = $map['yh_discount_rate'];
        }
        if (isset($map['yh_usage_count'])) {
            $model->yhUsageCount = $map['yh_usage_count'];
        }
        if (isset($map['yh_validity_type'])) {
            $model->yhValidityType = $map['yh_validity_type'];
        }
        if (isset($map['yh_start_time'])) {
            $model->yhStartTime = $map['yh_start_time'];
        }
        if (isset($map['yh_end_time'])) {
            $model->yhEndTime = $map['yh_end_time'];
        }
        if (isset($map['yh_relative_second'])) {
            $model->yhRelativeSecond = $map['yh_relative_second'];
        }
        if (isset($map['yh_per_limit_num'])) {
            $model->yhPerLimitNum = $map['yh_per_limit_num'];
        }
        if (isset($map['yh_universal_type'])) {
            $model->yhUniversalType = $map['yh_universal_type'];
        }
        if (isset($map['t_status'])) {
            $model->tStatus = $map['t_status'];
        }
        if (isset($map['yh_control_type'])) {
            $model->yhControlType = $map['yh_control_type'];
        }
        if (isset($map['t_reason'])) {
            $model->tReason = $map['t_reason'];
        }
        if (isset($map['yh_description'])) {
            $model->yhDescription = $map['yh_description'];
        }
        if (isset($map['t_creator'])) {
            $model->tCreator = $map['t_creator'];
        }
        if (isset($map['t_modifier'])) {
            $model->tModifier = $map['t_modifier'];
        }
        if (isset($map['t_gmt_create'])) {
            $model->tGmtCreate = $map['t_gmt_create'];
        }
        if (isset($map['t_gmt_modified'])) {
            $model->tGmtModified = $map['t_gmt_modified'];
        }
        if (isset($map['item_code_set'])) {
            if (!empty($map['item_code_set'])) {
                $model->itemCodeSet = $map['item_code_set'];
            }
        }

        return $model;
    }
}
