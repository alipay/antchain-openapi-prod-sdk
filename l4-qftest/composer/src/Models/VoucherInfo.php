<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QFTEST\Models;

use AlibabaCloud\Tea\Model;

class VoucherInfo extends Model
{
    // 券id
    /**
     * @example 20250909000730029301000D462O
     *
     * @var string
     */
    public $voucherId;

    // 2088id
    /**
     * @example 2088502492801939
     *
     * @var string
     */
    public $userId;

    // 产品编码
    /**
     * @example COUPON
     *
     * @var string
     */
    public $productCode;

    // 资产编码
    /**
     * @example 资产编码
     *
     * @var string
     */
    public $assetsCode;

    // 券名称
    /**
     * @example 北京银行还款帮扶-满100减20
     *
     * @var string
     */
    public $name;

    // 券模板ID
    /**
     * @example 2025091500073001149600J6D74N
     *
     * @var string
     */
    public $templateId;

    // 发行人id
    /**
     * @example 2088702238164012
     *
     * @var string
     */
    public $publisherUserId;

    // 状态
    /**
     * @example ENABLED
     *
     * @var string
     */
    public $status;

    // 券生效时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtActive;

    // 券失效时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtExpired;

    // 展期
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtExtend;

    // 面额
    /**
     * @example 20
     *
     * @var string
     */
    public $totalAmount;

    // 门槛金额
    /**
     * @example 100
     *
     * @var string
     */
    public $floorAmount;

    // 总次数
    /**
     * @example 1
     *
     * @var int
     */
    public $totalCount;

    // 可用次数
    /**
     * @example 1
     *
     * @var int
     */
    public $availableCount;

    // 已使用次数
    /**
     * @example 0
     *
     * @var int
     */
    public $usedCount;

    // 券描述
    /**
     * @example {"description":"1、该帮扶金由机构权益运营发放，仅限在机构权益运营逾期还款场景使用，还款方式仅限于本人银行卡主动还款"}
     *
     * @var string
     */
    public $voucherDescription;

    // 券模板扩展信息
    /**
     * @example {"agentId":"7428691"}
     *
     * @var string
     */
    public $extendTemplateInfo;

    // 扩展信息
    /**
     * @example {"prizeType":"VOUCHER_PRIZE"}
     *
     * @var string
     */
    public $extendInfo;

    // 创建时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtModified;

    // 业务类型
    /**
     * @example REPAY_BJBANK_COUPON
     *
     * @var string
     */
    public $bizCode;

    // 收银台展示分组
    /**
     * @example REPAY_BJBANK
     *
     * @var string
     */
    public $groupCode;

    // 收银台展示分组名称
    /**
     * @example 北京银行还款帮扶
     *
     * @var string
     */
    public $groupCodeName;
    protected $_name = [
        'voucherId'          => 'voucher_id',
        'userId'             => 'user_id',
        'productCode'        => 'product_code',
        'assetsCode'         => 'assets_code',
        'name'               => 'name',
        'templateId'         => 'template_id',
        'publisherUserId'    => 'publisher_user_id',
        'status'             => 'status',
        'gmtActive'          => 'gmt_active',
        'gmtExpired'         => 'gmt_expired',
        'gmtExtend'          => 'gmt_extend',
        'totalAmount'        => 'total_amount',
        'floorAmount'        => 'floor_amount',
        'totalCount'         => 'total_count',
        'availableCount'     => 'available_count',
        'usedCount'          => 'used_count',
        'voucherDescription' => 'voucher_description',
        'extendTemplateInfo' => 'extend_template_info',
        'extendInfo'         => 'extend_info',
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'bizCode'            => 'biz_code',
        'groupCode'          => 'group_code',
        'groupCodeName'      => 'group_code_name',
    ];

    public function validate()
    {
        Model::validateRequired('voucherId', $this->voucherId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('assetsCode', $this->assetsCode, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('publisherUserId', $this->publisherUserId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('gmtActive', $this->gmtActive, true);
        Model::validateRequired('gmtExpired', $this->gmtExpired, true);
        Model::validateRequired('gmtExtend', $this->gmtExtend, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('floorAmount', $this->floorAmount, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('availableCount', $this->availableCount, true);
        Model::validateRequired('usedCount', $this->usedCount, true);
        Model::validateRequired('voucherDescription', $this->voucherDescription, true);
        Model::validateRequired('extendTemplateInfo', $this->extendTemplateInfo, true);
        Model::validateRequired('extendInfo', $this->extendInfo, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('groupCode', $this->groupCode, true);
        Model::validateRequired('groupCodeName', $this->groupCodeName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->voucherId) {
            $res['voucher_id'] = $this->voucherId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->assetsCode) {
            $res['assets_code'] = $this->assetsCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->publisherUserId) {
            $res['publisher_user_id'] = $this->publisherUserId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->gmtActive) {
            $res['gmt_active'] = $this->gmtActive;
        }
        if (null !== $this->gmtExpired) {
            $res['gmt_expired'] = $this->gmtExpired;
        }
        if (null !== $this->gmtExtend) {
            $res['gmt_extend'] = $this->gmtExtend;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->floorAmount) {
            $res['floor_amount'] = $this->floorAmount;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->availableCount) {
            $res['available_count'] = $this->availableCount;
        }
        if (null !== $this->usedCount) {
            $res['used_count'] = $this->usedCount;
        }
        if (null !== $this->voucherDescription) {
            $res['voucher_description'] = $this->voucherDescription;
        }
        if (null !== $this->extendTemplateInfo) {
            $res['extend_template_info'] = $this->extendTemplateInfo;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->groupCode) {
            $res['group_code'] = $this->groupCode;
        }
        if (null !== $this->groupCodeName) {
            $res['group_code_name'] = $this->groupCodeName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VoucherInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['voucher_id'])) {
            $model->voucherId = $map['voucher_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['assets_code'])) {
            $model->assetsCode = $map['assets_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['publisher_user_id'])) {
            $model->publisherUserId = $map['publisher_user_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['gmt_active'])) {
            $model->gmtActive = $map['gmt_active'];
        }
        if (isset($map['gmt_expired'])) {
            $model->gmtExpired = $map['gmt_expired'];
        }
        if (isset($map['gmt_extend'])) {
            $model->gmtExtend = $map['gmt_extend'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['floor_amount'])) {
            $model->floorAmount = $map['floor_amount'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['available_count'])) {
            $model->availableCount = $map['available_count'];
        }
        if (isset($map['used_count'])) {
            $model->usedCount = $map['used_count'];
        }
        if (isset($map['voucher_description'])) {
            $model->voucherDescription = $map['voucher_description'];
        }
        if (isset($map['extend_template_info'])) {
            $model->extendTemplateInfo = $map['extend_template_info'];
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = $map['extend_info'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['group_code'])) {
            $model->groupCode = $map['group_code'];
        }
        if (isset($map['group_code_name'])) {
            $model->groupCodeName = $map['group_code_name'];
        }

        return $model;
    }
}
