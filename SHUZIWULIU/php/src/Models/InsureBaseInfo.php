<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class InsureBaseInfo extends Model {
    protected $_name = [
        'tbrName' => 'tbr_name',
        'tbrIdNo' => 'tbr_id_no',
        'tbrIdType' => 'tbr_id_type',
        'tbrTel' => 'tbr_tel',
        'tbrAddr' => 'tbr_addr',
        'tbrEmail' => 'tbr_email',
        'bbrName' => 'bbr_name',
        'bbrIdType' => 'bbr_id_type',
        'bbrIdNo' => 'bbr_id_no',
        'bbrTel' => 'bbr_tel',
        'bbrAddr' => 'bbr_addr',
        'preMium' => 'pre_mium',
        'effDate' => 'eff_date',
        'termDate' => 'term_date',
        'idenrifyPeriodStart' => 'idenrify_period_start',
        'identifyPeriodEnd' => 'identify_period_end',
    ];
    public function validate() {
        Model::validatePattern('effDate', $this->effDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('termDate', $this->termDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('idenrifyPeriodStart', $this->idenrifyPeriodStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('identifyPeriodEnd', $this->identifyPeriodEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->tbrName) {
            $res['tbr_name'] = $this->tbrName;
        }
        if (null !== $this->tbrIdNo) {
            $res['tbr_id_no'] = $this->tbrIdNo;
        }
        if (null !== $this->tbrIdType) {
            $res['tbr_id_type'] = $this->tbrIdType;
        }
        if (null !== $this->tbrTel) {
            $res['tbr_tel'] = $this->tbrTel;
        }
        if (null !== $this->tbrAddr) {
            $res['tbr_addr'] = $this->tbrAddr;
        }
        if (null !== $this->tbrEmail) {
            $res['tbr_email'] = $this->tbrEmail;
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
        if (null !== $this->bbrTel) {
            $res['bbr_tel'] = $this->bbrTel;
        }
        if (null !== $this->bbrAddr) {
            $res['bbr_addr'] = $this->bbrAddr;
        }
        if (null !== $this->preMium) {
            $res['pre_mium'] = $this->preMium;
        }
        if (null !== $this->effDate) {
            $res['eff_date'] = $this->effDate;
        }
        if (null !== $this->termDate) {
            $res['term_date'] = $this->termDate;
        }
        if (null !== $this->idenrifyPeriodStart) {
            $res['idenrify_period_start'] = $this->idenrifyPeriodStart;
        }
        if (null !== $this->identifyPeriodEnd) {
            $res['identify_period_end'] = $this->identifyPeriodEnd;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InsureBaseInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tbr_name'])){
            $model->tbrName = $map['tbr_name'];
        }
        if(isset($map['tbr_id_no'])){
            $model->tbrIdNo = $map['tbr_id_no'];
        }
        if(isset($map['tbr_id_type'])){
            $model->tbrIdType = $map['tbr_id_type'];
        }
        if(isset($map['tbr_tel'])){
            $model->tbrTel = $map['tbr_tel'];
        }
        if(isset($map['tbr_addr'])){
            $model->tbrAddr = $map['tbr_addr'];
        }
        if(isset($map['tbr_email'])){
            $model->tbrEmail = $map['tbr_email'];
        }
        if(isset($map['bbr_name'])){
            $model->bbrName = $map['bbr_name'];
        }
        if(isset($map['bbr_id_type'])){
            $model->bbrIdType = $map['bbr_id_type'];
        }
        if(isset($map['bbr_id_no'])){
            $model->bbrIdNo = $map['bbr_id_no'];
        }
        if(isset($map['bbr_tel'])){
            $model->bbrTel = $map['bbr_tel'];
        }
        if(isset($map['bbr_addr'])){
            $model->bbrAddr = $map['bbr_addr'];
        }
        if(isset($map['pre_mium'])){
            $model->preMium = $map['pre_mium'];
        }
        if(isset($map['eff_date'])){
            $model->effDate = $map['eff_date'];
        }
        if(isset($map['term_date'])){
            $model->termDate = $map['term_date'];
        }
        if(isset($map['idenrify_period_start'])){
            $model->idenrifyPeriodStart = $map['idenrify_period_start'];
        }
        if(isset($map['identify_period_end'])){
            $model->identifyPeriodEnd = $map['identify_period_end'];
        }
        return $model;
    }
    // 投保人姓名
    /**
     * @example 张三
     * @var string
     */
    public $tbrName;

    // 投保人证件号
    /**
     * @example 371023443423131
     * @var string
     */
    public $tbrIdNo;

    // 投保人证件类型
    /**
     * @example 身份证
     * @var string
     */
    public $tbrIdType;

    // 投保人联系电话
    /**
     * @example 15000000000
     * @var string
     */
    public $tbrTel;

    // 投保人地址
    /**
     * @example 北京市某某区
     * @var string
     */
    public $tbrAddr;

    // 投保人邮箱
    /**
     * @example xxx@email.com
     * @var string
     */
    public $tbrEmail;

    // 被保险人姓名
    /**
     * @example 李四
     * @var string
     */
    public $bbrName;

    // 被保险人证件类型
    /**
     * @example 身份证
     * @var string
     */
    public $bbrIdType;

    // 被保险人证件号码
    /**
     * @example 3710221223232322
     * @var string
     */
    public $bbrIdNo;

    // 被保险人联系电话
    /**
     * @example 150002323231
     * @var string
     */
    public $bbrTel;

    // 被保险人地址
    /**
     * @example 北京市新校区
     * @var string
     */
    public $bbrAddr;

    // 含税保费(元)，小数点两位
    /**
     * @example 12.01
     * @var string
     */
    public $preMium;

    // 保险起期
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $effDate;

    // 保险止期
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $termDate;

    // 投保人证件类型有效起期
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $idenrifyPeriodStart;

    // 投保人证件类型有效止期
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $identifyPeriodEnd;

}
