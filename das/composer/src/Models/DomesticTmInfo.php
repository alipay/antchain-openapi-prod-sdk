<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DomesticTmInfo extends Model
{
    // 商标名称
    /**
     * @example 商标名称
     *
     * @var string
     */
    public $tmName;

    // 注册证号
    /**
     * @example 123456789
     *
     * @var string
     */
    public $tmRegNum;

    // 国际分类
    /**
     * @example 16
     *
     * @var string
     */
    public $intCls;

    // 商标状态
    /**
     * @example status
     *
     * @var string
     */
    public $tmStatus;

    // 专用期开始时间
    /**
     * @example 2021-10-07T00:00:00
     *
     * @var string
     */
    public $propertyBgnDate;

    // 注册日期
    //
    /**
     * @example 2022-08-28T00:00:00
     *
     * @var string
     */
    public $regDate;

    // 是否共有商标
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isShare;

    // 商标共有人信息(共有商标才有该数据)
    /**
     * @example
     *
     * @var TmCoownerInfo[]
     */
    public $coownerInfos;

    // 专用期结束时间
    /**
     * @example 2031-10-06T00:00:00
     *
     * @var string
     */
    public $propertyEndDate;

    // 商标类别
    /**
     * @example 0001
     *
     * @var string
     */
    public $formType;

    // 权利人中文名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $ownerNameCn;

    // 权利人中文地址
    /**
     * @example 中文地址信息
     *
     * @var string
     */
    public $ownerAddrCn;

    // 权利人英文名称
    /**
     * @example Bob
     *
     * @var string
     */
    public $ownerNameEn;

    // 权利人英文地址
    /**
     * @example 英文地址信息
     *
     * @var string
     */
    public $ownerAddrEn;

    // 申请人中文名称
    /**
     * @example 张*
     *
     * @var string
     */
    public $applicantNameCn;

    // 申请人中文地址
    /**
     * @example 中文地址信息
     *
     * @var string
     */
    public $applicantAddrCn;

    // 申请人外文名称
    /**
     * @example Bob
     *
     * @var string
     */
    public $applicantNameEn;

    // 申请人英文地址
    /**
     * @example 英文地址信息
     *
     * @var string
     */
    public $applicantAddrEn;

    // 权利人社会信用统一代码
    /**
     * @example 1234567W
     *
     * @var string
     */
    public $ownerUscc;

    // 商标唯一标识码
    /**
     * @example 123456
     *
     * @var string
     */
    public $tid;
    protected $_name = [
        'tmName'          => 'tm_name',
        'tmRegNum'        => 'tm_reg_num',
        'intCls'          => 'int_cls',
        'tmStatus'        => 'tm_status',
        'propertyBgnDate' => 'property_bgn_date',
        'regDate'         => 'reg_date',
        'isShare'         => 'is_share',
        'coownerInfos'    => 'coowner_infos',
        'propertyEndDate' => 'property_end_date',
        'formType'        => 'form_type',
        'ownerNameCn'     => 'owner_name_cn',
        'ownerAddrCn'     => 'owner_addr_cn',
        'ownerNameEn'     => 'owner_name_en',
        'ownerAddrEn'     => 'owner_addr_en',
        'applicantNameCn' => 'applicant_name_cn',
        'applicantAddrCn' => 'applicant_addr_cn',
        'applicantNameEn' => 'applicant_name_en',
        'applicantAddrEn' => 'applicant_addr_en',
        'ownerUscc'       => 'owner_uscc',
        'tid'             => 'tid',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tmName) {
            $res['tm_name'] = $this->tmName;
        }
        if (null !== $this->tmRegNum) {
            $res['tm_reg_num'] = $this->tmRegNum;
        }
        if (null !== $this->intCls) {
            $res['int_cls'] = $this->intCls;
        }
        if (null !== $this->tmStatus) {
            $res['tm_status'] = $this->tmStatus;
        }
        if (null !== $this->propertyBgnDate) {
            $res['property_bgn_date'] = $this->propertyBgnDate;
        }
        if (null !== $this->regDate) {
            $res['reg_date'] = $this->regDate;
        }
        if (null !== $this->isShare) {
            $res['is_share'] = $this->isShare;
        }
        if (null !== $this->coownerInfos) {
            $res['coowner_infos'] = [];
            if (null !== $this->coownerInfos && \is_array($this->coownerInfos)) {
                $n = 0;
                foreach ($this->coownerInfos as $item) {
                    $res['coowner_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->propertyEndDate) {
            $res['property_end_date'] = $this->propertyEndDate;
        }
        if (null !== $this->formType) {
            $res['form_type'] = $this->formType;
        }
        if (null !== $this->ownerNameCn) {
            $res['owner_name_cn'] = $this->ownerNameCn;
        }
        if (null !== $this->ownerAddrCn) {
            $res['owner_addr_cn'] = $this->ownerAddrCn;
        }
        if (null !== $this->ownerNameEn) {
            $res['owner_name_en'] = $this->ownerNameEn;
        }
        if (null !== $this->ownerAddrEn) {
            $res['owner_addr_en'] = $this->ownerAddrEn;
        }
        if (null !== $this->applicantNameCn) {
            $res['applicant_name_cn'] = $this->applicantNameCn;
        }
        if (null !== $this->applicantAddrCn) {
            $res['applicant_addr_cn'] = $this->applicantAddrCn;
        }
        if (null !== $this->applicantNameEn) {
            $res['applicant_name_en'] = $this->applicantNameEn;
        }
        if (null !== $this->applicantAddrEn) {
            $res['applicant_addr_en'] = $this->applicantAddrEn;
        }
        if (null !== $this->ownerUscc) {
            $res['owner_uscc'] = $this->ownerUscc;
        }
        if (null !== $this->tid) {
            $res['tid'] = $this->tid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DomesticTmInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tm_name'])) {
            $model->tmName = $map['tm_name'];
        }
        if (isset($map['tm_reg_num'])) {
            $model->tmRegNum = $map['tm_reg_num'];
        }
        if (isset($map['int_cls'])) {
            $model->intCls = $map['int_cls'];
        }
        if (isset($map['tm_status'])) {
            $model->tmStatus = $map['tm_status'];
        }
        if (isset($map['property_bgn_date'])) {
            $model->propertyBgnDate = $map['property_bgn_date'];
        }
        if (isset($map['reg_date'])) {
            $model->regDate = $map['reg_date'];
        }
        if (isset($map['is_share'])) {
            $model->isShare = $map['is_share'];
        }
        if (isset($map['coowner_infos'])) {
            if (!empty($map['coowner_infos'])) {
                $model->coownerInfos = [];
                $n                   = 0;
                foreach ($map['coowner_infos'] as $item) {
                    $model->coownerInfos[$n++] = null !== $item ? TmCoownerInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['property_end_date'])) {
            $model->propertyEndDate = $map['property_end_date'];
        }
        if (isset($map['form_type'])) {
            $model->formType = $map['form_type'];
        }
        if (isset($map['owner_name_cn'])) {
            $model->ownerNameCn = $map['owner_name_cn'];
        }
        if (isset($map['owner_addr_cn'])) {
            $model->ownerAddrCn = $map['owner_addr_cn'];
        }
        if (isset($map['owner_name_en'])) {
            $model->ownerNameEn = $map['owner_name_en'];
        }
        if (isset($map['owner_addr_en'])) {
            $model->ownerAddrEn = $map['owner_addr_en'];
        }
        if (isset($map['applicant_name_cn'])) {
            $model->applicantNameCn = $map['applicant_name_cn'];
        }
        if (isset($map['applicant_addr_cn'])) {
            $model->applicantAddrCn = $map['applicant_addr_cn'];
        }
        if (isset($map['applicant_name_en'])) {
            $model->applicantNameEn = $map['applicant_name_en'];
        }
        if (isset($map['applicant_addr_en'])) {
            $model->applicantAddrEn = $map['applicant_addr_en'];
        }
        if (isset($map['owner_uscc'])) {
            $model->ownerUscc = $map['owner_uscc'];
        }
        if (isset($map['tid'])) {
            $model->tid = $map['tid'];
        }

        return $model;
    }
}
